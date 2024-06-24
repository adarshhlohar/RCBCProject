package encoder

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable

public class HomePageForibpsEncoder {
	/*
	 * This is for the Home Page Encoder In ibps
	 */

	//	private static final KeywordLogger logger =  KeywordLogger.getInstance(HomePageForibpsEncoder.class)
	@Keyword
	def selectResistration() {
		WebUI.waitForPageLoad(5)

		WebUI.delay(2)

		GlobalVariableUtil.loadGlobalVariable();

		WebUI.delay(3)

		println(" ******* " + GlobalVariable.LOSID)

		WebUI.comment(" ******** " + GlobalVariable.LOSID)
		WebUI.delay(2)

		String xpath = "//label[text()='" + GlobalVariable.LOSID + "']"

		WebDriver driver = DriverFactory.getWebDriver()


		driver.switchTo().frame("iframe_Int42")

		Thread.sleep(100)

		List<WebElement> elements =  driver.findElements(By.xpath(xpath))

		println(elements.size())

		if(elements.size() > 0) {
			GlobalVariableUtil.captureScreenShotWithTime()
			driver.findElement(By.xpath(xpath)).click()

			WebUI.delay(2)
		}else {

			println("Inside else")
			//clicking on encoder

			driver.switchTo().defaultContent()

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ibpsHomePage/encoder"))

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()
			//sorting by the latest first
			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

			WebUI.delay(1)

			driver.switchTo().frame("iframe_Int42")

			Thread.sleep(100)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			driver.findElement(By.xpath(xpath)).click()

			WebUI.delay(2)
		}


		WebUI.delay(2)
	}
}
