package paperBasedPortal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
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
