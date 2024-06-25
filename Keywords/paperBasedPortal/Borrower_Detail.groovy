package paperBasedPortal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil
import internal.GlobalVariable




public class Borrower_Detail {


	/**
	 * 1.This is the borrower detail page in paper based
	 * 2.@Params : fst_Name,mid_Name,lst_Name,email,mob_Num,date,maritalStatus,suffix,residence
	 * 3.The data inside for params we using a data driven
	 */
	@Keyword
	def borrower_Details(String fst_Name, String mid_Name, String lst_Name, String email, String mob_Num, String date,String maritalStatus,String suffix,String residence) {
		WebUI.waitForPageLoad(10)

		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Borrower_Details/borrowerInformation'), 2,FailureHandling.CONTINUE_ON_FAILURE)
			String  result ="LOS-"
			//Here we generating a random character for different user
			int rnd = (int) (Math.random() * 52);
			char base = (rnd < 26) ? 'A' : 'a';
			char c=  (char) (base + rnd % 26);

			rnd = (int) (Math.random() * 52);
			char b=  (char) (base + rnd % 26);

			rnd = (int) (Math.random() * 52);
			char a=  (char) (base + rnd % 26);

			//Entering the first Name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/first_Name'),fst_Name+c+b+a)

			//Entering a middle name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/middle_Name'),mid_Name+c+b+a)

			//Entering a last name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/last_Name'),lst_Name+c+b+a)

			//choosing the value from the dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/suffix'),suffix,true)

			//Choosing the marital status from dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/marital_Status'),maritalStatus,false)
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Entering the borrower email Id
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/email'),email)

			//Entering the mobile number of borrower
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/mobile_Number'),mob_Num)

			WebUI.delay(2)
			String referenceNumber = WebUI.getWindowTitle();

			println(" ***** " + referenceNumber)

			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			System.out.println("result is: " + result);

			//			utilityClass.map1.put("referenceNumber", result)
			GlobalVariable.LOSID = result

			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(result)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on the continue button
			WebUI.click(findTestObject('Object Repository/Borrower_Details/continue'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	/**
	 * 1.This is the borrower detail page in paper based
	 * 2.@Params : fst_Name,mid_Name,lst_Name,email,mob_Num,date,maritalStatus,suffix,residence
	 * 3.The data inside for params we using a data driven
	 */
	@Keyword
	def borrower_DetailsAOLogin(String fst_Name, String mid_Name, String lst_Name, String email, String mob_Num, String date,String maritalStatus,String suffix,String residence) {
		WebUI.waitForPageLoad(10)

		try {
			String  result ="LOS-"
			//Here we generating a random character for different user
			int rnd = (int) (Math.random() * 52);
			char base = (rnd < 26) ? 'A' : 'a';
			char c=  (char) (base + rnd % 26);

			rnd = (int) (Math.random() * 52);
			char b=  (char) (base + rnd % 26);

			rnd = (int) (Math.random() * 52);
			char a=  (char) (base + rnd % 26);

			WebUI.selectOptionByIndex(findTestObject("Object Repository/AOAsDealer/BorrowerDetailPaperbase/dealership"), 1)

			//Entering the first Name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/first_Name'),fst_Name+c+b+a)

			//Entering a middle name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/middle_Name'),mid_Name+c+b+a)

			//Entering a last name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/last_Name'),lst_Name+c+b+a)

			//choosing the value from the dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/suffix'),suffix,true)

			//Choosing the marital status from dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/marital_Status'),maritalStatus,false)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Entering the borrower email Id
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/email'),email)

			//Entering the mobile number of borrower
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/mobile_Number'),mob_Num)

			WebUI.delay(2)
			String referenceNumber = WebUI.getWindowTitle();

			println(" ***** " + referenceNumber)

			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			System.out.println("result is: " + result);

			//			utilityClass.map1.put("referenceNumber", result)
			GlobalVariable.LOSID = result

			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(result)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on the continue button
			WebUI.click(findTestObject('Object Repository/Borrower_Details/continue'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}



	/**
	 * 1.This is the borrower detail page in paper based
	 * 2.@Params : fst_Name,mid_Name,lst_Name,email,mob_Num,date,maritalStatus,suffix,residence
	 * 3.The data inside for params we using a data driven
	 */
	@Keyword
	def borrower_DetailsNSTP(String fst_Name, String mid_Name, String lst_Name, String email, String mob_Num, String date,String maritalStatus,String suffix,String residence) {
		WebUI.waitForPageLoad(10)

		try {

			//Entering the first Name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/first_Name'),fst_Name)

			//Entering a middle name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/middle_Name'),mid_Name)

			//Entering a last name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/last_Name'),lst_Name)

			//choosing the value from the dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/suffix'),suffix,true)

			//Choosing the marital status from dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/marital_Status'),maritalStatus,false)

			//Entering the borrower email Id
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/email'),email)

			//Entering the mobile number of borrower
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/mobile_Number'),mob_Num)

			String  result ="LOS-"
			WebUI.delay(2)
			String referenceNumber = WebUI.getWindowTitle();

			println(" ***** " + referenceNumber)

			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			System.out.println("result is: " + result);

			//			utilityClass.map1.put("referenceNumber", result)
			GlobalVariable.LOSID = result

			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(result)


			//Clicking on the continue button
			WebUI.click(findTestObject('Object Repository/Borrower_Details/continue'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}




	@Keyword
	def borrower_DetailsNSTPAOLogin(String fst_Name, String mid_Name, String lst_Name, String email, String mob_Num, String date,String maritalStatus,String suffix,String residence) {
		WebUI.waitForPageLoad(10)

		try {

			WebUI.selectOptionByIndex(findTestObject("Object Repository/AOAsDealer/BorrowerDetailPaperbase/dealership"), 1)

			//Entering the first Name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/first_Name'),fst_Name)

			//Entering a middle name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/middle_Name'),mid_Name)

			//Entering a last name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/last_Name'),lst_Name)

			//choosing the value from the dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/suffix'),suffix,true)

			//Choosing the marital status from dropdown
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/marital_Status'),maritalStatus,false)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Entering the borrower email Id
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/email'),email)

			//Entering the mobile number of borrower
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/mobile_Number'),mob_Num)

			String  result ="LOS-"
			WebUI.delay(2)
			String referenceNumber = WebUI.getWindowTitle();

			println(" ***** " + referenceNumber)

			int length = referenceNumber.length();

			for (int i = 0; i < length; i++) {
				Character character = referenceNumber.charAt(i);
				if (Character.isDigit(character)) {
					result += character;
				}
			}
			System.out.println("result is: " + result);

			//			utilityClass.map1.put("referenceNumber", result)
			GlobalVariable.LOSID = result

			GlobalVariableUtil.saveGlobalVariable("LOSID", result)

			WebUI.comment(result)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Clicking on the continue button
			WebUI.click(findTestObject('Object Repository/Borrower_Details/continue'))
		}catch(Exception e) {
			//If the script is fail it will take the ScreenShot Where the Script is failed
			WebUI.takeScreenshot()
			//printing the reason in console
			println(e.toString())
		}
	}
}
