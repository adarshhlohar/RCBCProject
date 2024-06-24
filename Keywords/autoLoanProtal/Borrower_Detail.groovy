package autoLoanProtal

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import globalVariableUtils.GlobalVariableUtil




public class Borrower_Detail {

	/*
	 *1.This is Borrower details page.
	 *2. @param: fst_Name,mid_Name,lst_Name,email,mob_Num,date,maritalStatus,suffix,residence.
	 *3.The data inside param is used as data driven.
	 */

	@Keyword
	def borrower_Details(String fst_Name, String mid_Name, String lst_Name, String email, String mob_Num, String date,String maritalStatus,String suffix,String residence) {
		WebUI.waitForPageLoad(10)

		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Borrower_Details/borrowerInformation'), 2,FailureHandling.CONTINUE_ON_FAILURE)
			int RN;
			RN=(int)(Math.random()*400)
			String N = RN.toString()


			int rnd = (int) (Math.random() * 52);
			char base = (rnd < 26) ? 'A' : 'a';
			char c=  (char) (base + rnd % 26);

			rnd = (int) (Math.random() * 52);
			char b=  (char) (base + rnd % 26);

			rnd = (int) (Math.random() * 52);
			char a=  (char) (base + rnd % 26);


			int max =9

			int min = 1

			int x = (int)(Math.random()*(max-min+1)+min);
			int y = (int)(Math.random()*(max-min+1)+min);
			int z = (int)(Math.random()*(max-min+1)+min);


			//Entering borrower's first name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/first_Name'), fst_Name+c+b+a)

			//Entering borrower's mid name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/middle_Name'), mid_Name+c+b+a)

			//Entering borrower's last name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/last_Name'), lst_Name+a+b+c)

			//Clicking on borrower's suffix
			WebUI.click(findTestObject('Object Repository/Borrower_Details/suffix'))

			//Selecting borrower's suffix
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/suffix'), suffix, true)

			int totatNumberOfSuffix = WebUI.getNumberOfTotalOption(findTestObject("Object Repository/Borrower_Details/suffix"))

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//			println("--------- " + totatNumberOfSuffix + " ----------" )

			//Selecting borrower's marital status
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/marital_Status'), maritalStatus, false)

			//Entering borrower's date of birth
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/date_Of_Birth'), date)

			//Entering borrower's email
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/email'), "Adarsh"+a+b+c+"@gmail.com")

			//Entering borrower's mobile number
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/mobile_Number'), "(63) 9356986" +x+y+z )

			//Selecting borrower's residence ownership type
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/residence_Ownership_Type'), residence, false)
			//			WebUI.takeScreenshot()
			int totatNumberOfOwnerType = WebUI.getNumberOfTotalOption(findTestObject("Object Repository/Borrower_Details/residence_Ownership_Type"))

			//			println("--------- " + totatNumberOfOwnerType + " ----------" )

			//Verifying whether the back button element is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/Borrower_Details/back"), FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()
			//Clicking on continue
			WebUI.click(findTestObject('Object Repository/Borrower_Details/continue'))

			if(WebUI.verifyElementPresent(findTestObject("Object Repository/confirmationPage/reviewLoanDetail"), 2,FailureHandling.CONTINUE_ON_FAILURE)) {
				WebUI.comment("We are in review loan Detail Page page")
			}else {
				WebUI.comment("We are in Wrong page")
			}
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			e.printStackTrace()
		}
	}



	/*
	 *1.This is Borrower details page for NSTP.
	 *2. @param: fst_Name,mid_Name,lst_Name,email,mob_Num,date,maritalStatus,suffix,residence.
	 *3.The data inside param is used as data driven.
	 */
	@Keyword
	def borrower_DetailsForNSTP(String fst_Name, String mid_Name, String lst_Name, String email, String mob_Num, String date,String maritalStatus,String suffix,String residence) {
		WebUI.waitForPageLoad(10)

		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Borrower_Details/borrowerInformation'), 2,FailureHandling.CONTINUE_ON_FAILURE)

			//Entering borrower's first name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/first_Name'), fst_Name)

			//Entering borrower's mid name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/middle_Name'), mid_Name)

			//Entering borrower's last name
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/last_Name'), lst_Name)

			//Clicking on borrower's suffix
			WebUI.click(findTestObject('Object Repository/Borrower_Details/suffix'))

			//Selecting borrower's suffix
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/suffix'), suffix, true)

			int totatNumberOfSuffix = WebUI.getNumberOfTotalOption(findTestObject("Object Repository/Borrower_Details/suffix"))

			println("--------- " + totatNumberOfSuffix + " ----------" )

			//Selecting borrower's marital status
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/marital_Status'), maritalStatus, false)

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Entering borrower's date of birth
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/date_Of_Birth'), date)

			//Entering borrower's email
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/email'), email)

			//Entering borrower's mobile number
			WebUI.setText(findTestObject('Object Repository/Borrower_Details/mobile_Number'), mob_Num)

			//Selecting borrower's residence ownership type
			WebUI.selectOptionByValue(findTestObject('Object Repository/Borrower_Details/residence_Ownership_Type'), residence, false)

			int totatNumberOfOwnerType = WebUI.getNumberOfTotalOption(findTestObject("Object Repository/Borrower_Details/residence_Ownership_Type"))

			println("--------- " + totatNumberOfOwnerType + " ----------" )

			WebUI.delay(1)

			GlobalVariableUtil.captureScreenShotWithTime()

			//Verifying whether the back button element is clickable or not
			WebUI.verifyElementClickable(findTestObject("Object Repository/Borrower_Details/back"), FailureHandling.CONTINUE_ON_FAILURE)

			//Clicking on continue
			WebUI.click(findTestObject('Object Repository/Borrower_Details/continue'))
			if(WebUI.verifyElementPresent(findTestObject('Object Repository/confirmationPage/continueBtn'), 2)) {
				WebUI.comment("We are in review loan Detail Page page")
			}else {
				WebUI.comment("We are in Wrong Page")
			}
		}catch(Exception e) {

			//If the execution fails, screenshot will be captured
			WebUI.takeScreenshot()
			e.printStackTrace()
		}
	}
}
