package signOutibps

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable




public class SignOut {
	/*
	 * logout from the back office
	 */
	@Keyword
	def static logout() {
		WebUI.switchToWindowIndex(0,FailureHandling.OPTIONAL)

		WebUI.delay(1)

		GlobalVariableUtil.loadGlobalVariable();

		WebUI.selectOptionByIndex(findTestObject("Object Repository/ibpsLogOut/selectProcess"), 2,FailureHandling.OPTIONAL)

		WebUI.delay(1)

		WebUI.doubleClick(findTestObject("Object Repository/ibpsLogOut/searchBar"))

		WebUI.sendKeys(findTestObject("Object Repository/ibpsLogOut/searchBar"), GlobalVariable.LOSID)

		WebUI.sendKeys(findTestObject("Object Repository/ibpsLogOut/searchBar"), Keys.chord(Keys.ENTER))
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(2)


		WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_QK_CO7"))

		WebUI.delay(2)

		WebUI.click(findTestObject("Object Repository/ibpsLogOut/Logout"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}



	/*
	 * logout from the back office
	 */
	@Keyword
	def static logoutFCI() {
		WebUI.switchToWindowIndex(0,FailureHandling.OPTIONAL)

		WebUI.delay(1)

		GlobalVariableUtil.loadGlobalVariable();
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(2)

		WebUI.click(findTestObject("Object Repository/ibpsLogOut/label_QK_CO7"))

		WebUI.delay(2)

		WebUI.click(findTestObject("Object Repository/ibpsLogOut/Logout"))
	}
}
