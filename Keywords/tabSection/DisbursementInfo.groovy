package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable




public class DisbursementInfo {

	/**
	 * This metnhod is for the fulfillment Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForPreRealease() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject('Object Repository/TabSection/DisbursementInformation'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/DisbursementInformation/plusIcon'))
			WebUI.waitForElementPresent(findTestObject('Object Repository/DisbursementInformation/payeeName'), 10)
			WebUI.selectOptionByIndex(findTestObject('Object Repository/DisbursementInformation/payeeName'), 1)

			WebUI.selectOptionByValue(findTestObject('Object Repository/DisbursementInformation/modeOfDisbursement'), "Credit to RCBC CASA", false)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject('Object Repository/DisbursementInformation/saveAndNextBtn'))

			WebUI.click(findTestObject('Object Repository/DisbursementInformation/closeBtn'))

			WebUI.delay(1)

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/Save"))

			WebUI.delay(2)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the AO Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForAO() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))

			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/loanProceeds/name"), "rahul")

			WebUI.selectOptionByValue(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/loanProceeds/modeOfDisbursement"), "Credit to Account ", false)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/loanProceeds/accountNumber"), "3454375345")

			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/loanProceeds/bankName"), "SBI")
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.selectOptionByValue(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/dealersCommission/modeOfDisbursement"), "CMF Payment",false)

			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/dealersCommission/accountNumber"), "5439853458")



			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/remarks/aoRemarks"), "done")
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
	 * This metnhod is for the AO Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForAOWithout() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))


			String isDeviationStr = GlobalVariable.isDeviation

			if(isDeviationStr.equalsIgnoreCase("true")) {
				WebUI.click(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/payeeName"))
				WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/newSIRate"), GlobalVariable.NewSIRate)
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.click(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/saveChanges"))
			}

			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/remarks/aoRemarks"),"OK")
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the AO Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForNSTPAO() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))

			//			WebUI.click(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/payeeName"))
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/newSIRate"), GlobalVariable.NewSIRate)
			//			GlobalVariableUtil.captureScreenShotWithTime()
			//			WebUI.click(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/saveChanges"))

			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/DisbursmentInfoForAO/remarks/aoRemarks"), "done")

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This metnhod is for the Encoder Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForEncoder() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Fullfillment Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForFullfillmentWithAndWithout() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))

			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/DisbursementInformationWithoutAPI/preferredDueDate"), "01/06/2024")

			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/DisbursementInformationWithoutAPI/instructionToLOD"),"OK")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Fullfillment Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForFullfillment() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))

			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/DisbursementInformationWithoutAPI/preferredDueDate"), "01/06/2024")

			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/DisbursementInformationWithoutAPI/instructionToLOD"),"OK")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the COMaker Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForCOMaker() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This metnhod is for the COMaker Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForCOApprover() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the Encoder Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForEncoderPaperbased() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Encoder Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForCOMakerPaperbased() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the COMaker Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForCOApproverPaperbased() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the AO Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForAOPaperbase() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/modeOfDisbursement"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/accountNumber"), "465657575")

			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/bankName"), "Axis")
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/AO/DisbursementInfo/GrossAmount"), "50000")

			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/AO/DisbursementInfo/AORemark"), "done")
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Fullfillment Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForFullfillmentPaperbase() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))

			//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/modeOfDisbursement"), 1)
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/accountNumber"), "465657575")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/bankName"), "Axis")

			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/preferredDueDate"), "05/06/2024")

			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/Fullfillment/DisbursementInfo/instructionToLOD"), "OK")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the COMaker Disbursement Information
	 * @return
	 */
	@Keyword
	def disbursementInformationForCommon() {
		try {
			//clicking on the Disbursement Info Tab
			WebUI.click(findTestObject("Object Repository/TabSection/DisbursementInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			//			if(WebUI.waitForElementPresent(findTestObject("Object Repository/TabSection/nextArrowButton"), 2)) {
			//				WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
			//			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
