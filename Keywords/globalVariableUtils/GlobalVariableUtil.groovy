package globalVariableUtils

import java.awt.Rectangle
import java.awt.Robot
import java.awt.Toolkit
import java.awt.image.BufferedImage

import javax.imageio.ImageIO

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.ClientAnchor
import org.apache.poi.ss.usermodel.CreationHelper
import org.apache.poi.ss.usermodel.Drawing
import org.apache.poi.ss.usermodel.Picture
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.util.IOUtils
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class GlobalVariableUtil {

	private static final KeywordLogger logger = KeywordLogger.getInstance(GlobalVariableUtil.class)

	//	@Keyword
	def static saveGlobalVariable(String key, String value) {
		Properties props = new Properties()
		File file = new File(RunConfiguration.getProjectDir() + '/GlobalVariables.properties')

		if(file.exists()) {
			props.load(new FileInputStream(file))
		}

		props.setProperty(key, value)

		FileOutputStream out = new FileOutputStream(file)

		props.store(out, null)

		out.close()
	}


	@Keyword
	def static loadGlobalVariable() {
		Properties props = new Properties()

		File file = new File(RunConfiguration.getProjectDir() + '/GlobalVariables.properties')

		if(file.exists()) {
			props.load(new FileInputStream(file))
			props.each{ key , value ->
				GlobalVariable."${key}" = value
			}
		}
	}



	//@Keyword
	def static removeZerosAfterCI(String identifier) {
		println("Inside removeZerosAfterCI methode")
		// Check if identifier starts with "CI-"
		if(identifier.startsWith("CI-")) {
			// Remove "CI-" prefix
			String strippedIdentifier = identifier.substring(3)
			// Remove leading zeros
			strippedIdentifier = strippedIdentifier.replaceFirst("^0+","")
			// Reconstruct identifier with "CI-" prefix
			return "CI-" + strippedIdentifier
		}else{
			// Return identifier unchanged if it doesn't start with "CI-"
			return identifier
		}
	}




	//Capture screenshots
	@Keyword
	def static captureScreenShot(String ScreenShotPath, String screenshot_name) {
		WebUI.waitForPageLoad(10)
		WebUI.delay(5)
		try {
			Robot robot = new Robot()
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())
			BufferedImage screenCapture = robot.createScreenCapture(screenRect)
			String screenshotPath = WebUI.takeFullPageScreenshot(((ScreenShotPath + '/'+screenshot_name) + System.currentTimeMillis()) + '.png', FailureHandling.OPTIONAL)
			ImageIO.write(screenCapture, "png", new File(screenshotPath))
		} catch (Exception e) {
			logger.logFailed("Failed to capture screenshot : "+ e.getMessage())
		}
	}


	@Keyword
	def static createFolder(String folderName) {
		WebUI.delay(1)

		println "We are in create folder methode"

		String baseDir = "Screenshots/"

		Date today = new Date()

		String todaysDate = today.format('dd_MM_yy')

		String nowTime = today.format('hh_mm_ss')

		String createFolder = folderName + todaysDate + nowTime


		String folderPath = "Screenshots/" + createFolder

		saveGlobalVariable("FolderPath", folderPath)

		File folder = new File(folderPath)

		if(!folder.exists()) {
			folder.mkdir()
			println "Folder is created at " + folderPath
		}else {
			println "Folder is already Exists"
		}
	}



	//Capture screenshots
	@Keyword
	def static captureScreenShotWithTime() {
		try {
//			WebUI.delay(1)
			Date today = new Date()

			String todaysDate = today.format('dd_MM_yy')

			String nowTime = today.format('hh_mm_ss')

			loadGlobalVariable()
			
			WebUI.takeScreenshot(((((GlobalVariable.FolderPath + '/Regression') + todaysDate) + '_') + nowTime) + '.jpg')
			
			WebUI.delay(1)

		} catch (Exception e) {
			logger.logFailed("Failed to capture screenshot : "+ e.getMessage())
		}
	}




	@Keyword
	def static captureScreenShot() {
		// Set the path and name of the screenshot
		String screenshotPath = "D:\\fullPageSCreenshot\\"
		def currentDateTime = new Date()
		String screenshotName = currentDateTime.format("ddMMyy_HHmmss") + ".png"
		String fullScreenshotPath = screenshotPath + screenshotName
		String excelFilePath = screenshotPath + "Screenshots.xlsx"
		// Wait for the page to load and add a delay
		WebUI.waitForPageLoad(10)
		WebUI.delay(5)
		try {
			// Create a Robot instance to capture the screen
			Robot robot = new Robot()
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())
			BufferedImage screenCapture = robot.createScreenCapture(screenRect)
			// Write the captured image to the specified path
			ImageIO.write(screenCapture, "png", new File(fullScreenshotPath))
			// Create or open the Excel file
			File excelFile = new File(excelFilePath)
			Workbook workbook
			Sheet sheet
			if (excelFile.exists()) {
				workbook = WorkbookFactory.create(new FileInputStream(excelFile))
				sheet = workbook.getSheetAt(0)
			} else {
				workbook = new XSSFWorkbook()
				sheet = workbook.createSheet("Screenshots")
			}
			// Add screenshot to the Excel file
			int lastRowNum = sheet.getLastRowNum()
			int newRowNum = lastRowNum + 1
			Row row = sheet.createRow(newRowNum)
			Cell cell = row.createCell(0)
			cell.setCellValue(screenshotName)
			// Add the image to the Excel sheet
			InputStream inputStream = new FileInputStream(fullScreenshotPath)
			byte[] bytes = IOUtils.toByteArray(inputStream)
			int pictureIdx = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG)
			inputStream.close()
			CreationHelper helper = workbook.getCreationHelper()
			Drawing drawing = sheet.createDrawingPatriarch()
			ClientAnchor anchor = helper.createClientAnchor()
			anchor.setCol1(1) // Column B
			anchor.setRow1(newRowNum) // Current row
			Picture pict = drawing.createPicture(anchor, pictureIdx)
			// Resize the picture to fit its original size
			BufferedImage bufferedImage = ImageIO.read(new File(fullScreenshotPath))
			double imageWidth = bufferedImage.getWidth()
			double imageHeight = bufferedImage.getHeight()
			double excelColumnWidthInPixels = 100 // Default value, adjust as needed
			double excelRowHeightInPoints = 75 // Default value, adjust as needed
			// Adjust column width and row height
			double scale = Math.max(imageWidth / excelColumnWidthInPixels, imageHeight / excelRowHeightInPoints)
			sheet.setColumnWidth(1, (int) (imageWidth / scale * 256))
			row.setHeightInPoints((float) (imageHeight / scale))
			pict.resize() // Resize the picture to its actual size
			// Save the updated Excel file
			FileOutputStream fileOut = new FileOutputStream(excelFilePath)
			workbook.write(fileOut)
			fileOut.close()
			workbook.close()
			// Log the successful capture
			println("Screenshot captured and saved successfully: " + fullScreenshotPath)
		} catch (Exception e) {
			// Log any exceptions that occur
			println("Failed to capture screenshot: " + e.getMessage())
			e.printStackTrace()
		}
	}



	static TestObject createTestObject(String locatorType, String locatorValue) {
		TestObject testObject = new TestObject(locatorValue)
		testObject.addProperty(locatorType,ConditionType.EQUALS,locatorValue)
		return testObject
	}
}
