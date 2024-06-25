import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import globalVariableUtils.GlobalVariableUtil as GlobalVariableUtil
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/disbursementInformation'))

GlobalVariableUtil.captureScreenShotWithTime()

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/plusIcon'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/payeeName'), 1, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/modeOfDisbursement'), 
    1, FailureHandling.STOP_ON_FAILURE)

GlobalVariableUtil.captureScreenShotWithTime()

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/saveAndClose'))

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/actionTab'))

GlobalVariableUtil.captureScreenShotWithTime()

WebUI.selectOptionByIndex(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/selectSubmit'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/decision'), 'ok')

WebUI.comment(GlobalVariable.LOSID)

WebUI.click(findTestObject('Object Repository/DisbursementInfoNew/DisbursementInfoAndSubmit/button_Submit'))

def currentWindow = WebUI.getWindowTitle()

GlobalVariableUtil.captureScreenShotWithTime()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Action/confirmYes'))

WebUI.delay(2)

if (!(currentWindow.equalsIgnoreCase('LoanPortal'))) {
    WebUI.switchToWindowTitle('LoanPortal')
}