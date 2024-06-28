package tabSection
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable




public class CustomerDetail {


	def enterPricipalDetail() {
		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/principal"))

		WebUI.delay(2)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/borrowerType"), 1)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/applicationType"), 1)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/custemerType"), 1)

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderWithWithout/sex"), 2)) {
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderWithWithout/sex"), 2)
		}

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/dateOfBirth"), 2)) {
			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/dateOfBirth"), "15/05/1991")
		}

		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/placeOfBirth"), 1)

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/maritalStatus"), 2)) {
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/maritalStatus"), 4)
		}

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderWithWithout/nationality"), 2)) {
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderWithWithout/nationality"), 1)
		}
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/numberOfYearsMarried"), "5")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/numberOfDependents"), "3")

		GlobalVariableUtil.captureScreenShotWithTime()

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/cifNumber"), 2)) {
			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/cifNumber"), "8796876876")
		}

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderWithWithout/idType"), 2)) {
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderWithWithout/idType"), 1)
		}


		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderWithWithout/idNumber"), 2)) {
			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderWithWithout/idNumber"), "98357487654")
		}


		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/RCBCCurrentOrSavingAccountNumber"), 2)) {
			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/RCBCCurrentOrSavingAccountNumber"), "0000000017517519")
		}

		GlobalVariableUtil.captureScreenShotWithTime()

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/isAddressPresent"), 2)) {
			WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/isAddressPresent"))
			WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/deleteAddress"))
		}

		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/plusButtonForAddressDetail"))

		WebUI.delay(1)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/typeOfAddress"), 2)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/residenceOwnershipType"), 2)

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/lengthOfStayAtCurrentResidance"), "4")
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/country"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/region"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/provience"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/townCityMuncipalities"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/barangay"), 1)

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/StreetName"), "Mahape Road")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/unitNumberBuildingName"), "Rupa Solitaire")
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/saveAndClose"))


		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/sourceOfWealth"), 1)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/occupation"), 1)

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/companyEmployerName"), "Mahesh")

		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/positionRankInCompany"), 1)

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/jobTitle"), "Test Engineer")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/numberOfYearsInCurrentCompany"), "3")

		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/totalYearsOfExperince"), "6")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/declareMonthlyIncome"),"60000")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/employerContactNumber"), "(63) 9356986567")

		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/Industry"), 1)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/subIndustry"), 1)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/natureOfBusiness"), 1)

		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/saveChanges"))

		WebUI.delay(2)
	}


	def enterCoBorrowerDetail() {
		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/coBorrower"))

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/sex"),1 )

		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/dob"))
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/dob"), "01/01/1994")
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/placeOfBirth"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/nationality"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/maritialStatus"), 4)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/idType"),1)
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/idNumber"), "4464675758758")
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/sourceOfWealth"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/occupation"),1)
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/company"), "QK")
		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/position"),1)
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/jobTitle"), "Automation Engineer")
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/yearsInCompany"), "2")
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/totalYearsOfExperience"), "12")
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/employerContactNumber"), "(63) 8787456356")
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/industry"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/subIndustry"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/natureOfBussiness"),1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/save"))

		WebUI.delay(2)
	}



	def enterCoBorrowerDetailNSTPPaperbase(){
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderClientInformation/plusIconForCoBorrower"))

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderClientInformation/borrowerType"), 1)

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderClientInformation/firstName"), "Lakhan")

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderClientInformation/middleName"), "Ramesh")


		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderClientInformation/LastName"), "shinde")

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/sex"),1 )

		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/dob"))
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/dob"), "01/01/1994")
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/placeOfBirth"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/nationality"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/maritialStatus"), 4)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/idType"),1)
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/idNumber"), "4464675758758")
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/sourceOfWealth"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/occupation"),1)
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/company"), "QK")
		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/position"),1)
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/jobTitle"), "Automation Engineer")
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/yearsInCompany"), "2")
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/totalYearsOfExperience"), "12")
		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/employerContactNumber"), "(63) 8734567898")
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/industry"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/subIndustry"),1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/natureOfBussiness"),1)
		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/CoBorrowerDetail/saveAndClose"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderClientInformation/crossButton"))
	}



	def matchReferenceNumber() {
		GlobalVariableUtil.loadGlobalVariable()

		String ProgramName = WebUI.getAttribute(findTestObject("Object Repository/ClientInformationPreRelease/creditProgram"), "title")

		if(ProgramName.equalsIgnoreCase("High Cashout")) {
			println("This is the High Cashout Program")
		}else if(ProgramName.equalsIgnoreCase("own Residence")) {
		}

		String referenceNumber = WebUI.getText(findTestObject("Object Repository/Action/referenceNumber"))

		if(referenceNumber.containsIgnoreCase(GlobalVariable.LOSID)) {
			WebUI.comment(referenceNumber + " Contains " + GlobalVariable.LOSID)
			WebUI.comment("Ready to go....")
			GlobalVariableUtil.captureScreenShotWithTime()
		}else {
			WebUI.comment(referenceNumber + " missMatch With " + GlobalVariable.LOSID)
			WebUI.comment("Not Ready to go....")
			WebUI.click(findTestObject("Object Repository/Action/closeBtn"))
			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/Action/ConfirmClose"))
		}
	}


	/**
	 * This metnhod is for the PreRelease client Information
	 * @return
	 */
	@Keyword
	def clientInformationForPreRelease() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	@Keyword
	def clientInformationForPreReleaseAmendmentDOBChange() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/principal"))

			WebUI.comment("Before Changing")

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(2)

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/dateOfBirth"), "15/05/1987")

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(2)

			WebUI.comment("After Changing")



			WebUI.click(findTestObject("Object Repository/ClientInformationPreRelease/saveChanges"))

			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	@Keyword
	def clientInformationForPreReleaseAmendmentDOBAndNameChange() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()


			WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/principal"))

			WebUI.comment("Before Changing")

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(2)

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/LastName"), "Singh")

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/dateOfBirth"), "15/05/1990")

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(2)

			WebUI.comment("After Changing")


			WebUI.click(findTestObject("Object Repository/ClientInformationPreRelease/saveChanges"))

			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
	/**
	 * This metnhod is for the AO client Information
	 * @return
	 */
	@Keyword
	def clientInformationForAO() {
		try {
			WebUI.delay(2)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			//			WebUI.click(findTestObject("Object Repository/ClientInformationPreRelease/saveAndClose"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the AO NSTP client Information
	 * @return
	 */
	@Keyword
	def clientInformationForAONSTP() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Encoder client Information
	 * @return
	 */
	@Keyword
	def clientInformationForEncoderNSTP() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			enterPricipalDetail()

			enterCoBorrowerDetail()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Encoder client Information
	 * @return
	 */
	@Keyword
	def clientInformationForEncoderWithAndWithout() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			enterPricipalDetail()

			enterCoBorrowerDetail()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COMaker client Information
	 * @return
	 */
	@Keyword
	def clientInformationForCOMaker() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the COApprover client Information
	 * @return
	 */
	@Keyword
	def clientInformationForCOApproverForNSTP() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			//			if(WebUI.waitForElementPresent(findTestObject("Object Repository/BackOffice/COApprover/ibpsHomePage/expandlayout"),2)) {
			//				WebUI.click(findTestObject("Object Repository/BackOffice/COApprover/ibpsHomePage/expandlayout"))
			//			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the fulfillment client Information
	 * @return
	 */
	@Keyword
	def clientInformationForFullfillment() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}





	/**
	 * This metnhod is for the Encoder Paper Based client Information
	 * @return
	 */
	@Keyword
	def clientInformationForEncoderPaperBased() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			enterPricipalDetail()

			enterCoBorrowerDetailNSTPPaperbase()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the Encoder Paper Based client Information
	 * @return
	 */
	@Keyword
	def clientInformationForEncoderPaperBasedWith() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			enterPricipalDetail()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the Encoder Paper Based client Information
	 * @return
	 */
	@Keyword
	def clientInformationForEncoderPaperBasedNSTP() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			enterPricipalDetail()

			enterCoBorrowerDetailNSTPPaperbase()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This metnhod is for the Encoder Paper Based client Information
	 * @return
	 */
	@Keyword
	def clientInformationForCOMakerPaperBased() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COApprover client Information paperbased
	 * @return
	 */
	@Keyword
	def clientInformationForCOApproverForPaperbased() {
		try {
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			//			WebUI.click(findTestObject("Object Repository/BackOffice/COApprover/ibpsHomePage/expandlayout"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the AO client Information
	 * @return
	 */
	@Keyword
	def clientInformationForAOPaperbase() {
		try {
			WebUI.delay(2)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			WebUI.delay(2)

			matchReferenceNumber()

			//			WebUI.click(findTestObject("Object Repository/ClientInformationPreRelease/saveAndClose"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the fulfillment client Information
	 * @return
	 */
	@Keyword
	def clientInformationForFullfillmentPaperbase() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the common
	 * @return
	 */
	@Keyword
	def clientInformationForSD_Approver() {
		try {
			WebUI.waitForPageLoad(10)

			def parentWindowId = 0
			WebUI.switchToWindowIndex(parentWindowId+1,FailureHandling.OPTIONAL)

			matchReferenceNumber()

			//			WebUI.click(findTestObject("Object Repository/BackOffice/SDApprover/ClientInfo/expandLayout"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the common
	 * @return
	 */
	@Keyword
	def clientInformationCommon() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	/**
	 * This metnhod is for the common
	 * @return
	 */
	@Keyword
	def clientInformationCommonAfterAmendment() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/principal"))

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(2)

			WebUI.comment("After Amendment")


			WebUI.click(findTestObject("Object Repository/ClientInformationPreRelease/saveChanges"))

			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	@Keyword
	def clientInformationBooking() {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.delay(1)
			def parentWindowId = WebUI.getWindowIndex()

			WebUI.switchToWindowIndex(parentWindowId+1)

			matchReferenceNumber()

			WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/principal"))
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/cifNumber"), 1)
			String accountNumber = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/RCBCCurrentOrSavingAccountNumber"), "title")
			String cifNumber = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/EncoderNSTP/ClientInformation/PrincipalInformation/cifNumber"), "title")

			GlobalVariableUtil.saveGlobalVariable("AccountNumber", accountNumber)
			GlobalVariableUtil.saveGlobalVariable("CIFNumber", cifNumber)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/ClientInformationPreRelease/saveChanges"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
