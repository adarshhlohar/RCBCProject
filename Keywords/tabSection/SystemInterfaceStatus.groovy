package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class SystemInterfaceStatus {


	def checkALL() {
		if(WebUI.verifyElementPresent(findTestObject("Object Repository/BackOffice/SystemInterfaceStatus/IntegrationLogHighLight"), 1,FailureHandling.OPTIONAL)) {
			WebUI.scrollToElement(findTestObject("Object Repository/BackOffice/SystemInterfaceStatus/IntegrationLogHighLight"), 1,FailureHandling.OPTIONAL)
			GlobalVariableUtil.captureScreenShotWithTime()
		}
	}
	/**
	 * This is System Interface Status page
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForFullfillment() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))
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
	 * This is System Interface Status page
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForCOMaker() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))
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
	 * This is System Interface Status page
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForCOApprover() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))
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
	 * This is System Interface Status page paper based
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForCOMakerPaperbased() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))
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
	 * This is System Interface Status page
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForCOApproverPaperbased() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))

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
	 * This is System Interface Status page
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForFullfillmentPaperbased() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))

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
	 * This is System Interface Status page
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForCommon() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))

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
	 * This is System Interface Status page
	 * @return
	 */
	@Keyword
	def systemInterfaceStatusForBooking() {
		try {
			//clicking on the System Interface Status
			WebUI.click(findTestObject("Object Repository/TabSection/SystemInterfaceStatus"))

			GlobalVariableUtil.captureScreenShotWithTime()

			checkALL()

			WebUI.click(findTestObject("Object Repository/TabSection/nextArrowButton"))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
