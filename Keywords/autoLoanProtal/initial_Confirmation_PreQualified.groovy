package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class initial_Confirmation_PreQualified {

	/*
	 * 1.This is initial confirmation pre qualified page. 
	 */

	@Keyword
	def initial_confirmation() {

		//Providing delay
		WebUI.waitForPageLoad(10)

		try {
			WebUI.verifyElementPresent(findTestObject("Object Repository/Initial_Confirmation _PreQualified/PreQualifiedMsg"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			//Verifying whether view credit advice document button is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/Initial_Confirmation _PreQualified/viewCreditAdviceDocument"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on okay
			WebUI.click(findTestObject('Object Repository/Initial_Confirmation _PreQualified/okay'))

			if(WebUI.verifyElementPresent(findTestObject("Object Repository/AdditionalInformationWithoutAPI/additionPageLogo"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in Addition page")
			}else {
				WebUI.comment("We are not on Addition page")
			}
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured.
			WebUI.takeScreenshot()
			println(e.toString())
		}
	}



	@Keyword
	def initial_confirmationForAmendment() {

		//Providing delay
		WebUI.waitForPageLoad(10)

		try {
			WebUI.delay(2)

			WebUI.switchToWindowIndex(2, FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.closeWindowIndex(2, FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.delay(1)

			WebUI.verifyElementPresent(findTestObject("Object Repository/Initial_Confirmation _PreQualified/PreQualifiedMsg"), 2, FailureHandling.CONTINUE_ON_FAILURE)

			//Verifying whether view credit advice document button is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/Initial_Confirmation _PreQualified/viewCreditAdviceDocument"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()
			//Clicking on okay
			if(WebUI.verifyElementPresent(findTestObject("Object Repository/AdditionalInformationWithoutAPI/additionPageLogo"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in Addition page")
			}else {
				WebUI.comment("We are not on Addition page")
			}
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured.
			WebUI.takeScreenshot()
			println(e.toString())
		}
	}
}
