package paperBasedPortal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil

public class UploadYourDocuments {




	public def viewDocument(String xpath) {
		WebUI.click(findTestObject(xpath))

		WebUI.switchToWindowIndex(1)
		WebUI.delay(3)

		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(3)

		WebUI.closeWindowIndex(1)

		WebUI.switchToDefaultContent()
	}




	public def uplaodDocument(String uploadBtn, String uploadDocument) {
		//Clicking on upload file button
		WebUI.click(findTestObject(uploadBtn))

		//Providing delay
		WebUI.delay(1)

		//Switching windows
		WebUI.switchToWindowIndex(1)

		//Providing delay
		WebUI.delay(1)

		//Uploading file from system
		fileUploadFromCompu()

		//Providing delay
		WebUI.delay(1)

		//Clicking on document type
		WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))

		//Selecting the document type by index
		WebUI.selectOptionByValue(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), uploadDocument,false)

		//Clicking on upload button
		WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))

		WebUI.delay(3)

		//Waiting for element present check
		//			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)

		//Closing window
		WebUI.closeWindowIndex(1)

		//Switching to default
		WebUI.switchToDefaultContent()
	}

	/*
	 * 1.This is the method is calling when the need to upload a document.
	 */
	def fileUploadFromCompu() {
		try {
			//Here we Providing the path of the document
			WebUI.uploadFile(findTestObject('Object Repository/UploadYourDocuments/browseFile'), 'D:\\newRCBCProject\\RCBCLOS_Automation\\Document\\Katalon_WebObjects.pdf')
		}catch(Exception e) {
			WebUI.uploadFile(findTestObject('Object Repository/UploadYourDocuments/browseFile'), 'D:\\newRCBCProject\\RCBCLOS_Automation\\Document\\Katalon_WebObjects.pdf')
		}
	}

	/**
	 * This method is for the upload document page   
	 */

	@Keyword
	def uploadYourDocumentsPage() {
		try {

			//			//Getting window index
			//			def currentWindow = WebUI.getWindowIndex()
			//
			//			//Getting window title
			//			String title = WebUI.getWindowTitle()
			//
			//			//Selecting Id type
			//			WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/validId_selectIdType'), 1)
			//
			//			//Clicking on upload file button
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/uploadFile_Btn'))
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Switching windows
			//			WebUI.switchToWindowIndex(currentWindow + 1)
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Uploading file from system
			//			fileUploadFromCompu()
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Clicking on document type
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))
			//
			//			//Selecting the document type by index
			//			WebUI.selectOptionByValue(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), "ID Type Documents",false)
			//
			//			//Clicking on upload button
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))
			//
			//			WebUI.delay(3)
			//
			//			//Waiting for element present check
			//			//			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)
			//
			//			//Closing window
			//			WebUI.closeWindowIndex(1)
			//
			//			//Switching to default
			//			WebUI.switchToDefaultContent()
			//
			//			//Selecting the income document type
			//			WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/incomeDocument_selectIdType'), 1)
			//
			//			WebUI.delay(1)
			//
			//
			//			//Clicking on income document upload
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/uploadFile_Btn1'))
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//
			//			//Switching to different window
			//			WebUI.switchToWindowIndex(currentWindow + 1)
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Uploading file from system
			//			fileUploadFromCompu()
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Selecting income document type
			//			WebUI.selectOptionByValue(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), "Income Documents",false)
			//
			//			WebUI.delay(2)
			//
			//			//Clicking on upload
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/IncomeDocument/uploadBtn'))
			//
			//			WebUI.delay(4)
			//
			//			//Waiting for element present check
			//			//			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)
			//
			//			//Closing window
			//			WebUI.closeWindowIndex(1)
			//
			//			//Switching to default
			//			WebUI.switchToDefaultContent()
			//
			//			//Providing delay
			//			//			WebUI.delay(3)
			//			//Scrolling to next button
			//			WebUI.scrollToElement(findTestObject('Object Repository/UploadYourDocuments/nextBtn'), 3)
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//
			//
			//
			//			//This is for the application
			//			//Clicking on upload file button
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/uploadFile_Btn2'))
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Switching windows
			//			WebUI.switchToWindowIndex(currentWindow + 1)
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Uploading file from system
			//			fileUploadFromCompu()
			//
			//			//Providing delay
			//			WebUI.delay(1)
			//
			//			//Clicking on document type
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))
			//
			//			//Selecting the document type by index
			//			WebUI.selectOptionByValue(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), "Loan Application Documents",false)
			//
			//			WebUI.delay(1)
			//
			//			//Clicking on upload button
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))
			//
			//			//Waiting for element present check
			//			//			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)
			//
			//			WebUI.delay(3)
			//			//Closing window
			//			WebUI.closeWindowIndex(1)
			//
			//			//Switching to default
			//			WebUI.switchToDefaultContent()
			//
			//			WebUI.delay(2)
			//
			//
			//			//Verifying whether the back button is clickable or not
			//			//			WebUI.verifyElementClickable(findTestObject("Object Repository/UploadYourDocuments/backBtn"),FailureHandling.CONTINUE_ON_FAILURE)
			//
			//			//Clicking on next button
			//			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/nextBtn'))

			GlobalVariableUtil.captureScreenShotWithTime()

			//Getting window index
			def currentWindow = WebUI.getWindowIndex()

			//Getting window title
			String title = WebUI.getWindowTitle()

			//Selecting Id type
			WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/validId_selectIdType'), 1)


			String uploadIdType = "Object Repository/UploadYourDocuments/uploadFile_Btn"
			String documentType = "ID Type Documents"

			uplaodDocument(uploadIdType,documentType)

			String IdType = "Object Repository/UploadYourDocuments/IdDocViewButton"

			viewDocument(IdType)

			//Selecting the income document type
			WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/incomeDocument_selectIdType'), 1)

			WebUI.delay(1)


			String uploadIncome = "Object Repository/UploadYourDocuments/uploadFile_Btn1"
			String DoucmentTypeIncome = "Income Documents"

			uplaodDocument(uploadIncome, DoucmentTypeIncome)


			String IcomeDoc = "Object Repository/UploadYourDocuments/IncomeDocViewBtn"

			viewDocument(IcomeDoc)



			//Scrolling to next button
			WebUI.scrollToElement(findTestObject('Object Repository/UploadYourDocuments/nextBtn'), 3)

			//Providing delay
			WebUI.delay(1)


			String uploadAppliactionBtn = "Object Repository/UploadYourDocuments/uploadFile_Btn2"
			String uploadDocApplication = "Loan Application Documents"

			uplaodDocument(uploadAppliactionBtn, uploadDocApplication)

			String LoanAppliaction = "Object Repository/UploadYourDocuments/LoanApplicationDocViewBtn"

			viewDocument(LoanAppliaction)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()


			//Verifying whether the back button is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/UploadYourDocuments/backBtn"),FailureHandling.CONTINUE_ON_FAILURE)

			//Clicking on next button
			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/nextBtn'))
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			println("getting execution error"+ e.toString())
		}
	}
}

