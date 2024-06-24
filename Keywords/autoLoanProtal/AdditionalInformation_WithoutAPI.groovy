package autoLoanProtal
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class AdditionalInformationWithoutAPI {

	/*
	 * 1.This is Additional Information page without API.
	 * 2. @param: coBorrowerRelationshipWithBorrower,coBorrowerFirstName,coBorrowerMiddleName,coBorrowerLastName,coBorrowerSuffix.
	 * 3.The data inside param is used as data driven.
	 */


	@Keyword
	def coBorrowersDetails(String coBorrowerRelationshipWithBorrower, String coBorrowerFirstName,String coBorrowerMiddleName,String coBorrowerLastName,String coBorrowerSuffix){

		try {
			WebUI.waitForPageLoad(10)
			WebUI.verifyElementPresent(findTestObject("Object Repository/AdditionalInformationWithoutAPI/additionPageLogo"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			//C - Co-Worker, F - Friends, P - Parents, R - Relative, S - Spouse

			//Selecting co borrower relationship with borrower
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithoutAPI/CoBorrowerDetail/coBorrowerRelationshipWithBorrower"), coBorrowerRelationshipWithBorrower, true)

			//Entering co borrower's first name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithoutAPI/CoBorrowerDetail/coBorrowerFirstName"), coBorrowerFirstName)

			//Entering co borrower's middle name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithoutAPI/CoBorrowerDetail/coBorrowerMiddleName"), coBorrowerMiddleName)

			//Entering co borrower's last name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithoutAPI/CoBorrowerDetail/coBorrowerLastName"), coBorrowerLastName)

			// SF2 - Sr., SF1 - Jr., SF3 - III, SF4 - IV

			//Selecting co borrower's suffix
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithoutAPI/CoBorrowerDetail/coBorrowerSuffix"), coBorrowerSuffix, true)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on continue button
			WebUI.click(findTestObject("Object Repository/AdditionalInformationWithoutAPI/button_Continue"))

			if(WebUI.verifyElementPresent(findTestObject("Object Repository/UploadYourDocuments/uploadYourDocumentText"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in Upload Document Page")
			}else {
				WebUI.comment("We are not on Upload Document Page")
			}
		}catch(Exception e) {

			//If the execution fails,screenshot will be captured
			WebUI.takeScreenshot()
			println(e.toString())
		}
	}
}
