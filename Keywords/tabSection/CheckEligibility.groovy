package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert
import org.openqa.selenium.WebElement

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


	
	
	def checkEligibilityDuplicateApplication() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		String dedupResult = WebUI.getText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/checkHit"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()
//		return dedupResult;
	}


	def checkEligibilityRPTCheck() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		String RPTResult = WebUI.getText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/checkHit"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}

	def checkEligibilityDosriCheck() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		String dosriResult =  WebUI.getText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/checkHit"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()
	}



	def checkEligibilityForNegativeFile() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		String negativeFileCheckResult = WebUI.getText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/checkHit"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckSaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}

	def checkEligibilityForETBOrNTB() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		String NTBOrETBCheckResult = WebUI.getText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/checkHit"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()
	}

	def checkEligibilityForTransunion() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionPrincipal"))
		WebUI.delay(1)
		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transunionRemark"),"Ok")
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionCheckEligibility"))
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
		GlobalVariableUtil.captureScreenShotWithTime()
	}


	def checkEligibilityForAccuty() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyPrincipal"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))

		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"), 2)) {
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/crossButtonTemp"))
		}
		WebUI.delay(1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyResult"), 1)
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutySaveChanges"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}


	def checkEligibilityForPaperBased() {

		String dedupResult = checkEligibilityDuplicateApplication()

		checkEligibilityRPTCheck()

		checkEligibilityDosriCheck()

		checkEligibilityForNegativeFile()

		checkEligibilityForETBOrNTB()

		checkEligibilityForTransunion()

		checkEligibilityForAccuty()
	}


	
	
	def checkEligibilityForCoBorrower() {
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)
		String checkHit = WebUI.getText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/checkHit"))
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DuplicateApplicationSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()



		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/DOSRICheckSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NegativeFileCheckSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/NTBOrETBCheckSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionCoBorrower"))
		WebUI.delay(1)

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transunionRemark"),"Ok")
		WebUI.delay(1)

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionCheckEligibility"))
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"))

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransuinionReport"))
		WebUI.delay(2)
		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"), 2)) {
			WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/transUnionOkButton"))
		}
		GlobalVariableUtil.captureScreenShotWithTime()

		//		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/RPTCheckOK"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/TransunionSaveChanges"))
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)

		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyCoBorrower"))
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/AccutyCheckEligibility"))
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
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.delay(1)
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
			List<WebElement> elements =  WebUI.findWebElements(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseCheckEligibility/countOfWithHit"), 1)
			Assert.assertEquals(elements.size(), 0)
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
