package postRelease

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable

public class PostReleaseSubmit {

	def uploadDocument(String obj,i){

		int max =6

		int min = 1

		int b = (int)(Math.random()*(max-min+1)+min);


		WebUI.click(findTestObject('Object Repository/PostReleaseDocumentUpload/plusIcon'))

		WebUI.selectOptionByIndex(findTestObject('Object Repository/PostReleaseDocumentUpload/documentSource'), 1)

		WebUI.selectOptionByIndex(findTestObject('Object Repository/PostReleaseDocumentUpload/documentName'), i)

		WebUI.click(findTestObject('Object Repository/PostReleaseDocumentUpload/saveAndClose'))

		WebUI.delay(1)

		int currentPageIndex = WebUI.getWindowIndex();

		//	WebUI.waitForElementPresent(findTestObject("Object Repository/DocumentCheckListForPreRelease/InwardDocument/button" + i.toString()))

		WebUI.click(findTestObject(obj))

		//	Getting window index
		def currentWindow = WebUI.getWindowIndex()

		//Providing delay
		WebUI.delay(1)

		//Getting window title
		String title = WebUI.getWindowTitle()

		//Switching windows
		WebUI.switchToWindowIndex(currentWindow + 1)

		//Providing delay
		WebUI.delay(1)
		//Uploading the documents
		WebUI.uploadFile(findTestObject('Object Repository/UploadYourDocuments/browseFile'), 'D:\\newRCBCProject\\RCBCLOS_Automation\\Document\\Katalon_WebObjects.pdf')

		//Providing delay
		WebUI.delay(1)

		//Clicking on document type
		WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))

		//Selecting the document type by index
		WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), b)

		//Clicking on upload button
		WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))

		WebUI.waitForElementPresent(findTestObject("Object Repository/UploadYourDocuments/SuccessMesg"), 5)

		WebUI.delay(4)

		//Waiting for element present check
		//			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)

		//Closing window
		WebUI.closeWindowIndex(2)

		//Switching to default
		WebUI.switchToWindowIndex(1)

		WebUI.delay(2)
		//		}
	}



	@Keyword
	def submit_post_release() {
		try {

			WebUI.switchToWindowIndex(1)

			WebUI.delay(4)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			//			WebUI.click(findTestObject('Object Repository/TabSection/ClientInformation'))

			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//			String testObject1="Object Repository/PostReleaseDocumentUpload/upload1"
			//
			//			uploadDocument(testObject1,1)
			//
			//			WebUI.delay(1)
			//
			//			String testObject2="Object Repository/PostReleaseDocumentUpload/upload2"
			//
			//			uploadDocument(testObject2,2)
			//
			//			WebUI.delay(1)
			//
			//			String testObject3="Object Repository/PostReleaseDocumentUpload/upload3"
			//
			//			uploadDocument(testObject3,3)
			//
			//			WebUI.delay(1)
			//
			//
			//			String testObject4="Object Repository/PostReleaseDocumentUpload/upload4"
			//
			//			uploadDocument(testObject4,4)
			//
			//			WebUI.delay(1)
			//
			//			String testObject5="Object Repository/PostReleaseDocumentUpload/upload5"
			//
			//			uploadDocument(testObject5,5)
			//
			//			WebUI.delay(1)
			//
			//			String testObject6="Object Repository/PostReleaseDocumentUpload/upload6"
			//
			//			uploadDocument(testObject6,6)
			//
			//			WebUI.delay(1)
			//
			//			String testObject7="Object Repository/PostReleaseDocumentUpload/upload7"
			//
			//			uploadDocument(testObject7,7)
			//
			//			WebUI.delay(1)
			//
			//			String testObject8="Object Repository/PostReleaseDocumentUpload/upload8"
			//
			//			uploadDocument(testObject8,8)
			//
			//			WebUI.delay(1)
			//
			//			String testObject9="Object Repository/PostReleaseDocumentUpload/upload9"
			//
			//			uploadDocument(testObject9,9)
			//
			//			WebUI.delay(1)
			//
			//			String testObject10="Object Repository/PostReleaseDocumentUpload/upload10"
			//
			//			uploadDocument(testObject10,10)
			//
			//			WebUI.delay(1)
			//
			//			String testObject11="Object Repository/PostReleaseDocumentUpload/upload11"
			//
			//			uploadDocument(testObject11,11)
			//
			//			WebUI.delay(1)
			//
			//			String testObject12="Object Repository/PostReleaseDocumentUpload/upload12"
			//
			//			uploadDocument(testObject12,12)
			//
			//			WebUI.delay(1)
			//
			//			String testObject13="Object Repository/PostReleaseDocumentUpload/upload13"
			//
			//			uploadDocument(testObject13,13)
			//
			//			WebUI.delay(1)
			//
			//
			//			String testObject14="Object Repository/PostReleaseDocumentUpload/upload14"
			//
			//			uploadDocument(testObject14,14)
			//
			//			WebUI.delay(1)
			//
			//
			//			String testObject15="Object Repository/PostReleaseDocumentUpload/upload15"
			//
			//			uploadDocument(testObject15,15)
			//
			//			WebUI.delay(1)
			//
			//			String testObject16="Object Repository/PostReleaseDocumentUpload/upload16"
			//
			//			uploadDocument(testObject16,16)
			//
			//			WebUI.delay(1)
			//
			//			String testObject17="Object Repository/PostReleaseDocumentUpload/upload17"
			//
			//			uploadDocument(testObject17,17)
			//
			//			WebUI.delay(1)
			//
			//			String testObject18="Object Repository/PostReleaseDocumentUpload/upload18"
			//
			//			uploadDocument(testObject18,18)
			//
			//			WebUI.delay(1)
			//
			//			String testObject19="Object Repository/PostReleaseDocumentUpload/upload19"
			//
			//			uploadDocument(testObject19,19)
			//
			//			WebUI.delay(1)
			//
			//			String testObject20="Object Repository/PostReleaseDocumentUpload/upload20"
			//
			//			uploadDocument(testObject20,20)

			WebUI.delay(1)

			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			WebUI.click(findTestObject('Object Repository/TabSection/DisbursementInformation'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			WebUI.click(findTestObject('Object Repository/TabSection/Action'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/TabSection/Action'))

			WebUI.waitForElementVisible(findTestObject('Object Repository/Action/Decision'), 4)

			WebUI.selectOptionByValue(findTestObject('Object Repository/Action/Decision'), "Submit",false)

			WebUI.setText(findTestObject('Object Repository/Action/Remarks'), "OK")

			WebUI.comment(GlobalVariable.LOSID)

			WebUI.click(findTestObject('Object Repository/Action/SubmitButton'))

			WebUI.delay(1)

			WebUI.takeScreenshot()
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/Action/confirmYes"))


			WebUI.delay(5)

			//			println("Thank You!!!")
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
