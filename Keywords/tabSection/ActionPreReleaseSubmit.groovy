package tabSection

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ActionPreReleaseSubmit {

	@Keyword
	def preSubmit() {
		WebUI.waitForPageLoad(10)
		WebUI.click(findTestObject('Object Repository/newRocorder/Page_Dealer Pre Release  LOS-1000004176/a_Action'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/newRocorder/Page_Dealer Pre Release  LOS-1000004176/select_SelectSubmitCancel'),
				'Submit', true)

		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/newRocorder/Page_Dealer Pre Release  LOS-1000004176/textarea_Missing or Invalid Value_Decision_Remarks'),
				'ok')

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/newRocorder/Page_Dealer Pre Release  LOS-1000004176/button_Submit'))

		def currentWindow = WebUI.getWindowTitle()

		WebUI.click(findTestObject("Object Repository/Action/confirmYes"))

		WebUI.delay(2)

		if(!currentWindow.equalsIgnoreCase("LoanPortal")){
			WebUI.switchToWindowTitle("LoanPortal")
		}
	}
}
