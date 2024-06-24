package tabSection


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class ApplicationSection {

	/**
	 * This is the application page in that we selecting the application 
	 */
	@Keyword
	def applicationSectionTab(String show, String sortBy) {

		try {
			WebUI.waitForPageLoad(15)

			GlobalVariableUtil.createFolder("PrePost")

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/show'))
			WebUI.selectOptionByValue(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/show'), show, true)

			WebUI.delay(5)

			WebUI.selectOptionByValue(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/sortBy'), sortBy, true)

			WebUI.verifyElementClickable(findTestObject("Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/searchBy"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.verifyElementClickable(findTestObject("Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/autoLoanPortal"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.verifyElementClickable(findTestObject("Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/notification"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.verifyElementClickable(findTestObject("Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/signOut"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.verifyElementClickable(findTestObject("Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/search"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.verifyElementClickable(findTestObject("Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/dashboard"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.verifyElementClickable(findTestObject("Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/searchIcon"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.click(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/View'))

			WebUI.delay(5)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This is the application page in that we selecting the application
	 */
	@Keyword
	def applicationSectionTabAmendment(String show, String sortBy) {

		try {

			WebUI.delay(2)

			WebUI.switchToDefaultContent()

			WebUI.switchToWindowIndex(1,FailureHandling.OPTIONAL)

			WebUI.closeWindowIndex(1,FailureHandling.OPTIONAL)

			WebUI.switchToDefaultContent()

			WebUI.click(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/show'))
			WebUI.selectOptionByValue(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/show'), show, true)

			WebUI.delay(2)

			WebUI.selectOptionByValue(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/sortBy'), sortBy, true)

			WebUI.click(findTestObject('Object Repository/AdditionalInformationWithoutAPI/ApplicationPage/View'))

			WebUI.delay(2)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
