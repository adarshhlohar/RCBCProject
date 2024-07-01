package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable




public class Deviation {
	/**
	 * This method is for the AO Deviations
	 * @return
	 */
	@Keyword
	def deviationForAO() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This metnhod is for the Fullfillment Devlations
	 * @return
	 */
	@Keyword
	def deviationForFullfillment() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COMaker Devlations
	 * @return
	 */
	@Keyword
	def deviationForCOMaker() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COMaker Devlations
	 * @return
	 */
	@Keyword
	def deviationForCOApprover() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COMaker Devlations Paperbase
	 * @return
	 */
	@Keyword
	def deviationForCOMakerPaperbase() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COMaker Devlations
	 * @return
	 */
	@Keyword
	def deviationForCOApproverPaperbased() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This method is for the AO Deviations
	 * @return
	 */
	@Keyword
	def deviationForAOPaperbase() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Fullfillment Devlations
	 * @return
	 */
	@Keyword
	def deviationForFullfillmentPaperbased() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the Fullfillment Devlations
	 * @return
	 */
	@Keyword
	def deviationForCommon() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}





	/**
	 * This metnhod is for the sd_Approve Devlations
	 * @return
	 */
	@Keyword
	def deviationForSD_Approve() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))

			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/salesDeviation"))
			WebUI.delay(1)
			def oldValue = WebUI.getAttribute(findTestObject("Object Repository/FulfillmentDeviation/OldValue"), "title")
			println(oldValue)
			def newValue = WebUI.getAttribute(findTestObject("Object Repository/FulfillmentDeviation/newValue"), "title")
			println(newValue)
			def amemdedfield = WebUI.getAttribute(findTestObject("Object Repository/FulfillmentDeviation/AmendedField"), "title")

			//			float verifyNewDIValue = Float.parseFloat(String.format("%.2f", Float.parseFloat(GlobalVariable.NewDIRate)))
			//			println(" ***** " + verifyNewDIValue)
			//			String verifyNewDIValueStr = verifyNewDIValue.toString()
			//
			//			float verifyNewSIValue = Float.parseFloat(String.format("%.2f", Float.parseFloat(GlobalVariable.NewSIRate)))
			//			println(" ***** " + verifyNewSIValue)
			//			String verifyNewSIValueStr = verifyNewSIValue.toString()
			//
			//			if(amemdedfield.equalsIgnoreCase("DI %Rate")) {
			//				Assert.assertEquals(GlobalVariable.OldDIRate, oldValue)
			//				Assert.assertEquals(verifyNewDIValueStr, newValue)
			//			}else if(amemdedfield.equalsIgnoreCase("SI %Rate")){
			//				Assert.assertEquals(GlobalVariable.OldSIRate, oldValue)
			//				Assert.assertEquals(verifyNewSIValueStr, newValue)
			//			}
			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/Approve"))
			WebUI.delay(1)
			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/saveChanges"))
			GlobalVariableUtil.captureScreenShotWithTime()
			GlobalVariableUtil.loadGlobalVariable()
			if(WebUI.waitForElementPresent(findTestObject("Object Repository/FulfillmentDeviation/salesDeviation2"), 2)) {
				WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/salesDeviation2"))
				WebUI.delay(1)
				oldValue = WebUI.getAttribute(findTestObject("Object Repository/FulfillmentDeviation/OldValue"), "title")
				println(oldValue)
				newValue = WebUI.getAttribute(findTestObject("Object Repository/FulfillmentDeviation/newValue"), "title")
				println(newValue)
				amemdedfield = WebUI.getAttribute(findTestObject("Object Repository/FulfillmentDeviation/AmendedField"), "title")

				//				verifyNewDIValue = Float.parseFloat(String.format("%.2f", Float.parseFloat(GlobalVariable.NewDIRate)))
				//				println(" ***** " + verifyNewDIValue)
				//				verifyNewDIValueStr = verifyNewDIValue.toString()
				//
				//				verifyNewSIValue = Float.parseFloat(String.format("%.2f", Float.parseFloat(GlobalVariable.NewSIRate)))
				//				println(" ***** " + verifyNewSIValue)
				//				verifyNewSIValueStr = verifyNewSIValue.toString()
				//
				//				if(amemdedfield.equalsIgnoreCase("DI %Rate")) {
				//					Assert.assertEquals(GlobalVariable.OldDIRate, oldValue)
				//					Assert.assertEquals(verifyNewDIValue, newValue)
				//				}else if(amemdedfield.equalsIgnoreCase("SI %Rate")){
				//					Assert.assertEquals(GlobalVariable.OldSIRate, oldValue)
				//					Assert.assertEquals(verifyNewSIValue, newValue)
				//				}
				WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/Approve"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/saveChanges"))
			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	@Keyword
	def deviationForChangeinNameAndDOB() {
		try {
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))

			GlobalVariableUtil.captureScreenShotWithTime()

			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/saveChanges"))
			}


			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BirthDate"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BirthDate"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/saveChanges"))
			}


			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName2"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName2"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/saveChanges"))
			}


			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BirthDate2"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BirthDate2"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/saveChanges"))
			}
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}
		catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the Booking Devlations
	 * @return
	 */
	@Keyword
	def deviationForBooking() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
