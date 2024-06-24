package autoLoanProtal
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class SelectAutoLoan {

	/*
	 * 1.This is Select Auto Loan page.
	 */

	@Keyword
	def clickToDigitalApplication(){
		try {
			WebUI.waitForPageLoad(10)
			WebUI.verifyTextPresent("Mode of Application", false, FailureHandling.CONTINUE_ON_FAILURE)

			//Verifying whether the paper based button is clickable or not
			WebUI.verifyElementClickable(findTestObject('Object Repository/ModeOfApplication/paperBased'))

			//Verifying whether the close button is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/ModeOfApplication/closeButton"))
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on digital application
			WebUI.click(findTestObject("Object Repository/ModeOfApplication/digitalApplication"))

			WebUI.delay(1)

			if(WebUI.verifyElementPresent(findTestObject('Object Repository/LetsGetStarted/lets_get_started'), 2)) {
				WebUI.comment("We are in Right Page")
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
