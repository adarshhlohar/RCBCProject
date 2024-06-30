package accountOfficer

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable






public class HomePageForibpsAO {

	/*
	 * 1.This is the home page
	 * 2.Here We choosing the AccountOfficer Resistration
	 */
	@Keyword
	def selectResistration() {
		try {
			WebUI.waitForPageLoad(5)

			//			WebUI.click(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/accountOfficer"))
			WebUI.delay(2)

			if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/accountOfficer"), 2)) {
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
					driver.switchTo().defaultContent()
					GlobalVariableUtil.captureScreenShotWithTime()

					WebUI.delay(1)
					WebUI.click(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/accountOfficer"))
					WebUI.delay(1)

					GlobalVariableUtil.captureScreenShotWithTime()
					//sorting by the latest first
					WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

					driver.switchTo().frame("iframe_Int42")

					Thread.sleep(100)

					driver.findElement(By.xpath(xpath)).click()

					WebUI.delay(2)
				}
			}else {
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_QK_CO7"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_User Desktop"))

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

					driver.findElement(By.xpath(xpath)).click()

					WebUI.delay(2)
				}else {
					WebUI.click(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/accountOfficer"))
					WebUI.delay(1)

					//sorting by the latest first
					WebUI.click(findTestObject("Object Repository/BackOffice/COMaker/ibpsHomePage/resistrationNo"))

					driver.switchTo().frame("iframe_Int42")

					Thread.sleep(100)

					driver.findElement(By.xpath(xpath)).click()

					WebUI.delay(2)
				}
				//				WebUI.click(findTestObject("Object Repository/BackOffice/AO/ibpsHomePage/resistrationNumberFirst"))
			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
