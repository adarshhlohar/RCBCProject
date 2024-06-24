package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class letsGetStarted {


	@Keyword
	def letsGetStartedBtnFun() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.verifyTextPresent("Quick & easy Auto Loan Application with RCBC", false, FailureHandling.CONTINUE_ON_FAILURE)

			//Verifying whether the home button is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/LetsGetStarted/homeButton"), FailureHandling.CONTINUE_ON_FAILURE)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking let's get started
			WebUI.click(findTestObject('Object Repository/LetsGetStarted/lets_get_started'))

			//Providing delay
			WebUI.delay(3)

			if(WebUI.verifyElementPresent(findTestObject("Object Repository/Loan Details/loanDetail"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in Loan Detail Page")
			}else {
				WebUI.comment("We are in Wrong Page")
			}
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured.
			WebUI.takeScreenshot()
			println(e.toString())
		}
	}
}
