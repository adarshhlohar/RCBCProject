package loginPage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable

public class LoginPage {

	/**
	 * 1.This method is used for the login page
	 * 2.@Params : In this method we using url, username And password it is coming from the global profile QA
	 */
	@Keyword
	def login_Page()  {
		try {
			//It will open browser
			WebUI.openBrowser("")

			//Maximizing the window
			WebUI.maximizeWindow()

			//Here We Opening the Url on Brower
			WebUI.navigateToUrl(GlobalVariable.url)

			//Entering the username
			WebUI.setText(findTestObject("Object Repository/LoginPage/email"),GlobalVariable.username)

			//Entering the Encypted password for the in password field
			WebUI.setEncryptedText(findTestObject("Object Repository/LoginPage/password"), GlobalVariable.password)


			GlobalVariableUtil.createFolder("Portal")

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on the login button
			WebUI.click(findTestObject("Object Repository/LoginPage/log_in"))

			if(WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Auto_Loan_Portal'), 2)) {
				WebUI.comment("We are in Home Page")
			}else {
				WebUI.comment("We are in Wrong Page")
			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
