package tabSection

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class CollateralInformation {





	/*
	 * This method is used for the preRelease collateral information
	 */
	@Keyword
	def collateralInformationForPreRelease(String serialOrChessisNum, String motorOrEngineNum,String conductionSticker) {

		try {

			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))

			//			WebUI.sendKeys(findTestObject('Object Repository/CollateralInformationPreRelease/SerialOrChessisNumber'), serialOrChessisNum)
			//
			//			WebUI.sendKeys(findTestObject('Object Repository/CollateralInformationPreRelease/MotorOrEngineNumber'), motorOrEngineNum)
			//
			//			WebUI.sendKeys(findTestObject('Object Repository/CollateralInformationPreRelease/ConductionSticker'), conductionSticker)


			//			WebUI.verifyElementClickable(findTestObject('Object Repository/CollateralInformationPreRelease/closeBtn'), FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()

			WebUI.click(findTestObject('Object Repository/CollateralInformationPreRelease/SaveBtn'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This method is used for the AO collateral information
	 */
	@Keyword
	def collateralInformationForAo() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 * This method is used for the Encoder collateral information
	 */
	@Keyword
	def collateralInformationForEncoder() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the fullfillment collateral information
	 */
	@Keyword
	def collateralInformationForFullfillment() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the fullfillment collateral information
	 */
	@Keyword
	def collateralInformationForCOApprover() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the COMaker collateral information
	 */
	@Keyword
	def collateralInformationForCOMAker() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	def collatralInfoForPaperBasedWithout() {
		WebUI.selectOptionByValue(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/vehicleCodeType"),"ALFA01",false)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/CarCondition"),1 )
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/carBrand"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/carModel"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/subModel"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/yearModel"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/makeType"), 1)
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}

	/*
	 * This method is used for the Encoder PaperBased collateral information
	 */
	@Keyword
	def collateralInformationForEncoderPaperBasedWithout() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))

			collatralInfoForPaperBasedWithout()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	def collatralInfoForPaperBasedWith() {
		WebUI.selectOptionByValue(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/vehicleCodeType"),"HNHR20",false)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/CarCondition"),1 )
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/carBrand"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/carModel"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/subModel"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/yearModel"), 1)
		WebUI.selectOptionByIndex(findTestObject("Object Repository/BackOfficePaperBase/EncoderCollateralInfoPaperbase/makeType"), 1)
		WebUI.delay(1)
		GlobalVariableUtil.captureScreenShotWithTime()
	}

	/*
	 * This method is used for the Encoder PaperBased collateral information
	 */
	@Keyword
	def collateralInformationForEncoderPaperBasedWith() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))

			collatralInfoForPaperBasedWith()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}

	/*
	 * This method is used for the COMaker collateral information paper Base
	 */
	@Keyword
	def collateralInformationForCOMAkerPaperbase() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the COApproval collateral information
	 */
	@Keyword
	def collateralInformationForCOApproverPaperbased() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the COApproval collateral information
	 */
	@Keyword
	def collateralInformationForPrereleasePaperbased() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the AO collateral information
	 */
	@Keyword
	def collateralInformationForAOPaperbase() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the fullfillment collateral information
	 */
	@Keyword
	def collateralInformationForFullfillmentPaperbased() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
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
	 * This method is used for the AO collateral information
	 */
	@Keyword
	def collateralInformationCommon() {
		try {
			//clicking on the tab Collateral info
			WebUI.click(findTestObject('Object Repository/TabSection/CollateralInformation'))
			WebUI.delay(1)
			GlobalVariableUtil.captureScreenShotWithTime()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
