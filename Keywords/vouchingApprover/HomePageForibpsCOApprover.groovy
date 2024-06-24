package vouchingApprover

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable



public class HomePageForibpsCOApprover {
	/*
	 * This is for the Home Page Encoder In ibps
	 */
	@Keyword
	def selectResistration() {
		WebUI.waitForPageLoad(5)

		WebUI.delay(1)

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/COApprover/ibpsHomePage/vouchingApprover"), 2)) {
			//clicking on encoder
			WebUI.click(findTestObject("Object Repository/BackOffice/COApprover/ibpsHomePage/vouchingApprover"))

			//sorting by the latest first
			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))


			GlobalVariableUtil.loadGlobalVariable();
			WebUI.delay(2)

			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)


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
			//clicking on encoder
			WebUI.click(findTestObject("Object Repository/BackOffice/COApprover/ibpsHomePage/vouchingApprover"))

			//sorting by the latest first
			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

			WebUI.delay(1)
			GlobalVariableUtil.loadGlobalVariable();
			WebUI.delay(2)

			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)


			String xpath = "//label[text()='" + GlobalVariable.LOSID + "']"

			WebDriver driver = DriverFactory.getWebDriver()


			driver.switchTo().frame("iframe_Int42")

			Thread.sleep(100)

			driver.findElement(By.xpath(xpath)).click()

			//clicking on resistration
			//			WebUI.click(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/resistrationNumberFirst"))

			WebUI.delay(2)
		}
	}
}
