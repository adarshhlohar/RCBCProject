package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class AuditTrail {


	/**
	 * This metnhod is for the AO Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForAO() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Encoder Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForEncoder() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
			

			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the Encoder Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForEncoderPaperbased() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the COMaker Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForCOMaker() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * This metnhod is for the COApprover Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForCOApprover() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This metnhod is for the COApprover Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForfullfillment() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COMaker Audit Trail paperbased
	 * @return
	 */
	@Keyword
	def auditTrailForCOMakerPaperbased() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COApprover Audit Trail paper based
	 * @return
	 */
	@Keyword
	def auditTrailForCOApproverPaperbased() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the AO Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForAOPaperbase() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/**
	 * This metnhod is for the COApprover Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForfullfillmentPaperbased() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))

			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			
			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}





	/**
	 * This metnhod is for the COApprover Audit Trail
	 * @return
	 */
	@Keyword
	def auditTrailForCommon() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AuditTrail"))
			
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			//clicking on next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}