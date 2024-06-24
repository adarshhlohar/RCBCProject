package coMaker

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable

public class HomePageForibpsCOMaker {
	/*
	 * This is for the Home Page Encoder In ibps
	 */
	@Keyword
	def selectResistration() {
		WebUI.waitForPageLoad(5)

		WebUI.delay(2)

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/COMaker"), 3)) {
			//clicking on encoder
			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/COMaker"))


			GlobalVariableUtil.loadGlobalVariable();

			WebUI.delay(3)


			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)

			//sorting by the latest first
			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

			WebUI.delay(2)

			String xpath = "//label[text()='" + GlobalVariable.LOSID + "']"

			WebDriver driver = DriverFactory.getWebDriver()


			driver.switchTo().frame("iframe_Int42")

			Thread.sleep(100)

			driver.findElement(By.xpath(xpath)).click()

			//clicking on resistration
			//			WebUI.click(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/resistrationNumberFirst"))
		}else {
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_QK_CO7"))
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_User Desktop"))
			WebUI.delay(2)

			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/COMaker"))

			WebUI.delay(2)

			GlobalVariableUtil.loadGlobalVariable();

			WebUI.delay(3)


			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)


			//sorting by the latest first
			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

			WebUI.delay(2)

			String xpath = "//label[text()='" + GlobalVariable.LOSID + "']"

			WebDriver driver = DriverFactory.getWebDriver()


			driver.switchTo().frame("iframe_Int42")

			Thread.sleep(100)

			driver.findElement(By.xpath(xpath)).click()

			//clicking on resistration
			//			WebUI.click(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/resistrationNumberFirst"))
		}
	}
}