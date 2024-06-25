package autoLoanProtal
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.server.DriverFactory

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable



class LoanDetails {

	/*
	 * 1.This is Loan detail page.
	 * 2. @param: brand,unitDescription,loanTerm,downpaymentValue,actualCashOut,insuranceType.
	 * 3.The data inside param is used as data driven.
	 */

	String  result ="LOS-"
	@Keyword
	def loanDetail(String brand,String unitDescription,String loanTerm,String downpaymentValue,String actualCashOut,String insuranceType) {
		WebUI.waitForPageLoad(10)

		try {
			WebUI.verifyElementPresent(findTestObject("Object Repository/Loan Details/loanDetail"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			//Verifying whether the 'used' button is clickable or not.
			WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/Used"), FailureHandling.CONTINUE_ON_FAILURE)

			//Clicking on brand
			WebUI.click(findTestObject('Object Repository/Loan Details/Brand'))

			//Selecting the brand of vehicle
			WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Details/Brand'), brand, true)

			//Selecting the unit description of vehicle
			WebUI.selectOptionByIndex(findTestObject('Object Repository/Loan Details/UnitDescription'), unitDescription)

			//Clicking in the loan terms
			WebUI.click(findTestObject('Object Repository/Loan Details/LoanTerm'))

			//Selecting the loan term of the vehicle
			WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Details/LoanTerm'), loanTerm, true)

			//Clicking on the down payment value of the vehicle
			WebUI.click(findTestObject('Object Repository/Loan Details/DownpaymentValue'))

			//Entering the down payment value of the vehicle
			WebUI.sendKeys(findTestObject('Object Repository/Loan Details/DownpaymentValue'), downpaymentValue)

			//Entering the actual cash out of the vehicle
			WebUI.sendKeys(findTestObject('Object Repository/Loan Details/ActualCashOut'), actualCashOut)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking the insurance field of the vehicle
			WebUI.click(findTestObject('Object Repository/Loan Details/Insurance type'))

			//Selecting the insurance type of the vehicle
			WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Details/Insurance type'), insuranceType, true)


			WebUI.delay(2)
			String referenceNumber = WebUI.getWindowTitle();

			println(" ***** " + referenceNumber)

			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			System.out.println("result is: " + result);

			//			utilityClass.map1.put("referenceNumber", result)
			GlobalVariable.LOSID = result

			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(result)

			WebUI.click(findTestObject("Object Repository/Loan Details/increamentButton"))

			String noOfAdvancePayment = WebUI.getAttribute(findTestObject("Object Repository/Loan Details/noOfAdvancePayment"), "title")

			if(noOfAdvancePayment.equalsIgnoreCase("0")) {

				//Verifying whether the increment button is clickable or not
				WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/increamentButton"), FailureHandling.CONTINUE_ON_FAILURE)

				//Verifying whether the decrement button is clickable or not
				WebUI.verifyElementNotClickable(findTestObject("Object Repository/Loan Details/decreamentButton"),FailureHandling.CONTINUE_ON_FAILURE)
			}else {

				//Clicking on principle button
				WebUI.click(findTestObject("Object Repository/Loan Details/principalRadioBtn"))

				//Verifying whether the amortization button is clickable or not
				WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/amortizationRadioBtn"),FailureHandling.CONTINUE_ON_FAILURE)
			}

			//Verifying whether the auto loan check box is clickable or not
			WebUI.verifyElementNotChecked(findTestObject("Object Repository/Loan Details/autoLoanCheckBox"), 10, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()
			//Verifying whether the clear data button is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/Clear Data"), FailureHandling.CONTINUE_ON_FAILURE)

			//Clicking on calculate
			WebUI.click(findTestObject('Object Repository/Loan Details/Calculate'))

			//Verifying whether the update loan details button is clickable or not
			//			WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/Update Loan Details"),FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(2)

			def monthlyInsurancePremium = WebUI.getText(findTestObject("Object Repository/Loan Details/monthlyInsurancePremium"))

			def MonthlyAmortization= WebUI.getText(findTestObject("Object Repository/Loan Details/MonthlyAmortization"))

			def totalMonthlyAmortization = WebUI.getText(findTestObject("Object Repository/Loan Details/totalMonthlyAmortization"))

			def monthlyInsurancePremium13Month = 0

			if(WebUI.verifyElementPresent(findTestObject("Object Repository/Loan Details/monthlyInsurancePremium13Month"), 2)) {
				monthlyInsurancePremium13Month = WebUI.getText(findTestObject("Object Repository/Loan Details/monthlyInsurancePremium13Month"))
			}

			println(" **** " + monthlyInsurancePremium + " ******* " + MonthlyAmortization +  " ******* " + totalMonthlyAmortization + " ******* " + monthlyInsurancePremium13Month)
			println( "    "  + loanTerm + "  *787* " + insuranceType)



			if(loanTerm.equals("AL1") && (insuranceType.equals("TID") || insuranceType.equals("ALD"))) {
				println("Here I am selected loan term 12 and Tid or ALD")
				Assert.assertEquals("₱ 0", monthlyInsurancePremium13Month)
			}else if(loanTerm.equals("AL1") && (insuranceType.equals("REG") || insuranceType.equals("END") || insuranceType.equals("TIG") || insuranceType.equals("FIP") || insuranceType.equals("TIF") || insuranceType.equals("TID") || insuranceType.equals("ALP") || insuranceType.equals("ALD"))) {
				println("Here I am selected loan term 12 and Tid or ALD or end or reg like one option")
				Assert.assertEquals("₱ 0.00", monthlyInsurancePremium)
			}else if(!loanTerm.equals("AL1") && (insuranceType.equals("TIF") || insuranceType.equals("ALP"))){
				println("Here I am selected loan term other than 12 and TIF or ALP")
				Assert.assertNotEquals("₱ 0.00", monthlyInsurancePremium)
			}else if(!loanTerm.equals("AL1") && (insuranceType.equals("TID") || insuranceType.equals("ALD"))){
				println("Here I am selected loan term other than 12 and TID or ALD")
				Assert.assertNotEquals("₱ 0", monthlyInsurancePremium13Month)
			}else {
				println("Here I am selected other option")
				Assert.assertEquals("₱ 0.00", monthlyInsurancePremium)
			}

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject('Object Repository/Loan Details/Apply Now'))
			WebUI.delay(2)


			//			driver.switchTo().frame("ngformIframe")
			if(WebUI.verifyElementPresent(findTestObject('Object Repository/Borrower_Details/borrowerInformation'), 2,FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in Borrower Detail Page")
			}else {
				WebUI.comment("We are in Wrong Page")
			}
		} catch (Exception e) {
			println(" Execution error having this issue : " + e.toString())

			//If the execution fails, screenshot will be captured.
			WebUI.takeScreenshot()
		}
	}





	@Keyword
	def loanDetailForAO(String brand,String unitDescription,String loanTerm,String downpaymentValue,String actualCashOut,String insuranceType) {
		WebUI.waitForPageLoad(10)

		try {
			WebUI.verifyElementPresent(findTestObject("Object Repository/Loan Details/loanDetail"), 2, FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.selectOptionByIndex(findTestObject("Object Repository/AOAsDealer/LoanInformation/dealership"), 1)

			//Verifying whether the 'used' button is clickable or not.
			WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/Used"), FailureHandling.CONTINUE_ON_FAILURE)

			//Clicking on brand
			WebUI.click(findTestObject('Object Repository/Loan Details/Brand'))

			//Selecting the brand of vehicle
			WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Details/Brand'), brand, true)

			//Selecting the unit description of vehicle
			WebUI.selectOptionByIndex(findTestObject('Object Repository/Loan Details/UnitDescription'), unitDescription)

			//Clicking in the loan terms
			WebUI.click(findTestObject('Object Repository/Loan Details/LoanTerm'))

			//Selecting the loan term of the vehicle
			WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Details/LoanTerm'), loanTerm, true)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on the down payment value of the vehicle
			WebUI.click(findTestObject('Object Repository/Loan Details/DownpaymentValue'))

			//Entering the down payment value of the vehicle
			WebUI.sendKeys(findTestObject('Object Repository/Loan Details/DownpaymentValue'), downpaymentValue)

			//Entering the actual cash out of the vehicle
			WebUI.sendKeys(findTestObject('Object Repository/Loan Details/ActualCashOut'), actualCashOut)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking the insurance field of the vehicle
			WebUI.click(findTestObject('Object Repository/Loan Details/Insurance type'))

			//Selecting the insurance type of the vehicle
			WebUI.selectOptionByValue(findTestObject('Object Repository/Loan Details/Insurance type'), insuranceType, true)


			WebUI.delay(2)
			String referenceNumber = WebUI.getWindowTitle();

			println(" ***** " + referenceNumber)

			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			System.out.println("result is: " + result);

			//			utilityClass.map1.put("referenceNumber", result)
			GlobalVariable.LOSID = result

			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(result)



			//			WebUI.takeScreenshot()
			String noOfAdvancePayment = WebUI.getAttribute(findTestObject("Object Repository/Loan Details/noOfAdvancePayment"), "title")

			if(noOfAdvancePayment.equalsIgnoreCase("0")) {

				//Verifying whether the increment button is clickable or not
				WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/increamentButton"), FailureHandling.CONTINUE_ON_FAILURE)

				//Verifying whether the decrement button is clickable or not
				WebUI.verifyElementNotClickable(findTestObject("Object Repository/Loan Details/decreamentButton"),FailureHandling.CONTINUE_ON_FAILURE)
			}else {

				//Clicking on principle button
				WebUI.click(findTestObject("Object Repository/Loan Details/principalRadioBtn"))

				//Verifying whether the amortization button is clickable or not
				WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/amortizationRadioBtn"),FailureHandling.CONTINUE_ON_FAILURE)
			}

			//Verifying whether the auto loan check box is clickable or not
			WebUI.verifyElementNotChecked(findTestObject("Object Repository/Loan Details/autoLoanCheckBox"), 10, FailureHandling.CONTINUE_ON_FAILURE)

			//Verifying whether the clear data button is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/Clear Data"), FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on calculate
			WebUI.click(findTestObject('Object Repository/Loan Details/Calculate'))

			//Verifying whether the update loan details button is clickable or not
			//			WebUI.verifyElementClickable(findTestObject("Object Repository/Loan Details/Update Loan Details"),FailureHandling.CONTINUE_ON_FAILURE)

			//Clicking on apply now
			WebUI.delay(2)
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject('Object Repository/Loan Details/Apply Now'))
			WebUI.delay(2)
			if(WebUI.verifyElementPresent(findTestObject('Object Repository/Borrower_Details/first_Name'), 2)) {
				WebUI.comment("We are in Borrower Detail Page")
			}else {
				WebUI.comment("We are in Wrong Page")
			}
		} catch (Exception e) {
			println(" Execution error having this issue : " + e.toString())

			//If the execution fails, screenshot will be captured.
			WebUI.takeScreenshot()
		}
	}
}