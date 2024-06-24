package paperBasedPortal

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
			WebUI.verifyElementPresent(findTestObject("Object Repository/SubmitPage/submitPageNSTP"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(2)

			//			WebUI.waitForElementPresent(findTestObject("Object Repository/SubmitPage/referenceNumber"), 5)

			//Delay provided for page to be loaded
			//			WebUI.delay(2)
			//			String resistrationNumber = WebUI.getText(findTestObject("Object Repository/SubmitPage/referenceNumber"))
			//
			//			println(" ***** " + resistrationNumber)
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(2)
			//Clicking on proceed to release
			if(WebUI.waitForElementClickable(findTestObject('Object Repository/SubmitPage/paperBasedSubmitGoToBackOffice'), 2)) {
				WebUI.click(findTestObject('Object Repository/SubmitPage/paperBasedSubmitGoToBackOffice'))
			}



			WebUI.delay(1)
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
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(2)
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
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(2)
			//Clicking on proceed to release
			WebUI.click(findTestObject('Object Repository/SubmitPage/paperBasedSubmitGoToBackOffice'))



			//Delay provided for page to be loaded
			WebUI.delay(5)
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			println("Execotion error on submit" + e.toString())
		}
	}
}
