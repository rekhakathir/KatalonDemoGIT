import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Reuse Demo Script/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/h6_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/p_Time at Work'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/p_Time at Work'), 'Time at Work')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/p_My Actions'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/p_My Actions'), 'My Actions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/p_Quick Launch'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/p_Quick Launch'), 'Quick Launch')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/p_Employees on Leave Today'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/p_Employees on Leave Today'), 'Employees on Leave Today ok')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Dashboard_oxd-icon bi-caret-down-fill oxd_d2fd49'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

