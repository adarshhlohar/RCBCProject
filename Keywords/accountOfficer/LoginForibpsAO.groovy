package accountOfficer

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable



public class LoginForibpsAO {

	/*
	 * This is the Login of ibps for Account Officer
	 */

	@Keyword
	def login() {
		try {
			//Open browser
			WebUI.openBrowser("")

			//Maximizing the window
			WebUI.maximizeWindow()

			//Opening the Url on Brower
			WebUI.navigateToUrl(GlobalVariable.url)

			//Entering the username
			WebUI.setText(findTestObject("Object Repository/BackOffice/ibpsLogin/userName"),GlobalVariable.username)

			//Entering the Encypted password
			WebUI.setEncryptedText(findTestObject("Object Repository/BackOffice/ibpsLogin/password"), GlobalVariable.password)

			GlobalVariableUtil.createFolder("AccountOfficer")

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on the login button
			WebUI.click(findTestObject("Object Repository/BackOffice/ibpsLogin/loginButton"))

			WebUI.delay(2) //Wait for login confirmation

			if(WebUI.waitForElementVisible(findTestObject("Object Repository/BackOffice/ibpsLogin/text"), 2)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/ibpsLogin/yesLogin"))
			}
		}catch(Exception e) {
			//Failure ScreenShot when the Script is failed
			WebUI.takeScreenshot()
			//printing the failure reason in console
			println(e.toString())
		}
	}
}
