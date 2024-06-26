package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class InsuranceInformation {
	/**
	 * This method is for the AO Insurance Information 
	 * @return
	 */
	@Keyword
	def insuranceInformationForAO() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the Encoder Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForEncoder() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	/**
	 * This method is for the Fullfillment Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForFullfillmentWithAndWithout() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/detailCode"), 1)
//
//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/modeOfPayment"), 2)
//
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/modeOfPayment"), 2)
//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/paymentFrequency"), 1)
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/paymentFrequency"), 2)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the Fullfillment Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForFullfillment() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))


			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/detailCode"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

//			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/modeOfPayment"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			//			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/effectiveDateOfADA"),"05/06/2024")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/accountNumber"), "565756644")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/accountName"), "Adarsh")
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/paymentFrequency"), 1)

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/paymentFrequency"), 1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(1)

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}





	/**
	 * This method is for the Fullfillment Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForFullfillmentNSTP() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))


			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/detailCode"), 1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/modeOfPayment"), 1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.delay(1)

			//			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/effectiveDateOfADA"),"06/06/2024")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/accountNumber"), "565756644")
			//
			//			WebUI.setText(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/accountName"), "Adarsh")
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/paymentFrequency"), 1)

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.delay(1)
			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the COApprover Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForCOApprover() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the Encoder Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForEncoderPaperBased() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the COApprover Insurance Information Paperbased
	 * @return
	 */
	@Keyword
	def insuranceInformationForCOApproverPaperbased() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the AO Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForAOPaperbase() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the Fullfillment Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForFullfillmentPaperbase() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))


			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/detailCode"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/modeOfPayment"), 2)

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/paymentFrequency"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the AO Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForSD_Approver() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))

			WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOffice/Fulfillment/InsuranceInformationWithoutAPI/paymentFrequency"), 1)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the AO Insurance Information
	 * @return
	 */
	@Keyword
	def insuranceInformationForCommon() {
		try {
			//clicking on the Insurance Information tab
			WebUI.click(findTestObject("Object Repository/TabSection/InsuranceInformation"))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}


