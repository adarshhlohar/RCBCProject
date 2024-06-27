package tabSection
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil



public class LoanInformation {


	/**
	 * This method is for preRelease Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForPreRelease(String marketingPromoCode, String loanPurpose, String modeOfRelease, String scheduleUnitReleaseDate, String actualUnitReleaseDate, String paymentType, String paymentFrequecy, String modeOfPayment,String effectiveDateOfAda,String accountNumber,String accountName) {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			//			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'))
			//			WebUI.delay(2)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'),marketingPromoCode, true)
			GlobalVariableUtil.captureScreenShotWithTime()

			//			WebUI.delay(2)
			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/loanPurpose'),loanPurpose,false)

			WebUI.delay(1)
			//		WebUI.setText(findTestObject("Object Repository/LoanInformationPreRelease/AMFPrecent"), "2")
			GlobalVariableUtil.captureScreenShotWithTime()

			//			WebUI.delay(2)
			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfRelease'),modeOfRelease,false)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/scheduledUnitReleaseDate'), scheduleUnitReleaseDate)

			WebUI.delay(1)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/actualUnitReleaseDate'), actualUnitReleaseDate)
			GlobalVariableUtil.captureScreenShotWithTime()

			def currentIndex = WebUI.getWindowIndex()

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/calculateBtn"))

			currentIndex = currentIndex + 1

			WebUI.switchToWindowIndex(currentIndex)

			WebUI.delay(3)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(3)
			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/WebSpredingSaveBtn"))

			WebUI.delay(5)

			WebUI.closeWindowIndex(currentIndex)

			WebUI.switchToWindowIndex(currentIndex - 1)

			currentIndex = currentIndex - 1

			WebUI.delay(2)

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/updateBtn"))
			//			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/updateBtn"), Keys.chord(Keys.ENTER))
			WebUI.delay(2)


			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentType'),paymentType,false)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentFrequency'),paymentFrequecy,false)

			GlobalVariableUtil.captureScreenShotWithTime()

			String totalCmf = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCmf"),"title")
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.scrollToElement(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), 2)

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"))

			if(!(totalCmf.equals(""))){
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), totalCmf)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), "0")
			}



			String totalMotorCarInsurance = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCarInsurance"), "title")

			WebUI.doubleClick(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"))
			if(!(totalMotorCarInsurance.equals(""))) {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"), totalMotorCarInsurance)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"), "0")
			}


			GlobalVariableUtil.captureScreenShotWithTime()

			String totalAdvancePayment = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalAdvancePayment"), "title")

			WebUI.doubleClick(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"))
			if(!(totalAdvancePayment.equals(""))) {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"), totalAdvancePayment)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"), "0")
			}
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(2)

			WebUI.sendKeys(findTestObject('Object Repository/LoanInformationPreRelease/totalCMFCollectedByDealer'), totalCmf)

			GlobalVariableUtil.captureScreenShotWithTime()
			if(modeOfPayment.equalsIgnoreCase("OTC")) {
				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
				//				WebUI.delay(2)
			}else if(modeOfPayment.equalsIgnoreCase("ADA")){
				WebUI.delay(2)
				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
				WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/ModeOfPaymentADA/effectiveDateOfAda'),effectiveDateOfAda)
				WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/ModeOfPaymentADA/accountNumber'),accountNumber)
				WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/ModeOfPaymentADA/accountName'), accountName)
				GlobalVariableUtil.captureScreenShotWithTime()
			}
			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/Save"))
			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/updateBtn"))
			WebUI.delay(2)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	/**
	 * This method is for preRelease Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForPreReleaseForAmendmentNSTP(String marketingPromoCode, String loanPurpose, String modeOfRelease, String scheduleUnitReleaseDate, String actualUnitReleaseDate, String paymentType, String paymentFrequecy, String modeOfPayment,String effectiveDateOfAda,String accountNumber,String accountName) {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.click(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'))

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'),marketingPromoCode, true)

			WebUI.comment("before Changing Actual Cashout")

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(1)

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"))

			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"), "49999")

			WebUI.comment("before Changing Actual Cashout")

			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(1)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/loanPurpose'),loanPurpose,false)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfRelease'),modeOfRelease,false)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/scheduledUnitReleaseDate'), scheduleUnitReleaseDate)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/actualUnitReleaseDate'), actualUnitReleaseDate)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			def currentIndex = WebUI.getWindowIndex()

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/calculateBtn"))

			currentIndex = currentIndex + 1

			WebUI.switchToWindowIndex(currentIndex)

			WebUI.delay(5)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/WebSpredingSaveBtn"))

			WebUI.delay(4)

			WebUI.closeWindowIndex(currentIndex)

			WebUI.switchToWindowIndex(currentIndex - 1)

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/updateBtn"))

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentType'),paymentType,false)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentFrequency'),paymentFrequecy,false)

			String totalCmf = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCmf"),"title")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.scrollToElement(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), 2)

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"))

			if(!(totalCmf.equals(""))){
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), totalCmf)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), "0")
			}

			WebUI.delay(2)

			WebUI.sendKeys(findTestObject('Object Repository/LoanInformationPreRelease/totalCMFCollectedByDealer'), totalCmf)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			if(modeOfPayment.equalsIgnoreCase("OTC")) {

				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
			}else {
				WebUI.delay(2)
				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
				WebUI.setText(findTestObject('Object Repository/DealerPreRelease/LoanInformation/effectiveDateOfAda'),effectiveDateOfAda,true)
				WebUI.setText(findTestObject('Object Repository/DealerPreRelease/LoanInformation/accountNumber'),accountNumber)
				WebUI.setText(findTestObject('Object Repository/DealerPreRelease/LoanInformation/accountName'), accountName)
			}

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
	 * This method is for preRelease Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForPreReleaseAmendmentChangeActualCashout(String marketingPromoCode, String loanPurpose, String modeOfRelease, String scheduleUnitReleaseDate, String actualUnitReleaseDate, String paymentType, String paymentFrequecy, String modeOfPayment,String effectiveDateOfAda,String accountNumber,String accountName) {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.click(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'))

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'),marketingPromoCode, true)

			WebUI.comment("before Changing Actual Cashout")

			WebUI.delay(1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(1)

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"))

			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"), "39999")

			WebUI.comment("before Changing Actual Cashout")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(1)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/loanPurpose'),loanPurpose,false)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfRelease'),modeOfRelease,false)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/scheduledUnitReleaseDate'), scheduleUnitReleaseDate)

			WebUI.delay(1)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/actualUnitReleaseDate'), actualUnitReleaseDate)

			def currentIndex = WebUI.getWindowIndex()

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/calculateBtn"))

			currentIndex = currentIndex + 1

			WebUI.switchToWindowIndex(currentIndex)
			WebUI.delay(3)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(3)
			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/WebSpredingSaveBtn"))

			WebUI.delay(2)

			WebUI.closeWindowIndex(currentIndex)

			WebUI.switchToWindowIndex(currentIndex - 1)
			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentType'),paymentType,false)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentFrequency'),paymentFrequecy,false)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			String totalCmf = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCmf"),"title")

			WebUI.scrollToElement(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), 2)

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"))

			if(!(totalCmf.equals(""))){
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), totalCmf)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), "0")
			}

			WebUI.delay(5)

			WebUI.sendKeys(findTestObject('Object Repository/LoanInformationPreRelease/totalCMFCollectedByDealer'), totalCmf)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			//			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/DIRate"), 10)

			if(modeOfPayment.equalsIgnoreCase("OTC")) {
				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
				//				WebUI.delay(2)
			}else {
				WebUI.delay(2)
				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
				WebUI.setText(findTestObject('Object Repository/DealerPreRelease/LoanInformation/effectiveDateOfAda'),effectiveDateOfAda,true)
				WebUI.setText(findTestObject('Object Repository/DealerPreRelease/LoanInformation/accountNumber'),accountNumber)
				WebUI.setText(findTestObject('Object Repository/DealerPreRelease/LoanInformation/accountName'), accountName)
			}

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
	 * This method is for preRelease Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForPreReleaseAmendmentChangeActualCashoutWithout(String marketingPromoCode, String loanPurpose, String modeOfRelease, String scheduleUnitReleaseDate, String actualUnitReleaseDate, String paymentType, String paymentFrequecy, String modeOfPayment,String effectiveDateOfAda,String accountNumber,String accountName) {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.click(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'))

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/marketingPromoCode'),marketingPromoCode, true)

			WebUI.comment("before Changing Actual Cashout")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(1)

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"))

			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"), "199999")

			WebUI.comment("After Changing Actual Cashout")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/loanPurpose'),loanPurpose,false)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfRelease'),modeOfRelease,false)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/scheduledUnitReleaseDate'), scheduleUnitReleaseDate)

			WebUI.delay(1)

			WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/actualUnitReleaseDate'), actualUnitReleaseDate)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			def currentIndex = WebUI.getWindowIndex()

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/calculateBtn"))

			currentIndex = currentIndex + 1

			WebUI.switchToWindowIndex(currentIndex)

			WebUI.delay(5)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/WebSpredingSaveBtn"))

			WebUI.delay(2)

			WebUI.closeWindowIndex(currentIndex)

			WebUI.switchToWindowIndex(currentIndex - 1)
			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentType'),paymentType,false)

			WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/paymentFrequency'),paymentFrequecy,false)

			String totalCmf = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCmf"),"title")

			WebUI.scrollToElement(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"),2)

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"))

			if(!(totalCmf.equals(""))){
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), totalCmf)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), "0")
			}

			WebUI.delay(5)

			WebUI.sendKeys(findTestObject('Object Repository/LoanInformationPreRelease/totalCMFCollectedByDealer'), totalCmf)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			//			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/DIRate"), 10)

			if(modeOfPayment.equalsIgnoreCase("OTC")) {
				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
				//				WebUI.delay(2)
			}else if(modeOfPayment.equalsIgnoreCase("ADA")){
				WebUI.delay(2)
				WebUI.selectOptionByValue(findTestObject('Object Repository/LoanInformationPreRelease/modeOfPayment'),modeOfPayment,true)
				WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/ModeOfPaymentADA/effectiveDateOfAda'),effectiveDateOfAda)
				WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/ModeOfPaymentADA/accountNumber'),accountNumber)
				WebUI.setText(findTestObject('Object Repository/LoanInformationPreRelease/ModeOfPaymentADA/accountName'), accountName)
			}

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
	 * This method is for AO Without Loan Information
	 * @return
	 */

	@Keyword
	def loanInfoForAo(){
		try {
			//			WebUI.delay(2)
			//			//clicking on loan information tab
			//			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
			//
			//			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), 2)
			//
			//			WebUI.delay(1)
			//			String oldSIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"), "title")
			//			GlobalVariableUtil.saveGlobalVariable("OldSIRate", oldSIRate)
			//			String oldDIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), "title")
			//			GlobalVariableUtil.saveGlobalVariable("OldDIRate", oldDIRate)
			//			//			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"),"8")
			//			//			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), "18")
			//			WebUI.delay(1)
			//			GlobalVariableUtil.captureScreenShotWithTime()




			WebUI.delay(2)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), 2)

			WebUI.delay(1)
			String oldSIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"), "title")
			GlobalVariableUtil.saveGlobalVariable("OldSIRate", oldSIRate)
			String oldDIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), "title")
			GlobalVariableUtil.saveGlobalVariable("OldDIRate", oldDIRate)

			Float oldSINum = Float.parseFloat(oldSIRate)

			Float oldDINum = Float.parseFloat(oldDIRate)

			def newSIRate = "8";
			def newDIRate = "18";

			//			println("*** String -> " + oldDIRate + " *** Number -> " + oldDINum + " *** String -> " + newDIRate + " **** String -> " + oldSIRate + "  **** Number -> " + oldSINum + " **** String " + newSIRate)
			GlobalVariableUtil.saveGlobalVariable("NewDIRate", newDIRate)
			GlobalVariableUtil.saveGlobalVariable("NewSIRate", newSIRate)

			def isDeviation = false

			if(!isDeviation) {
				isDeviation = true
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"),newSIRate)
				WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"),newDIRate)
				WebUI.delay(1)
				GlobalVariableUtil.captureScreenShotWithTime()
			}

			String isDeviationStr = isDeviation.toString()
			println(" ******* " + isDeviation + " ***** " + isDeviationStr)
			GlobalVariableUtil.saveGlobalVariable("isDeviation", isDeviationStr)

			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/updateBtn"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is for AO Without Loan Information
	 * @return
	 */

	@Keyword
	def loanInfoForAoWithout(){
		try {
			WebUI.delay(2)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), 2)

			WebUI.delay(1)
			String oldSIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"), "title")
			GlobalVariableUtil.saveGlobalVariable("OldSIRate", oldSIRate)
			String oldDIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), "title")
			GlobalVariableUtil.saveGlobalVariable("OldDIRate", oldDIRate)

			//			float oldSINum = Float.parseFloat(oldSIRate)
			//
			//			float oldDINum = Float.parseFloat(oldDIRate)

			//			oldSINum = oldSINum + 0.1;
			//			oldDINum = oldDINum + 0.1;
			def newSIRate = "9";
			def newDIRate = "17";

			//						def newSIRate = oldSINum.toString()
			//						def newDIRate = oldDINum.toString()

			//			println("*** String -> " + oldDIRate + " *** Number -> " + oldDINum + " *** String -> " + newDIRate + " **** String -> " + oldSIRate + "  **** Number -> " + oldSINum + " **** String " + newSIRate)
			GlobalVariableUtil.saveGlobalVariable("NewSIRate", newSIRate)
			GlobalVariableUtil.saveGlobalVariable("NewDIRate", newDIRate)

			def isDeviation = false

			if(!isDeviation) {
				isDeviation = true
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"),newSIRate)
				WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"),newDIRate)
				WebUI.delay(1)
				GlobalVariableUtil.captureScreenShotWithTime()
			}

			String isDeviationStr = isDeviation.toString()
			println(" ******* " + isDeviation + " ***** " + isDeviationStr)
			GlobalVariableUtil.saveGlobalVariable("isDeviation", isDeviationStr)
			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/updateBtn"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for Encoder Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForEncoder(){
		try {
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is for COMAker Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForCOMakerForNSTP(){
		try {
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/LoanInformation/RCOfEncodingAO"), "QK_AO6")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/LoanInformation/RCOfAssignedAO"), "QK_AO6")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/LoanInformation/RCOfAccount"), "QK_AO6")
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
	 * This method is for COApprover Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForCOApprover(){
		try {
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
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
	 * This method is for fullfillment Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForFullFillmentWithAndWithout(){
		try {
			WebUI.delay(2)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/LoanInformationWithoutAPI/FundTransferPricing"), "40000")
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
	 * This method is for fulfillment Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForFullFillment(){
		try {
			WebUI.delay(2)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/LoanInformationWithoutAPI/FundTransferPricing"), "40000")
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
	 * This is for Encoder
	 */
	/*
	 def loanInfoForPaperbasedWithout() {
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/marketingPromoCode"), 1)
	 //		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Unit_Price"), "1000000")
	 WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Downpayment_Amt"), "350000")
	 WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Actual_Cashout"), "340000")
	 WebUI.delay(1)
	 GlobalVariableUtil.captureScreenShotWithTime()
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/loanTerm"), 5)
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/insuranceType"), 5)
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/loanPurpose"), 1)
	 WebUI.delay(1)
	 GlobalVariableUtil.captureScreenShotWithTime()
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/modeOfRelease"), 1)
	 WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Scheduled_Unit_Release_Date"), "19/07/2024")
	 WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Actual_Unit_Release_Date"), "25/07/2024")
	 WebUI.delay(1)
	 GlobalVariableUtil.captureScreenShotWithTime()
	 def currentIndex = WebUI.getWindowIndex()
	 WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/calculateBtn"))
	 currentIndex = currentIndex + 1
	 WebUI.switchToWindowIndex(currentIndex)
	 WebUI.delay(5)
	 GlobalVariableUtil.captureScreenShotWithTime()
	 WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/WebSpredingSaveBtn"))
	 WebUI.delay(2)
	 WebUI.closeWindowIndex(currentIndex)
	 WebUI.switchToWindowIndex(currentIndex - 1)
	 WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Total_CMFCollectedby_Dealer"), "4000")
	 WebUI.delay(1)
	 GlobalVariableUtil.captureScreenShotWithTime()
	 //		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/IRR_Percentage"), "8")
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Payment_Type"), 1)
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/PaymentFrequency"), 2)
	 WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Mode_Of_Payment"), 2)
	 WebUI.delay(1)
	 GlobalVariableUtil.captureScreenShotWithTime()
	 }
	 */


	/*
	 * This is for Encoder
	 */
	def loanInfoForPaperbased(String marketingPromoCode,String Downpayment_Amt,String Actual_Cashout,String loanTerm,String insuranceType,String loanPurpose,String modeOfRelease,String Scheduled_Unit_Release_Date, String Actual_Unit_Release_Date,String Total_CMFCollectedby_Dealer,String Payment_Type,String PaymentFrequency,String Mode_Of_Payment) {
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/marketingPromoCode"), marketingPromoCode)
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		//		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Unit_Price"), "1000000")

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Downpayment_Amt"), Downpayment_Amt)

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Actual_Cashout"), Actual_Cashout)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/loanTerm"), loanTerm)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/insuranceType"), insuranceType)

		WebUI.selectOptionByValue(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/loanPurpose"), loanPurpose,true)

		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/modeOfRelease"), modeOfRelease)

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Scheduled_Unit_Release_Date"), Scheduled_Unit_Release_Date)

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Actual_Unit_Release_Date"), Actual_Unit_Release_Date)

		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		def currentIndex = WebUI.getWindowIndex()

		WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/calculateBtn"))

		currentIndex = currentIndex + 1

		WebUI.switchToWindowIndex(currentIndex)
		WebUI.delay(5)
		GlobalVariableUtil.captureScreenShotWithTime()

		WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/WebSpredingSaveBtn"))

		WebUI.delay(2)

		WebUI.closeWindowIndex(currentIndex)

		WebUI.switchToWindowIndex(currentIndex - 1)

		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Total_CMFCollectedby_Dealer"), Total_CMFCollectedby_Dealer)
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()

		//		WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/IRR_Percentage"), "8")

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Payment_Type"), Payment_Type)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/PaymentFrequency"), PaymentFrequency)

		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Mode_Of_Payment"), Mode_Of_Payment)

		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}

	/**
	 * This method is for Encoder PaperBased Loan Information
	 * @return
	 */
	/*
	 @Keyword
	 def loanInfoForEncoderPaperBasedWithout(){
	 try {
	 WebUI.delay(2)
	 //clicking on loan information tab
	 WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
	 WebUI.delay(1)
	 GlobalVariableUtil.captureScreenShotWithTime()
	 loanInfoForPaperbased()
	 }catch(Exception e) {
	 //If the script is fail it will take the ScreenShot Where the Script is failed
	 WebUI.takeScreenshot()
	 //printing the reason in console
	 println(e.toString())
	 }
	 }
	 */



	/**
	 * This method is for Encoder PaperBased Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForEncoderPaperBased(String marketingPromoCode,String Downpayment_Amt,String Actual_Cashout,String loanTerm,String insuranceType,String loanPurpose,String modeOfRelease,String Scheduled_Unit_Release_Date, String Actual_Unit_Release_Date,String Total_CMFCollectedby_Dealer,String Payment_Type,String PaymentFrequency,String Mode_Of_Payment){
		try {
			WebUI.delay(2)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			loanInfoForPaperbased(marketingPromoCode,Downpayment_Amt,Actual_Cashout,loanTerm,insuranceType,loanPurpose,modeOfRelease,Scheduled_Unit_Release_Date,Actual_Unit_Release_Date,Total_CMFCollectedby_Dealer,Payment_Type,PaymentFrequency,Mode_Of_Payment)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for COMAker Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForCOMakerForPaperbased(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			//			WebUI.setText(findTestObject("Object Repository/BackOfficePaperBase/COMaker/LoanInformation/RCOfEncodingAO"),"QK_AO6")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/LoanInformation/RCOfAssignedAO"), "QK_AO6")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/COMaker/LoanInformation/RCOfAccount"), "QK_AO6")
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
	 * This method is for COApprover Loan Information Paper based
	 * @return
	 */
	@Keyword
	def loanInfoForCOApproverPaperbased(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
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
	 * This method is for PreRelease Loan Information Paper based
	 * @return
	 */
	@Keyword
	def loanInfoForPrereleasePaperbased(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is for PreRelease Loan Information Paper based
	 * @return
	 */
	@Keyword
	def loanInfoForPrereleasePaperbasedWithWithout(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			GlobalVariableUtil.captureScreenShotWithTime()

			String totalAdvancePayment = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalAdvancePayment"), "title")

			WebUI.doubleClick(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"))
			if(!(totalAdvancePayment.equals(""))) {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"), totalAdvancePayment)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"), "0")
			}
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment5"), "0")
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment6"), "0")

			String totalCmf = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCmf"),"title")

			WebUI.doubleClick(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment4"))

			if(!(totalCmf.equals(""))){
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), totalCmf)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), "0")
			}

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment5"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF5"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto5"), "0")

			String totalMotorCarInsurance = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCarInsurance"), "title")

			WebUI.doubleClick(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"))
			if(!(totalMotorCarInsurance.equals(""))) {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"), totalMotorCarInsurance)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"), "0")
			}
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance5"), "0")
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance6"), "0")
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}





	/**
	 * This method is for PreRelease Loan Information Paper based
	 * @return
	 */
	@Keyword
	def loanInfoForPrereleasePaperbasedWithAmendment(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"))

			WebUI.comment("Before Changing")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.delay(1)

			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"), "39999")

			WebUI.comment("After Changing")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.delay(1)

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment5"), "0")
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment6"), "0")

			String totalCmf = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCmf"),"title")

			WebUI.doubleClick(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment4"))

			if(!(totalCmf.equals(""))){
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), totalCmf)
			}else {
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), "0")
			}

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment5"), "0")
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment6"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF5"), "0")
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF6"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto5"), "0")
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto6"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance5"), "0")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance6"), "0")
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This method is for PreRelease Loan Information Paper based
	 * @return
	 */
	@Keyword
	def loanInfoForPrereleasePaperbasedWithoutAmendment(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.doubleClick(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"))

			WebUI.comment("Before Changing")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.delay(1)

			WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/actualCashout"), "199999")

			WebUI.delay(1)

			WebUI.comment("After Changing")

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.takeScreenshot()

			WebUI.delay(1)

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment5"), "0")
			//WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment6"), "0")

			String totalCmf = WebUI.getAttribute(findTestObject("Object Repository/LoanInformationPreRelease/paymentScheme/totalCmf"),"title")

			WebUI.doubleClick(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment4"))

			if(!(totalCmf.equals(""))){
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), totalCmf)
			}else{
				WebUI.sendKeys(findTestObject("Object Repository/LoanInformationPreRelease/billPayment"), "0")
			}

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment5"), "0")
			//WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment6"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF5"), "0")
			//WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF6"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto5"), "0")
			//WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto6"), "0")

			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance4"), "0")
			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance5"), "0")
			//WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance6"), "0")
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
	 * This method is for AO Without Loan Information
	 * @return
	 */

	@Keyword
	def loanInfoForAOWithoutPaperbase(){
		try {
			//			WebUI.delay(1)
			//			//clicking on loan information tab
			//			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
			//
			//			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), 2)
			//
			//			WebUI.delay(1)
			//			String oldSIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"), "title")
			//			GlobalVariableUtil.saveGlobalVariable("OldSIRate", oldSIRate)
			//			String oldDIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), "title")
			//			GlobalVariableUtil.saveGlobalVariable("OldDIRate", oldDIRate)



			WebUI.delay(2)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), 2)

			WebUI.delay(1)
			String oldSIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"), "title")
			GlobalVariableUtil.saveGlobalVariable("OldSIRate", oldSIRate)
			String oldDIRate = WebUI.getAttribute(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"), "title")
			GlobalVariableUtil.saveGlobalVariable("OldDIRate", oldDIRate)

			Float oldSINum = Float.parseFloat(oldSIRate)

			Float oldDINum = Float.parseFloat(oldDIRate)

			//			oldSINum = oldSINum + 0.1;

			//			oldDINum = oldDINum + 0.1;

			//			def newSIRate = oldSINum.toString()
			//			def newDIRate = oldDINum.toString()
			def newSIRate = "8";
			def newDIRate = "18";

			//			println("*** String -> " + oldDIRate + " *** Number -> " + oldDINum + " *** String -> " + newDIRate + " **** String -> " + oldSIRate + "  **** Number -> " + oldSINum + " **** String " + newSIRate)
			GlobalVariableUtil.saveGlobalVariable("NewDIRate", newDIRate)
			GlobalVariableUtil.saveGlobalVariable("NewSIRate", newSIRate)


			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/SIRate"),newSIRate)
			WebUI.setText(findTestObject("Object Repository/BackOffice/AO/LoanInfo/DIRate"),newDIRate)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/LoanInformationPreRelease/updateBtn"))
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
	 * This method is for fullfillment Loan Information
	 * @return
	 */
	@Keyword
	def loanInfoForFullFillmentPaperbase(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/LoanInformationWithoutAPI/FundTransferPricing"), "40000")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/advancePayment6"), "0")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/cmfPayment6"), "0")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/excessEMF6"), "0")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/lto6"), "0")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/PreReleasePaperbaseLoanInfo/motorCarInsurance6"), "0")
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
	 * This method is for PreRelease Loan Information Paper based
	 * @return
	 */
	@Keyword
	def loanInfoCommon(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	/**
	 * This method is for PreRelease Loan Information Paper based
	 * @return
	 */
	@Keyword
	def loanInfoCommonForAfterAmendment(){
		try {
			WebUI.delay(1)
			//clicking on loan information tab
			WebUI.click(findTestObject('Object Repository/TabSection/LoanInformation'))

			WebUI.scrollToElement(findTestObject("Object Repository/BackOfficePaperBase/EncoderPaperbaseLoanInformation/Actual_Cashout"), 2)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.comment("After Amendment")

			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}