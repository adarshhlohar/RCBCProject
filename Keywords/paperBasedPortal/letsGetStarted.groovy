package paperBasedPortal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class letsGetStarted {

	/*
	 * This is the lets get started page
	 */
	@Keyword
	def letsGetStartedBtnFun() {
		try {
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject('Object Repository/LetsGetStarted/lets_get_started'))
			WebUI.delay(2)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
