package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class AlertsSummary {
	/**
	 * This metnhod is for the AO Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForAO() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))
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
	 * This metnhod is for the Fullfillment Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForFullfillment() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))

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
	 * This metnhod is for the COMaker Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForCOMaker() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))
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
	 * This method is for the COApprover Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForCOApprover() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))
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
	 * This metnhod is for the COMaker Alert Summary paperbased
	 * @return
	 */
	@Keyword
	def alertsSummaryForCOMakerPaperbased() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))

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
	 * This method is for the COApprover Alert Summary paper based
	 * @return
	 */
	@Keyword
	def alertsSummaryForCOApproverPaperbased() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))

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
	 * This metnhod is for the AO Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForAOPaperbase() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))

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
	 * This metnhod is for the Fullfillment Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForFullfillmentPaperbase() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))

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
	 * This metnhod is for the AO Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForCommon() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))

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
	 * This metnhod is for the AO Alert Summary
	 * @return
	 */
	@Keyword
	def alertsSummaryForBooking() {
		try {
			//clicking on alert summary tab
			WebUI.click(findTestObject("Object Repository/TabSection/AlertSummary"))

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