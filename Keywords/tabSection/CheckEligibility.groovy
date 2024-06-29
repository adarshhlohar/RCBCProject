package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class CheckEligibility {


	def checkALL() {
		if(WebUI.verifyElementPresent(findTestObject("Object Repository/BackOffice/CheckEligibility/creditChecking"), 2,FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/CheckEligibility/creditChecking"), 1,FailureHandling.OPTIONAL)
			GlobalVariableUtil.captureScreenShotWithTime()
		}
		if(WebUI.verifyElementPresent(findTestObject("Object Repository/BackOffice/CheckEligibility/NTBOrETBCheck"), 2,FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/CheckEligibility/NTBOrETBCheck"), 1,FailureHandling.OPTIONAL)
			GlobalVariableUtil.captureScreenShotWithTime()
		}
		if(WebUI.verifyElementPresent(findTestObject("Object Repository/BackOffice/CheckEligibility/AMLRiskRating"), 2,FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/CheckEligibility/AMLRiskRating"), 1,FailureHandling.OPTIONAL)
			GlobalVariableUtil.captureScreenShotWithTime()
		}
	}



	/**
	 * This method is used for check eligibility AO
	 * @return
	 */
	@Keyword
	checkEligibilityForAo(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is used for check eligibility AO
	 * @return
	 */
	@Keyword
	checkEligibilityForEncoderWithAndWithout(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is used for check eligibility Encoder
	 * @return
	 */
	@Keyword
	checkEligibilityForEncoderNSTP(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckNumericalScore"), "2000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckRiskLevel"),6)

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckNumricalScore"),"3000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckRiskLevel"),6)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is used for check eligibility Encoder
	 * @return
	 */
	@Keyword
	checkEligibilityForEncoderNSTPVouching(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckNumericalScore"), "2000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckRiskLevel"),5)

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckNumricalScore"),"3000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckRiskLevel"),5)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is used for check eligibility Fullfillment
	 * @return
	 */
	@Keyword
	checkEligibilityForFullfillment(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is used for check eligibility COMaker
	 * @return
	 */
	@Keyword
	checkEligibilityForCOMaker(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is used for check eligibility COApprover
	 * @return
	 */
	@Keyword
	checkEligibilityForCOApprover(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	def checkEligibilityForPaperBased() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionPrincipal"))
		WebUI.delay(1)
		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transunionRemark"),"Ok")
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(3)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"))
		WebUI.delay(2)
		//		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransuinionReport"))
		//		WebUI.delay(1)
		//		GlobalVariableUtil.captureScreenShotWithTime()
		//		WebUI.delay(2)
		//		if(WebUI.waitForElementPresent(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"), 2)) {
		//			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"))
		//		}
		//		WebUI.delay(1)
		//		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.delay(1)

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"), 2)) {
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"))
		}
		WebUI.delay(1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyResult"), 1)
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutySaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.delay(1)
	}





	def checkEligibilityForCoBorrower() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)
		String checkHit = WebUI.getText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/checkHit"))
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()



		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()



		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()



		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionCoBorrower"))
		WebUI.delay(1)

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transunionRemark"),"Ok")
		WebUI.delay(1)

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"))

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransuinionReport"))
		WebUI.delay(2)
		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"), 2)) {
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"))
		}
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		//		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyCheckEligibility"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))
		WebUI.delay(1)
		if(WebUI.waitForElementPresent(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"), 2)) {
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"))
		}
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/accuityReport"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyResult"), 1)
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutySaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)
	}

	/**
	 * This method is used for check eligibility Encoder Paper Based
	 * @return
	 */
	@Keyword
	checkEligibilityForEncoderPaperBased(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			GlobalVariableUtil.captureScreenShotWithTime()

			checkEligibilityForPaperBased()

			checkEligibilityForCoBorrower()
			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckNumericalScore"), "2000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckRiskLevel"),6)

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckNumricalScore"),"3000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckRiskLevel"),6)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is used for check eligibility Encoder Paper Based
	 * @return
	 */
	@Keyword
	checkEligibilityForCOMakerPaperBased(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is used for check eligibility COApprover paperbased
	 * @return
	 */
	@Keyword
	checkEligibilityForCOApproverPaperbased(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is used for check eligibility AO
	 * @return
	 */
	@Keyword
	checkEligibilityForAOPaperbase(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is used for check eligibility Fullfillment
	 * @return
	 */
	@Keyword
	checkEligibilityForFullfillmentPaperbase(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is used for check eligibility Encoder Paper Based
	 * @return
	 */
	@Keyword
	checkEligibilityCommon(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	@Keyword
	def checkEligibilityForEncoderPaperbaseNSTP(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))

			checkEligibilityForPaperBased()

			checkEligibilityForCoBorrower()

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckNumericalScore"), "2000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckRiskLevel"),6)

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckNumricalScore"),"3000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckRiskLevel"),6)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is used for check eligibility Encoder
	 * @return
	 */
	@Keyword
	checkEligibilityForEncoderNSTPAccuity(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))

			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyPrincipal"))
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyCheckEligibility"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))
			WebUI.delay(1)
			if(WebUI.waitForElementPresent(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"), 2)) {
				WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"))
			}
			def currentIndex = WebUI.getWindowIndex()
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/accuityReport"))
			WebUI.delay(1)

			WebUI.switchToWindowIndex(currentIndex + 1)
			currentIndex = currentIndex +1

			WebUI.delay(5)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			WebUI.closeWindowIndex(currentIndex)
			WebUI.switchToWindowIndex(currentIndex-1)
			currentIndex = currentIndex-1

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyResult"), 2)
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutySaveChanges"))
			WebUI.delay(1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckNumericalScore"), "2000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/quickCheckRiskLevel"),6)

			WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckNumricalScore"),"3000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/checkEligibility/compreCheckRiskLevel"),6)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	@Keyword
	checkEligibilityForBooking(){
		try {
			//clicking on the check eligibilty tab
			WebUI.click(findTestObject("Object Repository/TabSection/checkEligibility"))
			checkALL()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
