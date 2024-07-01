package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class SelectManageLoans {
	/*
	 * 1.This is Select Auto Loan page.
	 */

	@Keyword
	def selectToManageLoan(){
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()
			//Clicking on manage Loans
			WebUI.click(findTestObject("Object Repository/HomePage/ManageLoans"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
