package fulfillment

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable




public class HomePageForibpsFullFillment {
	/*
	 * This is for the Home Page Encoder In ibps
	 */
	@Keyword
	def selectResistration() {
		WebUI.waitForPageLoad(5)

		WebUI.delay(1)
		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/Fulfillment/ibpsHomePage/fullfillment"), 2)) {

			WebUI.delay(1)
			GlobalVariableUtil.loadGlobalVariable();

			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)

			String xpath = "//label[text()='" + GlobalVariable.LOSID + "']"

			WebDriver driver = DriverFactory.getWebDriver()

			driver.switchTo().frame("iframe_Int42")

			Thread.sleep(100)

			List<WebElement> elements =  driver.findElements(By.xpath(xpath))

			println(elements.size())

			if(elements.size() > 0) {
				WebUI.delay(1)
				driver.findElement(By.xpath(xpath)).click()

				WebUI.delay(2)
			}else {
				driver.switchTo().defaultContent()
				GlobalVariableUtil.captureScreenShotWithTime()
				//clicking on encoder
				WebUI.click(findTestObject("Object Repository/BackOffice/Fulfillment/ibpsHomePage/fullfillment"))

				//sorting by the latest first
				WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

				driver.switchTo().frame("iframe_Int42")

				Thread.sleep(100)
				WebUI.delay(1)
				driver.findElement(By.xpath(xpath)).click()

				WebUI.delay(2)
			}
		}else {
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_QK_CO7"))
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_User Desktop"))

			WebUI.delay(1)
			GlobalVariableUtil.loadGlobalVariable();

			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)

			String xpath = "//label[text()='" + GlobalVariable.LOSID + "']"

			WebDriver driver = DriverFactory.getWebDriver()

			driver.switchTo().frame("iframe_Int42")

			Thread.sleep(100)

			List<WebElement> elements =  driver.findElements(By.xpath(xpath))

			println(elements.size())

			if(elements.size() > 0) {

				driver.findElement(By.xpath(xpath)).click()

				WebUI.delay(2)
			}else {
				//clicking on encoder
				WebUI.click(findTestObject("Object Repository/BackOffice/Fulfillment/ibpsHomePage/fullfillment"))

				//sorting by the latest first
				WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

				driver.switchTo().frame("iframe_Int42")

				Thread.sleep(100)

				driver.findElement(By.xpath(xpath)).click()

				WebUI.delay(2)
			}
		}
	}



	@Keyword
	def selectResistrationForBooking() {
		WebUI.waitForPageLoad(5)

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/Fulfillment/ibpsHomePage/fullfillment"), 2)) {

			WebUI.delay(1)
			GlobalVariableUtil.loadGlobalVariable();

			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)

			String xpath = "(//label[text()='" + GlobalVariable.LOSID + "'])[2]"


			WebUI.click(findTestObject("Object Repository/BackOffice/Fulfillment/ibpsHomePage/booking"))

			//sorting by the latest first
			WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

			WebDriver driver = DriverFactory.getWebDriver()

			driver.switchTo().frame("iframe_Int42")

			Thread.sleep(100)
			WebUI.delay(1)
			driver.findElement(By.xpath(xpath)).click()

			WebUI.delay(2)
		}else {
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_QK_CO7"))
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_User Desktop"))

			WebUI.delay(1)
			GlobalVariableUtil.loadGlobalVariable();

			println(" ******* " + GlobalVariable.LOSID)

			WebUI.comment(" ******** " + GlobalVariable.LOSID)

			String xpath = "//label[text()='" + GlobalVariable.LOSID + "']"

			WebDriver driver = DriverFactory.getWebDriver()

			driver.switchTo().frame("iframe_Int42")
		}
	}
}
