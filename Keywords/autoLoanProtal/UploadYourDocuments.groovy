package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable

public class UploadYourDocuments {

	/*
	 * 1.This is upload your documents page.
	 */

	public def fileUploadFromCompu() {
		try {
			WebUI.waitForPageLoad(10)
			//Uploading the documents
			WebUI.uploadFile(findTestObject('Object Repository/UploadYourDocuments/browseFile'), 'D:\\newRCBCProject\\RCBCLOS_Automation\\Document\\Katalon_WebObjects.pdf')
		}catch(Exception e) {
			WebUI.takeScreenshot()
			////Uploading the documents
			WebUI.uploadFile(findTestObject('Object Repository/UploadYourDocuments/browseFile'), 'D:\\newRCBCProject\\RCBCLOS_Automation\\Document\\Katalon_WebObjects.pdf')
		}
	}


	public def viewDocument(String xpath) {
		def currentIndex = WebUI.getWindowIndex()

		WebUI.delay(2)

		WebUI.click(findTestObject(xpath))

		currentIndex = currentIndex + 1

		WebUI.switchToWindowIndex(currentIndex)

		WebUI.delay(2)

		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(3)

		//Closing window
		WebUI.closeWindowIndex(currentIndex)

		currentIndex = currentIndex -1

		//Switching to default
		WebUI.switchToWindowIndex(currentIndex)
	}




	public def uplaodDocument(String uploadBtn, String uploadDocument) {
		def currentIndex = WebUI.getWindowIndex()

		//Clicking on upload file button
		WebUI.click(findTestObject(uploadBtn))

		//Providing delay
		WebUI.delay(1)

		currentIndex = currentIndex + 1

		//Switching windows
		WebUI.switchToWindowIndex(currentIndex)

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
		WebUI.closeWindowIndex(currentIndex)

		currentIndex = currentIndex -1

		//Switching to default
		WebUI.switchToWindowIndex(currentIndex)
	}

	@Keyword
	def uploadYourDocumentsPage() {
		try {
			WebUI.verifyElementPresent(findTestObject("Object Repository/UploadYourDocuments/uploadYourDocumentText"), 2, FailureHandling.CONTINUE_ON_FAILURE)

			GlobalVariableUtil.captureScreenShotWithTime()

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





	@Keyword
	def uploadYourDocumentsPageForAmendment() {

		/*try {
		 //Getting window index
		 def currentWindow = WebUI.getWindowIndex()
		 //Getting window title
		 String title = WebUI.getWindowTitle()
		 WebUI.verifyElementPresent(findTestObject("Object Repository/UploadYourDocuments/uploadYourDocumentText"), 2, FailureHandling.CONTINUE_ON_FAILURE)
		 //Selecting Id type
		 WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/validId_selectIdType'), 1)
		 //Clicking on upload file button
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/uploadFile_Btn'))
		 //Providing delay
		 WebUI.delay(1)
		 //Switching windows
		 WebUI.switchToWindowIndex(currentWindow + 1)
		 //Providing delay
		 WebUI.delay(1)
		 //Uploading file from system
		 fileUploadFromCompu()
		 //Providing delay
		 WebUI.delay(1)
		 //Clicking on document type
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))
		 //Selecting the document type by index
		 WebUI.selectOptionByValue(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), "ID Type Documents",false)
		 //Clicking on upload button
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))
		 WebUI.delay(3)
		 //Waiting for element present check
		 //			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)
		 //Closing window
		 WebUI.closeWindowIndex(2)
		 //Switching to default
		 //			WebUI.switchToDefaultContent()
		 WebUI.switchToWindowIndex(currentWindow)
		 //Selecting the income document type
		 WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/incomeDocument_selectIdType'), 1)
		 WebUI.delay(1)
		 //Clicking on income document upload
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/uploadFile_Btn1'))
		 //Providing delay
		 WebUI.delay(1)
		 //Switching to different window
		 WebUI.switchToWindowIndex(currentWindow + 1)
		 //Providing delay
		 WebUI.delay(1)
		 //Uploading file from system
		 fileUploadFromCompu()
		 //Providing delay
		 WebUI.delay(1)
		 //Selecting income document type
		 WebUI.selectOptionByValue(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), "Income Documents",false)
		 WebUI.delay(2)
		 //Clicking on upload
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/IncomeDocument/uploadBtn'))
		 WebUI.delay(4)
		 //Waiting for element present check
		 //			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)
		 //Closing window
		 WebUI.closeWindowIndex(2)
		 //Switching to default
		 //			WebUI.switchToDefaultContent()
		 WebUI.switchToWindowIndex(currentWindow)
		 //Providing delay
		 //			WebUI.delay(3)
		 //Scrolling to next button
		 WebUI.scrollToElement(findTestObject('Object Repository/UploadYourDocuments/nextBtn'), 3)
		 //Providing delay
		 WebUI.delay(1)
		 //This is for the application
		 //Clicking on upload file button
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/uploadFile_Btn2'))
		 //Providing delay
		 WebUI.delay(1)
		 //Switching windows
		 WebUI.switchToWindowIndex(currentWindow + 1)
		 //Providing delay
		 WebUI.delay(1)
		 //Uploading file from system
		 fileUploadFromCompu()
		 //Providing delay
		 WebUI.delay(1)
		 //Clicking on document type
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))
		 //Selecting the document type by index
		 WebUI.selectOptionByValue(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), "Loan Application Documents",false)
		 WebUI.delay(1)
		 //Clicking on upload button
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))
		 //Waiting for element present check
		 //			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)
		 WebUI.delay(3)
		 //Closing window
		 WebUI.closeWindowIndex(2)
		 //Switching to default
		 //WebUI.switchToDefaultContent()
		 WebUI.switchToWindowIndex(currentWindow)
		 //Verifying whether the back button is clickable or not
		 WebUI.verifyElementClickable(findTestObject("Object Repository/UploadYourDocuments/backBtn"),FailureHandling.CONTINUE_ON_FAILURE)
		 //Clicking on next button
		 WebUI.click(findTestObject('Object Repository/UploadYourDocuments/nextBtn'))
		 }catch(Exception e) {
		 //If the execution fails, screenshot will be captured
		 WebUI.takeScreenshot()
		 println("getting execution error"+ e.toString())
		 }
		 */




		try {
			WebUI.verifyElementPresent(findTestObject("Object Repository/UploadYourDocuments/uploadYourDocumentText"), 2, FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

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

