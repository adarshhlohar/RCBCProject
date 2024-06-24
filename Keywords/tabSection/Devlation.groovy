package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




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
	 * This metnhod is for the Fullfillment Devlations
	 * @return
	 */
	@Keyword
	def deviationForFullfillment() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This metnhod is for the COMaker Devlations
	 * @return
	 */
	@Keyword
	def deviationForCOMaker() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This metnhod is for the COMaker Devlations
	 * @return
	 */
	@Keyword
	def deviationForCOApprover() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This metnhod is for the COMaker Devlations Paperbase
	 * @return
	 */
	@Keyword
	def deviationForCOMakerPaperbase() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This metnhod is for the COMaker Devlations
	 * @return
	 */
	@Keyword
	def deviationForCOApproverPaperbased() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This method is for the AO Deviations
	 * @return
	 */
	@Keyword
	def deviationForAOPaperbase() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This metnhod is for the Fullfillment Devlations
	 * @return
	 */
	@Keyword
	def deviationForFullfillmentPaperbased() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This metnhod is for the Fullfillment Devlations
	 * @return
	 */
	@Keyword
	def deviationForCommon() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
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
	 * This metnhod is for the sd_Approve Devlations
	 * @return
	 */
	@Keyword
	def deviationForSD_Approve() {
		try {
			//clicking on the deviations tab
			WebUI.click(findTestObject("Object Repository/TabSection/Devlations"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/salesDeviation"))

			WebUI.delay(1)

			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/Approve"))

			WebUI.delay(1)

			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/saveChanges"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()



			//			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/salesDeviation2"))
			//
			//			WebUI.delay(1)
			//
			//			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/Approve"))
			//
			//			WebUI.delay(1)
			//
			//			WebUI.click(findTestObject("Object Repository/FulfillmentDeviation/saveChanges"))
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

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				WebUI.delay(1)
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/saveChanges"))
	
			}


			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BirthDate"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BirthDate"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				WebUI.delay(1)
				WebUI.delay(1)
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/saveChanges"))
				
	
			}


			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName2"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BorrowerName2"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				WebUI.delay(1)
				GlobalVariableUtil.captureScreenShotWithTime()
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/saveChanges"))
			}


			if(WebUI.verifyElementClickable(findTestObject("Object Repository/BackOffice/Deviation/BirthDate2"), FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/BirthDate2"))
				WebUI.delay(1)
				WebUI.click(findTestObject("Object Repository/BackOffice/Deviation/Approve"))
				WebUI.delay(1)
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
}
