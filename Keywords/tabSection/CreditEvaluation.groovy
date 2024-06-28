package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class CreditEvaluation {
	
	
	
	def checkALL() {
		if(WebUI.verifyElementPresent(findTestObject("Object Repository/BackOffice/CreditEvaluation/otherCreditCheckings"), 1,FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/CreditEvaluation/otherCreditCheckings"), 1,FailureHandling.OPTIONAL)
			GlobalVariableUtil.captureScreenShotWithTime()
		}
		
		if(WebUI.verifyElementPresent(findTestObject("Object Repository/BackOffice/CreditEvaluation/NTBBankCheck"), 1,FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/CreditEvaluation/NTBBankCheck"), 1,FailureHandling.OPTIONAL)
			GlobalVariableUtil.captureScreenShotWithTime()
		}
	}

	def enterNTBBankCheck() {

		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/plusIcon"))

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/BankName"),"RCBC")

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/accountType"), 1)

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/currentBalance"),"200000")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/averageDailyBalance"),"20000")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/accountNumber"),"54387938744")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/numberOfAccountHolders"),"2")
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/NTBBankCheck/saveAndClose"))
	}


	def otherExistingLoanCheck() {


		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/plusIcon"))

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/typeOfLoan"), 1)

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/bankName"),"YBI")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/PNNumber"),"242342")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/maturityDate"),"22/05/2024")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/outstandingBalance"),"500000")

		WebUI.setText(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/monthlyAmortization"),"69000")

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/loanRating"), 1)

		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()


		WebUI.click(findTestObject("Object Repository/BackOffice/EncoderNSTP/creditEvaluation/OtherExistingLoanCheck/saveAndClose"))
	}


	/**
	 * This method is for the credit evaluation AO
	 * @return
	 */
	@Keyword
	def creditEvaluationForAO() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the credit evaluation Encoder
	 * @return
	 */
	@Keyword
	def creditEvaluationForEncoderNSTP() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//			enterNTBBankCheck()

			//			otherExistingLoanCheck()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the credit evaluation Encoder
	 * @return
	 */
	@Keyword
	def creditEvaluationForEncoderWithAndWithout() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is for the credit evaluation Fullfillment
	 * @return
	 */
	@Keyword
	def creditEvaluationForFullfillment() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is for the credit evaluation COApprover
	 * @return
	 */
	@Keyword
	def creditEvaluationForCOApproverNSTP() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeBorrower"), "30000")
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeCoBorrower"), "25000")
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/basisOfVarification"), 1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is for the credit evaluation COMaker
	 * @return
	 */
	@Keyword
	def creditEvaluationForCOMakerNSTP() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeBorrower"), "30000")
			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeCoBorrower"), "25000")
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/basisOfVarification"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/Recommandation"), 1)

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/Approver"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}





	/**
	 * This method is for the credit evaluation COMaker
	 * @return
	 */
	@Keyword
	def creditEvaluationForCOMakerNSTPForDecline() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeBorrower"), "30000")
			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeCoBorrower"), "25000")
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/basisOfVarification"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/Recommandation"), 3)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the credit evaluation Encoder
	 * @return
	 */
	@Keyword
	def creditEvaluationForEncoderPaperBased() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the credit evaluation COMaker paper based
	 * @return
	 */
	@Keyword
	def creditEvaluationForCOMakerPaperbased() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))

			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/COMaker/CreditEvaluation/varifiedMonthlyIncomeBorrower"), "78000")

			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/COMaker/CreditEvaluation/varifiedMonthlyIncomeCoBorrower"), "66000")

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/COMaker/CreditEvaluation/basisOfVarification"), 1)


			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/COMaker/CreditEvaluation/Recommandation"), 1)

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/COMaker/CreditEvaluation/Approver"), 1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the credit evaluation COApprover Paperbased
	 * @return
	 */
	@Keyword
	def creditEvaluationForCOApproverPaperbased() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeBorrower"), "78000")
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/varifiedMonthlyIncomeCoBorrower"), "60000")
			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/basisOfVarification"), 1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the credit evaluation AO
	 * @return
	 */
	@Keyword
	def creditEvaluationForAOPaperbase() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This method is for the credit evaluation Fullfillment
	 * @return
	 */
	@Keyword
	def creditEvaluationForFullfillmentPaperbased() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	@Keyword
	def CreditEvaluationAfterAmendment() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/Recommandation"), 1)

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/COMaker/CreditEvaluation/Approver"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is for the credit evaluation Fullfillment
	 * @return
	 */
	@Keyword
	def creditEvaluationCommon() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
	
	
	
	@Keyword
	def creditEvaluationBooking() {
		try {
			//clicking on the credit evaluation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditEvaluation"))
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
	
	
	
}
