package homePage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class homePage {

	/*
	 * 1.This is the home page there are two option
	 * 2.Here We Can Choosing the option Auto Loan Portal
	 */
	@Keyword
	def homepage() {

		WebUI.waitForPageLoad(5)

		try {
			WebUI.verifyTextPresent("What system would you like to access?", false, FailureHandling.CONTINUE_ON_FAILURE)

			//To check the manage loan object is clickable
			WebUI.verifyElementClickable(findTestObject("Object Repository/HomePage/ManageLoans"),FailureHandling.CONTINUE_ON_FAILURE)

			//Checking the exit button on home page is clickable
			WebUI.verifyElementClickable(findTestObject("Object Repository/SignOutButton/exitIcon"),FailureHandling.CONTINUE_ON_FAILURE)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on the auto loan portal
			WebUI.click(findTestObject('Object Repository/HomePage/Auto_Loan_Portal'))

			if(WebUI.verifyElementPresent(findTestObject("Object Repository/ModeOfApplication/digitalApplication"), 2)) {
				WebUI.comment("We are getting two options")
			}else {
				WebUI.comment("We are in Wrong Page")
			}
		}catch(Exception e){
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}