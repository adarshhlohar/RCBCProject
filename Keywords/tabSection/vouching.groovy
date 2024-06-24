package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class vouching {
	@Keyword
	def vouchingDeatilForSD_Approver() {
		WebUI.click(findTestObject("Object Repository/TabSection/Vouching"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/residenceCategory"), 1)

		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/dateOfBirth"), "08/05/1996")
		//
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/borrowerGrossMonthlyIncome"), "70000")
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/spouseGrossMonthlyIncome"), "60000")
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/Co-BorrowerGrossMonthlyIncome"), "50000")
		//
		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/vehicleCategory"), 1)
	}



	@Keyword
	def vouchingDeatilForSD_ApproverWithAndWithoutPaperbase() {
		WebUI.click(findTestObject("Object Repository/TabSection/Vouching"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/residenceCategory"), 1)

		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/dateOfBirth"), "08/05/1996")

		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/borrowerGrossMonthlyIncome"), "70000")
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/spouseGrossMonthlyIncome"), "60000")
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/Co-BorrowerGrossMonthlyIncome"), "50000")

		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/vehicleCategory"), 1)
	}



	@Keyword
	def vouchingDeatilForSD_ApproverNSTP() {
		WebUI.click(findTestObject("Object Repository/TabSection/Vouching"))
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/residenceCategory"), 1)
		//
		//		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/dateOfBirth"), "08/05/1996")
		//
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/borrowerGrossMonthlyIncome"), "70000")
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/spouseGrossMonthlyIncome"), "60000")
		//		WebUI.setText(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/Co-BorrowerGrossMonthlyIncome"), "50000")
		//
		//		WebUI.selectOptionByIndex(findTestObject("Object Repository/SDApprover/VouchingInSDApprover/vehicleCategory"), 1)
	}


	@Keyword
	def VouchingForAll() {
		WebUI.click(findTestObject("Object Repository/TabSection/Vouching"))

		WebUI.selectOptionByIndex(findTestObject("Object Repository/Vouching/resisdenceCategory"), 1)

		WebUI.setText(findTestObject("Object Repository/Vouching/BorrowerSpouseDateOfBirth"),"22/05/1996")

		WebUI.setText(findTestObject("Object Repository/Vouching/BorrowerGrossMonthlyIncome"),"70000")

		WebUI.setText(findTestObject("Object Repository/Vouching/SpouseGrossMonthlyIncome"),"0")

		WebUI.setText(findTestObject("Object Repository/Vouching/CoBorrowerGrossMonthlyIncome"),"0")
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.selectOptionByIndex(findTestObject("Object Repository/Vouching/vehicleCategory"), 1)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/Vouching/recommendation"), 1)
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}



	@Keyword
	def vouchingForCommon() {
		WebUI.delay(2)
		if(WebUI.verifyElementClickable(findTestObject("Object Repository/TabSection/Vouching"),FailureHandling.OPTIONAL)){
			WebUI.click(findTestObject("Object Repository/TabSection/Vouching"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}
	}
}
