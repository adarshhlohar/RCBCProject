package fci_user1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class CreditInvestigation {

	@Keyword
	def creditInvestigationdetail() {
		WebUI.waitForPageLoad(10)
		WebUI.delay(1)
		def parentWindowId = WebUI.getWindowIndex()

		WebUI.switchToWindowIndex(parentWindowId+1)

		WebUI.delay(2)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/ibpsHomePage/agency"), 3)
		GlobalVariableUtil.captureScreenShotWithTime()
		
		WebUI.delay(2)

		WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/ibpsHomePage/submit"))

		WebUI.takeScreenshot()

		WebUI.delay(2)

		WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/ibpsHomePage/confirmYes"))
	}



	@Keyword
	def creditInvestigationdetailEmp() {
		WebUI.waitForPageLoad(10)
		WebUI.delay(1)
		def parentWindowId = WebUI.getWindowIndex()

		WebUI.switchToWindowIndex(parentWindowId+1)

		WebUI.delay(2)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/ibpsHomePage/agencyForEmp"), 3)

		GlobalVariableUtil.captureScreenShotWithTime()
		
		WebUI.delay(2)

		WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/ibpsHomePage/submitEmp"))

		WebUI.takeScreenshot()

		WebUI.delay(2)

		WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/ibpsHomePage/confirmYes"))
	}


	@Keyword
	def creditInvestigationApproverEMP() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			WebUI.delay(2)
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/dateAndTimetoVisitOrCall"), "20/06/2024")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/dateOfReportOrResult"),"27/06/2024" )
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/callback"), "na")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/callAttempts"), "2")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/userContactNumber"),"(63) 8768678678" )
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/coductedBy"), "Head Manager")
			WebUI.takeScreenshot()
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)


			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/companyName"), "QK")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/natureOfBusiness"), "300")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/contactNumber"), "(63) 9867456787")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/verifiedBusinessAddress"), "Ok")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/positionRank"), "Manager")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/employeeTenure"), "1000")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/employeeStatus"), "Good")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/verifiedIncome"), "70000")
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/employeeWorkingHours"), 1)
			WebUI.takeScreenshot()
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)



			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/typeOfOwnership"), 1)
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/MaritialStatus"), 4)
			//
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/classification"), 1)
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/houseDescription"), 1)
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/resisteredOwnerName"), "Adarsh")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/typeOfInformant"), 2)
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/informantName"), "Jogendra")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/informantAddress"), "Pune")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/remarkFindings"), "good")
			WebUI.takeScreenshot()
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/identityCheck"), 1)
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/lengthOfStay"), "3")

			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/reputationToBarangayOfficial"),1 )
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/reputationToHomeAssociation"),1 )
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/reputationToNeighbors"),1 )

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/FCIResult"),1 )
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/CIRemark"), "ok")
			WebUI.takeScreenshot()
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/plusIconForAttachment"))
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/AttachDescription"), 1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/saveAndClose"))
			WebUI.takeScreenshot()
			WebUI.delay(1)

			def currentIndex = WebUI.getWindowIndex()
			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/uploadButton"))
			WebUI.delay(1)
			currentIndex = currentIndex + 1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(1)
			WebUI.uploadFile(findTestObject('Object Repository/UploadYourDocuments/browseFile'), 'D:\\newRCBCProject\\RCBCLOS_Automation\\Document\\Katalon_WebObjects.pdf')
			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))
			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))
			WebUI.delay(3)
			WebUI.closeWindowIndex(currentIndex)
			currentIndex = currentIndex -1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(1)

			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/viewButton"))
			currentIndex = currentIndex + 1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(4)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.closeWindowIndex(currentIndex)
			currentIndex = currentIndex -1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(1)


			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/submitReport"))
			WebUI.delay(2)
			//		WebUI.takeScreenshot())
			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigationEMP/confirmYes"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}





	@Keyword
	def creditInvestigationApprover() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			WebUI.delay(2)
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/dateAndTimetoVisitOrCall"), "20/06/2024")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/dateOfReportOrResult"),"27/06/2024" )
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/callback"), "na")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/callAttempts"), "2")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/userContactNumber"),"(63) 8768678678" )
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/coductedBy"), "Head Manager")
			GlobalVariableUtil.captureScreenShotWithTime()
			

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/personalInterviewed"), 1)
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/nameOfPersonInterviewed"), "NIKITA")
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/verificationOfIdentity"), 1)
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/numberOfDependence"), "2")
			GlobalVariableUtil.captureScreenShotWithTime()
			
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/typeOfOwnership"), 1)
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/MaritialStatus"), 4)
			GlobalVariableUtil.captureScreenShotWithTime()
			
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/classification"), 1)
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/houseDescription"), 1)
			GlobalVariableUtil.captureScreenShotWithTime()
			
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/resisteredOwnerName"), "Adarsh")
			GlobalVariableUtil.captureScreenShotWithTime()
			
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/typeOfInformant"), 2)
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/informantName"), "Jogendra")
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/informantAddress"), "Pune")
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/identityCheck"), 1)
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/lengthOfStay"), "3")
			GlobalVariableUtil.captureScreenShotWithTime()
			
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/reputationToBarangayOfficial"),1 )
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/reputationToHomeAssociation"),1 )
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/reputationToNeighbors"),1 )
			GlobalVariableUtil.captureScreenShotWithTime()
			
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/FCIResult"),1 )
			WebUI.setText(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/CIRemark"), "ok")
			GlobalVariableUtil.captureScreenShotWithTime()
			

			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/plusIconForAttachment"))
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/AttachDescription"), 1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/saveAndClose"))


			def currentIndex = WebUI.getWindowIndex()
			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/uploadButton"))
			WebUI.delay(1)
			currentIndex = currentIndex + 1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(1)
			WebUI.uploadFile(findTestObject('Object Repository/UploadYourDocuments/browseFile'), 'D:\\newRCBCProject\\RCBCLOS_Automation\\Document\\Katalon_WebObjects.pdf')
			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/documentType'))
			WebUI.click(findTestObject('Object Repository/UploadYourDocuments/ValidID/uploadBtn'))
			WebUI.delay(3)
			WebUI.closeWindowIndex(currentIndex)
			currentIndex = currentIndex -1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(1)

			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/viewButton"))
			currentIndex = currentIndex + 1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(4)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.closeWindowIndex(currentIndex)
			currentIndex = currentIndex -1
			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(1)


			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/submitReport"))
			WebUI.delay(2)
			//		WebUI.takeScreenshot())
			WebUI.click(findTestObject("Object Repository/BackOffice/FCI_User/CreditInvestigation/confirmYes"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
