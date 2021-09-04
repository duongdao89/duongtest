import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

"open browser"
WebUI.openBrowser('')

"navigate to web page"
WebUI.navigateToUrl('http://demo.guru99.com/v4/')

"deplay loading"
WebUI.delay(3)

"input user name"
WebUI.setText(findTestObject('Page_Guru99 Bank Home Page/input_UserID_uid'), 'mngr351317')

"input password"
WebUI.setText(findTestObject('Page_Guru99 Bank Home Page/input_Password_password'), 'sevenuv')

"click Login"
WebUI.click(findTestObject('Page_Guru99 Bank Home Page/input_Password_btnLogin'))

"delay loading"
WebUI.delay(3)

"take screenshot"
WebUI.takeScreenshot()

"close browser"
WebUI.closeBrowser()

