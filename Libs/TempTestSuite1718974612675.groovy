import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();

suiteProperties.put('id', 'Test Suites/PaperbaseFlows/PaperbaseWithAndWithout/EncoderForWith')
suiteProperties.put('name', 'EncoderForWith')
suiteProperties.put('description', '')
suiteProperties.put('rerunTestFailImmediately', 'true')
suiteProperties.put('retryCount', '0')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\newRCBCProject\\RCBCLOS_Automation\\Reports\\20240621_182643\\PaperbaseFlows\\PaperbaseWithAndWithout\\EncoderForWith\\20240621_182652\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/PaperbaseFlows/PaperbaseWithAndWithout/EncoderForWith', suiteProperties, new File("D:\\newRCBCProject\\RCBCLOS_Automation\\Reports\\20240621_182643\\PaperbaseFlows\\PaperbaseWithAndWithout\\EncoderForWith\\20240621_182652\\testCaseBinding"))
