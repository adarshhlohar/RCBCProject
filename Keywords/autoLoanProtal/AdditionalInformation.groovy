package autoLoanProtal
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class AdditionalInformationWithAPI {

	/*
	 * 1.This is Additional Information page with API.
	 * 2.Here will we provide the additional information of the client/borrower.
	 * 3.@param: nationality,visaType,sex,occupation,idType,idNumber,accountNumber.
	 * 4.The data inside param is used as data driven.
	 */

	@Keyword
	def borrowersDetail(String nationality,String visaType,String sex,String occupation,String idType,String idNumber,String accountNumber) {
		try {
			WebUI.waitForPageLoad(10)
			WebUI.verifyElementPresent(findTestObject("Object Repository/AdditionalInformationWithoutAPI/additionPageLogo"), 2, FailureHandling.CONTINUE_ON_FAILURE)

			//			int max =9
			//
			//			int min = 1
			//
			//			int x = (int)(Math.random()*(max-min+1)+min);
			//			int y = (int)(Math.random()*(max-min+1)+min);
			//			int z = (int)(Math.random()*(max-min+1)+min);

			//Selecting nationality of the borrower
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerDetail/nationality"), nationality, false)

			//Selecting Visa type of the borrower
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerDetail/visaType"), visaType, false)

			//Selecting sex/gender of the borrower
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerDetail/sex"), sex, false)

			//Selecting occupation of the borrower
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerDetail/occupation"), occupation, false)

			//Selecting the Id type of the borrower
			WebUI.selectOptionByIndex(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerDetail/idType"), 1)

			//Entering the Id number of the borrower
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerDetail/idNumber"), idNumber)

			//			WebUI.takeScreenshot()
			//Entering the account number of the borrower
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerDetail/currentOrSavingAccountNumberIfAny"), accountNumber)
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
	 *1.This method is for providing home address details of the borrower.
	 *2.@param: country,region,province,townCityMunicipality,barangay,streetName,unitNoBldgNameBldgNoVillageSubdivision.
	 *3.The data inside param is used as data driven.
	 */

	@Keyword
	def homeAddress(String country,String region,String province,String townCityMunicipality,String barangay,String streetName,String unitNoBldgNameBldgNoVillageSubdivision) {
		try {
			//Selecting the Country of the borrower
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/country"), country, false)

			//Selecting region of the borrower
			//			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/region"), region, false)
			WebUI.selectOptionByIndex(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/region"), 1)

			//Selecting province of the borrower
			//			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/province"), province, false)
			WebUI.selectOptionByIndex(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/province"), 1)


			//Selecting Town/City/Municipality of the borrower
			//			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/townCityMunicipality"), townCityMunicipality, false)
			WebUI.selectOptionByIndex(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/townCityMunicipality"), 1)

			//Selecting barangay of the borrower
			//			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/barangay"), barangay, false)
			WebUI.selectOptionByIndex(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/barangay"), 1)

			//Entering Street name of the borrower
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/streetName"), streetName)

			//Entering Building/Village/Subdivision of the borrower
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/unitNoBldgNameBldgNoVillageSubdivision"), unitNoBldgNameBldgNoVillageSubdivision)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//		WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/HomeAddress/homeAddressZipCode"), homeAddressZipCode)

			//		WebUI.click(findTestObject("Object Repository/AdditionalInformationWithAPI/addCoBorrower"))
			//			WebUI.takeScreenshot()
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 *1.This method is to provide Co Borrower's details.
	 *2.@param: coBorrowerRelationshipWithBorrower,coBorrowerFirstName,coBorrowerMiddleName,coBorrowerLastName,coBorrowerSuffix.
	 *3.The data inside param is used as data driven.
	 */

	@Keyword
	def coBorrowersDetails(String coBorrowerRelationshipWithBorrower, String coBorrowerFirstName,String coBorrowerMiddleName,String coBorrowerLastName,String coBorrowerSuffix){

		try {
			//			Selecting co borrower relationship with borrower
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerDetail/coBorrowerRelationshipWithBorrower"),coBorrowerRelationshipWithBorrower,false)

			//Entering co borrower's first name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerDetail/coBorrowerFirstName"), coBorrowerFirstName)

			//Entering co borrower's middle name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerDetail/coBorrowerMiddleName"), coBorrowerMiddleName)

			//Entering co borrower's last name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerDetail/coBorrowerLastName"), coBorrowerLastName)

			//Selecting co borrower's suffix
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerDetail/coBorrowerSuffix"), coBorrowerSuffix, false)

			//			WebUI.takeScreenshot()
			//		WebUI.selectOptionByValue(findTestObject('Object Repository/AdditionalInformationWithAPI/CoBorrowerDetail/coBorrowerMaritalStatus'), coBorrowerMaritalStatus, false)
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on continue
			WebUI.click(findTestObject("Object Repository/AdditionalInformationWithAPI/continue"))
			WebUI.delay(1)
			if(WebUI.verifyElementPresent(findTestObject("Object Repository/UploadYourDocuments/uploadYourDocumentText"), 2, FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in Upload Document Page")
			}else {
				WebUI.comment("We are not on Upload Document Page")
			}
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	@Keyword
	def AdditionalDetailContinueAmendment() {
		WebUI.delay(1)

		GlobalVariableUtil.captureScreenShotWithTime()
		WebUI.click(findTestObject("Object Repository/AdditionalInformationWithAPI/continue"))
	}

	/*
	 * 1.This method is to provide Borrowers Spouse's details.
	 * 2.@param: borrowerSpouseFirstName,borrowerSpouseMiddleName,borrowerSpouseLastName,borrowerSpouseSuffix.
	 * 3.The data inside param is used as data driven.
	 */


	@Keyword
	def borrowersSpouseDatail(String borrowerSpouseFirstName,String borrowerSpouseMiddleName,String borrowerSpouseLastName,String borrowerSpouseSuffix) {
		try {
			//Clicking on borrower spouse to co sign
			WebUI.click(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerSpouseDetail/borrowerSpouseToCoSign"))

			//Entering borrowers spouse's first name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerSpouseDetail/borrowerSpouseFirstName"), borrowerSpouseFirstName)

			//Entering borrowers spouse's middle name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerSpouseDetail/borrowerSpouseMiddleName"),borrowerSpouseMiddleName)

			//Entering borrowers spouse's last name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerSpouseDetail/borrowerSpouseLastName"),borrowerSpouseLastName)

			//Selecting borrowers spouse's suffix
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/BorrowerSpouseDetail/borrowerSpouseSuffix"),borrowerSpouseSuffix)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}


	/*
	 *1.This method is to provide Co Borrower spouse's details
	 *2. @param: coBorrowerSpouseFirstName,coBorrowerSpouseMiddleName,coBorrowerSpouseLastName,coBorrowerSpouseSuffix.
	 *3.The data inside param is used as data driven.
	 */

	@Keyword
	def  coBorrowersSpouseDetails(String coBorrowerSpouseFirstName,String coBorrowerSpouseMiddleName,String coBorrowerSpouseLastName,String coBorrowerSpouseSuffix) {
		try {
			//Entering co borrower spouse to co sign
			WebUI.click(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerSpouseDetail/coBorrowerSpouseToCoSign"))

			//Entering co borrower spouse's first name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerSpouseDetail/coBorrowerSpouseFirstName"), coBorrowerSpouseFirstName)

			//Entering co borrower spouse's middle name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerSpouseDetail/coBorrowerSpouseMiddleName"), coBorrowerSpouseMiddleName)

			//Entering co borrower spouse's last name
			WebUI.setText(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerSpouseDetail/coBorrowerSpouseLastName"), coBorrowerSpouseLastName)

			//Selecting co borrower spouse's suffix
			WebUI.selectOptionByValue(findTestObject("Object Repository/AdditionalInformationWithAPI/CoBorrowerSpouseDetail/coBorrowerSpouseSuffix"), coBorrowerSpouseSuffix, false)
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
