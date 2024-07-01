package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable


public class CreditInvestigation {



	def saveCINumber() {
		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/AO/CI/CIRequestNumber"), 2)) {

			def CiRequestNumber = WebUI.getText(findTestObject("Object Repository/BackOffice/AO/CI/CIRequestNumber"))

			WebUI.println(" **** " + CiRequestNumber)

			String newCiNumber = GlobalVariableUtil.removeZerosAfterCI(CiRequestNumber)

			//				GlobalVariable.CI1 = result

			GlobalVariableUtil.saveGlobalVariable("CI1", newCiNumber)

			WebUI.comment(newCiNumber)

			WebUI.comment("CI is got......")
		}


		if(WebUI.waitForElementClickable(findTestObject("Object Repository/BackOffice/AO/CI/CIRequestNumber2"), 2)) {

			def CiRequestNumber = WebUI.getText(findTestObject("Object Repository/BackOffice/AO/CI/CIRequestNumber2"))

			WebUI.println(" **** " + CiRequestNumber)

			String newCiNumber = GlobalVariableUtil.removeZerosAfterCI(CiRequestNumber)

			//				GlobalVariable.CI1 = result

			GlobalVariableUtil.saveGlobalVariable("CI2", newCiNumber)

			WebUI.comment(newCiNumber)

			WebUI.comment("CI is got......")
		}
	}

	/**
	 * This metnhod is for the AO credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForAO() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

			saveCINumber()

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
	 * This metnhod is for the Encoder credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForEncoder() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))
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
	 * This metnhod is for the Fullfillment credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForFullfillment() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

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
	 * This metnhod is for the COMAker credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationCOMaker() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

			GlobalVariableUtil.captureScreenShotWithTime()


			//clicking on the next arrow button
			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
			WebUI.delay(1)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/**
	 * This metnhod is for the COApprover credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationCOApprover() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))
			saveCINumber()

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
	 * This metnhod is for the Encoder credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForEncoderPaperbased() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))
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
	 * This metnhod is for the Encoder credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForCOMakerPaperbased() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

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
	 * This metnhod is for the COApprover credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationCOApproverPaperbased() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))
			saveCINumber()

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
	 * This metnhod is for the AO credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForAOPaperbase() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

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
	 * This metnhod is for the Fullfillment credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForFullfillmentPaperbased() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

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
	 * This metnhod is for the Fullfillment credit Investigation
	 * @return
	 */
	@Keyword
	def creditInvestigationForCommon() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

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




	@Keyword
	def creditInvestigationForBooking() {
		try {
			//clicking the credit Investigation tab
			WebUI.click(findTestObject("Object Repository/TabSection/creditInvestigation"))

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
