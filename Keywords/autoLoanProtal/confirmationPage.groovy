package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class confirmationPage {

	/*
	 * 1.This is Confirmation Page
	 */

	@Keyword
	def editOnConfirmationPage() {
		try {
			WebUI.waitForPageLoad(10)
			(WebUI.verifyElementPresent(findTestObject("Object Repository/confirmationPage/reviewLoanDetail"), 2,FailureHandling.CONTINUE_ON_FAILURE))
			//Verifying whether the auto loan details edit button is clickable or not
			WebUI.verifyElementClickable(findTestObject('Object Repository/confirmationPage/autoLoanAppDetailsEditBtn'),FailureHandling.CONTINUE_ON_FAILURE)

			//Verifying whether borrower details button is clickable or not
			WebUI.verifyElementClickable(findTestObject('Object Repository/confirmationPage/borrowerDetailsEditBtn'),FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.delay(1)
			
			GlobalVariableUtil.captureScreenShotWithTime()
			//Clicking on continue button
			WebUI.click(findTestObject('Object Repository/confirmationPage/continueBtn'))
			//			if(WebUI.verifyElementPresent(findTestObject("Object Repository/Initial_Confirmation/oneMoreStep"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
			//				WebUI.comment("We are in one more step page")
			//			}else {
			//				WebUI.comment("We Are in Pre-Qualified stage ")
			//				WebUI.comment("This is for the STP Without journey")
			//			}
			WebUI.delay(1)
		}catch(Exception e){

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			println(e.toString())
		}
	}




	/*
	 * 1.This is Confirmation Page
	 */

	@Keyword
	def editOnConfirmationPageAmendment() {
		try {
			WebUI.waitForPageLoad(15)
			WebUI.delay(5)
			WebUI.switchToWindowIndex(1)
			(WebUI.verifyElementPresent(findTestObject("Object Repository/confirmationPage/reviewLoanDetail"), 2,FailureHandling.CONTINUE_ON_FAILURE))
			//Clicking on continue button
			
			WebUI.delay(1)
			
			GlobalVariableUtil.captureScreenShotWithTime()
			
			WebUI.click(findTestObject('Object Repository/confirmationPage/continueBtn'))
			if(WebUI.verifyElementPresent(findTestObject("Object Repository/Initial_Confirmation _PreQualified/PreQualifiedMsg"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We Are in Pre-Qualified stage ")
				WebUI.comment("This is for the STP Without journey")
			}else {
				WebUI.comment("We are in one more step page")
			}
		}catch(Exception e){

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			println(e.toString())
		}
	}
}
