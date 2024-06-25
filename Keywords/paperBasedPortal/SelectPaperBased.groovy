package paperBasedPortal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class SelectPaperBased {

	/*
	 * 1.This is the method for selecting mode of the application
	 */
	@Keyword
	def paperBased(){
		try {
			//Here we clicking on the paper based inside a mode of application
			WebUI.delay(1)
			WebUI.verifyTextPresent("Mode of Application", false, FailureHandling.CONTINUE_ON_FAILURE)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/ModeOfApplication/paperBased"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
