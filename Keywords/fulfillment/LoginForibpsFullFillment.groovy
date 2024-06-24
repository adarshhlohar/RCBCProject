package fulfillment

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable

public class LoginForibpsFullFillment {

	@Keyword
	def login() {
		try {
			//It will open browser
			WebUI.openBrowser("")

			//Maximizing the window
			WebUI.maximizeWindow()

			//Here We Opening the Url on Brower
			WebUI.navigateToUrl(GlobalVariable.url)

			//Entering the username
			WebUI.setText(findTestObject("Object Repository/BackOffice/ibpsLogin/userName"),GlobalVariable.username)

			//Entering the Encypted password for the in password field
			WebUI.setEncryptedText(findTestObject("Object Repository/BackOffice/ibpsLogin/password"), GlobalVariable.password)

			GlobalVariableUtil.createFolder("Fulfillment")
			
			GlobalVariableUtil.captureScreenShotWithTime()
			
			//Clicking on the login button
			WebUI.click(findTestObject("Object Repository/BackOffice/ibpsLogin/loginButton"))

			WebUI.delay(2)

			if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/ibpsLogin/yesLogin"),2)) {

				WebUI.click(findTestObject("Object Repository/BackOffice/ibpsLogin/yesLogin"))
			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
