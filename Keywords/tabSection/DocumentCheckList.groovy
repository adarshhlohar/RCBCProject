package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil






public class DocumentCheckList {

	def uploadDocument(String obj,int i){


		WebUI.click(findTestObject('Object Repository/DocumentCheckListForPreRelease/InwardDocument/plusIcon'))

		WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentCheckListForPreRelease/InwardDocument/documentSource'), 1)

		WebUI.selectOptionByIndex(findTestObject('Object Repository/DocumentCheckListForPreRelease/InwardDocument/documentName'), i)

		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject('Object Repository/DocumentCheckListForPreRelease/InwardDocument/SaveAndClose'))

		WebUI.delay(1)

		int currentPageIndex = WebUI.getWindowIndex();

		//	WebUI.waitForElementPresent(findTestObject("Object Repository/DocumentCheckListForPreRelease/InwardDocument/button" + i.toString()))

		WebUI.click(findTestObject(obj))

		//	Getting window index
		def currentWindow = WebUI.getWindowIndex()

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
		WebUI.selectOptionByIndex(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'), i)

		//Clicking on upload button
		WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))

		WebUI.delay(3)

		//Waiting for element present check
		//			WebUI.waitForElementPresent(findTestObject('Object Repository/UploadYourDocuments/SuccessMesg'), 30)

		//Closing window
		WebUI.closeWindowIndex(2)

		//Switching to default
		WebUI.switchToWindowIndex(1)

		WebUI.delay(1)
	}



	def outwardDocument(String obj) {
		WebUI.delay(1)

		WebUI.click(findTestObject(obj))

		WebUI.delay(1)

		WebUI.switchToWindowIndex(2)

		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.closeWindowIndex(2)

		WebUI.switchToWindowIndex(1)

		WebUI.delay(1)
	}



	def viewDocument(String DocBtn){
		def currentWindow = WebUI.getWindowIndex();

		WebUI.click(findTestObject(DocBtn))

		WebUI.switchToWindowIndex(currentWindow + 1)

		currentWindow = currentWindow + 1

		WebUI.delay(3)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(3)

		WebUI.closeWindowIndex(currentWindow)

		WebUI.switchToWindowIndex(currentWindow - 1)
	}

	/*
	 * This is the method for document checklist in PreRelease
	 */
	@Keyword
	def documentCheckListForPreRelease() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))

			//			String generate2 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate2"
			//			String generate3 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate3"
			//			String generate4 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate4"
			//			String generate5 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate5"
			//			String generate6 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate6"
			//			String generate7 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate7"
			//			String generate8 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate8"
			//			String generate9 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate9"
			//			String generate10 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate10"
			//			String generate11 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate11"
			//
			//			outwardDocument(generate2)
			//			outwardDocument(generate3)
			//			outwardDocument(generate4)
			//			outwardDocument(generate5)
			//			outwardDocument(generate6)
			//			outwardDocument(generate7)
			//			outwardDocument(generate8)
			//			outwardDocument(generate9)
			//			outwardDocument(generate10)
			//			outwardDocument(generate11)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.click(findTestObject("Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generateAll"))

			WebUI.delay(1)

			WebUI.switchToWindowIndex(2)

			WebUI.delay(2)

			WebUI.closeWindowIndex(2)

			WebUI.switchToWindowIndex(1)


			String viewIDType = "Object Repository/DocumentCheckListForPreRelease/KycDocuments/viewIdTypeDocument"
			if(WebUI.waitForElementPresent(findTestObject(viewIDType), 2)) {
				viewDocument(viewIDType)
			}

			String viewIncomeDocument = "Object Repository/DocumentCheckListForPreRelease/FinancialDocument/viewIncomeDocument"
			if(WebUI.waitForElementPresent(findTestObject(viewIncomeDocument), 2)) {
				viewDocument(viewIncomeDocument)
			}

			String viewDoc1 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn1"
			viewDocument(viewDoc1)
			String viewDoc2 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn2"
			viewDocument(viewDoc2)
			String viewDoc3 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn3"
			viewDocument(viewDoc3)
			String viewDoc4 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn4"
			viewDocument(viewDoc4)
			String viewDoc5 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn5"
			viewDocument(viewDoc5)
			String viewDoc6 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn6"
			viewDocument(viewDoc6)
			String viewDoc7 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn7"
			if(WebUI.waitForElementClickable(findTestObject(viewDoc7), 2)) {
				viewDocument(viewDoc7)
			}


			String testObject1 = "Object Repository/DocumentCheckListForPreRelease/InwardDocument/button1"
			String testObject2 = "Object Repository/DocumentCheckListForPreRelease/InwardDocument/button2"
			String testObject3 = "Object Repository/DocumentCheckListForPreRelease/InwardDocument/button3"
			String testObject4 = "Object Repository/DocumentCheckListForPreRelease/InwardDocument/button4"
			String testObject5 = "Object Repository/DocumentCheckListForPreRelease/InwardDocument/button5"
			//			String testObject6="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button6"


			//			uploadDocument(testObject1,1)
			WebUI.delay(1)
			//			uploadDocument(testObject2,2)
			//			uploadDocument(testObject3,3)
			//			uploadDocument(testObject4,4)
			//			uploadDocument(testObject5,5)


			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.click(findTestObject('Object Repository/CollateralInformationPreRelease/SaveBtn'))

			WebUI.delay(2)
			//			WebUI.switchToWindowIndex(currentPageIndex+1)
			//
			//
			//			WebUI.closeWindowIndex(currentPageIndex+1)
			//
			//			WebUI.switchToWindowIndex(currentPageIndex)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document checklist in PreRelease
	 */
	@Keyword
	def documentCheckListForPreReleaseNSTP() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))

			//			String generate1 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate1"
			//			String generate2 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate2"
			//			String generate3 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate3"
			//			String generate4 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate4"
			//			String generate5 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate5"
			//			String generate6 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate6"
			//			String generate7 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate7"
			//			String generate8 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate8"
			//			String generate9 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate9"
			//			String generate10 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate10"
			//			String generate11 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate11"
			//
			//			outwardDocument(generate1)
			//			outwardDocument(generate2)
			//			outwardDocument(generate3)
			//			outwardDocument(generate4)
			//			outwardDocument(generate5)
			//			outwardDocument(generate6)
			//			outwardDocument(generate7)
			//			outwardDocument(generate8)
			//			outwardDocument(generate9)
			//			outwardDocument(generate10)
			//			outwardDocument(generate11)

			WebUI.delay(1)

			WebUI.click(findTestObject("Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generateAll"))

			WebUI.delay(1)

			WebUI.switchToWindowIndex(2)

			WebUI.delay(3)

			WebUI.closeWindowIndex(2)

			WebUI.switchToWindowIndex(1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			String viewDoc1 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn1"
			viewDocument(viewDoc1)
			String viewDoc2 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn2"
			viewDocument(viewDoc2)
			String viewDoc3 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn3"
			viewDocument(viewDoc3)
			String viewDoc4 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn4"
			viewDocument(viewDoc4)
			String viewDoc5 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn5"
			viewDocument(viewDoc5)
			String viewDoc6 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn6"
			viewDocument(viewDoc6)


			String testObject1="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button1"
			String testObject2="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button2"
			String testObject3="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button3"
			String testObject4="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button4"
			String testObject5="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button5"
			//			String testObject6="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button6"


			//			uploadDocument(testObject1,1)
			WebUI.delay(1)
			//			uploadDocument(testObject2,2)
			//			uploadDocument(testObject3,3)
			//			uploadDocument(testObject4,4)
			//			uploadDocument(testObject5,5)
			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist AO
	 */
	@Keyword
	def documentCheckListForAo() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/*
	 * This is the method for document Checklist Encoder
	 */
	@Keyword
	def documentCheckListForEncoder() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist FullFillment
	 */
	@Keyword
	def documentCheckListForFullfillment() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/*
	 * This is the method for document Checklist COMaker
	 */
	@Keyword
	def documentCheckListForCOMaker() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist COMaker
	 */
	@Keyword
	def documentCheckListForCOApprover() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist Encoder PaperBased
	 */
	@Keyword
	def documentCheckListForEncoderPaperBased() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist Encoder PaperBased
	 */
	@Keyword
	def documentCheckListForCOMakerPaperBased() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist COMaker paperbased
	 */
	@Keyword
	def documentCheckListForCOApproverPaperbased() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	/*
	 * This is the method for document checklist in PreRelease
	 */
	@Keyword
	def documentCheckListForPreReleasePaperbased() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))

			//			String generate1 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate1"
			//			String generate2 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate2"
			//			String generate3 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate3"
			//			String generate4 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate4"
			//			String generate5 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate5"
			//			String generate6 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate6"
			//			String generate7 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate7"
			//			String generate8 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate8"
			//			String generate9 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate9"
			//			String generate10 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate10"
			//			String generate11 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generate11"
			//
			//			outwardDocument(generate1)
			//			outwardDocument(generate2)
			//			outwardDocument(generate3)
			//			outwardDocument(generate4)
			//			outwardDocument(generate5)
			//			outwardDocument(generate6)
			//			outwardDocument(generate7)
			//			outwardDocument(generate8)
			//			outwardDocument(generate9)
			//			outwardDocument(generate10)
			//			outwardDocument(generate11)


			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)


			WebUI.click(findTestObject("Object Repository/DocumentCheckListForPreRelease/OutwardDocument/generateAll"))

			WebUI.delay(1)

			WebUI.switchToWindowIndex(2)

			WebUI.delay(3)

			WebUI.closeWindowIndex(2)

			WebUI.switchToWindowIndex(1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			String viewDoc1 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn1"
			viewDocument(viewDoc1)
			String viewDoc2 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn2"
			viewDocument(viewDoc2)
			String viewDoc3 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn3"
			viewDocument(viewDoc3)
			String viewDoc4 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn4"
			viewDocument(viewDoc4)
			String viewDoc5 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn5"
			viewDocument(viewDoc5)
			String viewDoc6 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn6"
			viewDocument(viewDoc6)

			String viewDoc7 = "Object Repository/DocumentCheckListForPreRelease/OutwardDocument/viewBtn7"

			if(WebUI.waitForElementClickable(findTestObject(viewDoc7), 2)) {
				viewDocument(viewDoc7)
			}


			String testObject1="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button1"
			String testObject2="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button2"
			String testObject3="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button3"
			String testObject4="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button4"
			String testObject5="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button5"
			//			String testObject6="Object Repository/DocumentCheckListForPreRelease/InwardDocument/button6"


			//			uploadDocument(testObject1,1)
			//			WebUI.delay(1)
			//			uploadDocument(testObject2,2)
			//			WebUI.delay(1)
			//			uploadDocument(testObject3,3)
			//			WebUI.delay(1)
			//			uploadDocument(testObject4,4)
			//			WebUI.delay(1)
			//			uploadDocument(testObject5,5)

			WebUI.delay(2)


			WebUI.click(findTestObject('Object Repository/CollateralInformationPreRelease/SaveBtn'))

			WebUI.delay(2)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist AO
	 */
	@Keyword
	def documentCheckListForAOpaperbase() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This is the method for document Checklist FullFillment
	 */
	@Keyword
	def documentCheckListForFullfillmentPaperbase() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/*
	 * This is the method for document Checklist Common
	 */
	@Keyword
	def documentCheckListCommon() {
		try {
			//clicking on the document checklist tab
			WebUI.click(findTestObject('Object Repository/TabSection/DocumentCheclist'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
