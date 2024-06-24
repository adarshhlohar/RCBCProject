package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable



public class Action {

	static	String  result ="LOS-"
	/**
	 * This is the the action tab in that we submitting the application
	 * @return
	 */
	@Keyword
	def submitForAO(){

		try {
			WebUI.click(findTestObject('Object Repository/TabSection/Action'))

			WebUI.waitForElementVisible(findTestObject('Object Repository/Action/Decision'), 4)

			WebUI.selectOptionByIndex(findTestObject('Object Repository/Action/Decision'), 1)

			WebUI.setText(findTestObject('Object Repository/Action/Remarks'), "OK")

			String currentWindow = WebUI.getWindowTitle();

			//			println(" *********  - " + currentWindow)

			String referenceNumber = WebUI.getText(findTestObject("Object Repository/Action/referenceNumber"))


			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			GlobalVariable.LOSID = result

			//			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(GlobalVariable.LOSID)

			WebUI.click(findTestObject('Object Repository/Action/SubmitButton'))

			WebUI.takeScreenshot()
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.click(findTestObject("Object Repository/Action/confirmYes"))

//			if (!(currentWindow.equalsIgnoreCase('LoanPortal'))) {
//				WebUI.switchToWindowTitle('LoanPortal',FailureHandling.OPTIONAL)
//			}

			WebUI.delay(2)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This is the the action tab in that we submitting the application
	 * @return
	 */
	@Keyword
	submitForAmendment(){

		try {
			WebUI.click(findTestObject('Object Repository/TabSection/Action'))

			WebUI.waitForElementVisible(findTestObject('Object Repository/Action/Decision'), 4)

			WebUI.selectOptionByIndex(findTestObject('Object Repository/Action/Decision'), 1)

			WebUI.setText(findTestObject('Object Repository/Action/Remarks'), "OK")

			String currentWindow = WebUI.getWindowTitle();

			//			println(" *********  - " + currentWindow)

			String referenceNumber = WebUI.getText(findTestObject("Object Repository/Action/referenceNumber"))

			println( "********" + referenceNumber)



			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			GlobalVariable.LOSID = result

			//			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(GlobalVariable.LOSID)

			WebUI.click(findTestObject('Object Repository/Action/SubmitButton'))

			WebUI.takeScreenshot()

			WebUI.click(findTestObject("Object Repository/Action/confirmYes"))

			WebUI.delay(2)

			if (!(currentWindow.equalsIgnoreCase('LoanPortal'))) {
				WebUI.switchToWindowTitle('LoanPortal',FailureHandling.OPTIONAL)
			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
