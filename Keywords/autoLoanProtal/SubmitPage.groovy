package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil





public class SubmitPage {

	/*
	 * 1. This is Submit Page With API
	 */
	@Keyword
	def proceedToPreReleaseFun() {
		try {

			//Delay provided for page to be loaded
			WebUI.waitForPageLoad(10)

			WebUI.verifyElementPresent(findTestObject("Object Repository/SubmitPage/submitPageWithSTP"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			//			WebUI.waitForElementPresent(findTestObject("Object Repository/SubmitPage/referenceNumber"), 5)

			//Delay provided for page to be loaded
			WebUI.delay(2)

			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.takeScreenshot()
			//Clicking on proceed to release
			WebUI.click(findTestObject('Object Repository/SubmitPage/proceedToPreReleaseBtn'))


			WebUI.delay(5)
		}catch(Exception e) {
			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			println("Exception error on submit" + e.toString())
		}
	}


	/*
	 * 1. This is Submit Page Without API
	 */

	@Keyword
	def proceedToPreReleaseFunWithout() {
		try {

			//Delay provided for page to be loaded
			WebUI.waitForPageLoad(10)
			WebUI.verifyElementPresent(findTestObject("Object Repository/SubmitPage/submitPageWithout"), 2, FailureHandling.CONTINUE_ON_FAILURE)

			//Delay provided for page to be loaded
			WebUI.delay(2)

			GlobalVariableUtil.captureScreenShotWithTime()
			//Clicking on proceed to release
			WebUI.click(findTestObject('Object Repository/SubmitPage/proceedToPreReleaseForWithout'))




			//Delay provided for page to be loaded
			WebUI.delay(5)
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			println("Execotion error on submit" + e.toString())
		}
	}



	/*
	 * 1. This is Submit Page NSTP
	 */

	@Keyword
	def proceedToPreReleaseFunNSTP() {
		try {

			//Delay provided for page to be loaded
			WebUI.waitForPageLoad(10)
			WebUI.verifyElementPresent(findTestObject("Object Repository/SubmitPage/submitPageNSTP"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			//Delay provided for page to be loaded
			WebUI.delay(2)

			GlobalVariableUtil.captureScreenShotWithTime()
			//Clicking on proceed to release
			WebUI.click(findTestObject('Object Repository/SubmitPage/goToBackOffice'))




			//Delay provided for page to be loaded
			WebUI.delay(5)
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			println("Execotion error on submit" + e.toString())
		}
	}
}
