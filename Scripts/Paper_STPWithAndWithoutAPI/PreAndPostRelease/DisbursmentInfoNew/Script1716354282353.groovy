import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/disbursementInformation'))

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/plusIcon'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/payeeName'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/modeOfDisbursement'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/saveAndClose'))

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/actionTab'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/selectSubmit'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/decision'), 
    'ok')

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/button_Submit'))

def currentWindow = WebUI.getWindowTitle()

WebUI.click(findTestObject('Object Repository/Action/confirmYes'))

WebUI.delay(2)

if (!(currentWindow.equalsIgnoreCase('LoanPortal'))) {
    WebUI.switchToWindowTitle('LoanPortal')
}

