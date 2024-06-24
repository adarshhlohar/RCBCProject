package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class initial_Confirmation {

	/*
	 * 1.This is initial confirmation page
	 */

	@Keyword
	def initial_conf() {

		try {
			WebUI.waitForPageLoad(10)
			WebUI.verifyElementPresent(findTestObject("Object Repository/Initial_Confirmation/oneMoreStep"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(1)
			
			GlobalVariableUtil.captureScreenShotWithTime()
			//Clicking on okay
			WebUI.click(findTestObject('Object Repository/Initial_Confirmation/okay'))
			if(WebUI.verifyElementPresent(findTestObject("Object Repository/AdditionalInformationWithoutAPI/additionPageLogo"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in Addition page")
			}else {
				WebUI.comment("We are not on Addition page")
			}
		}catch(Exception e) {
			WebUI.takeScreenshot()
			e.printStackTrace()
		}
	}
}
