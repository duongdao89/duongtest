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

'open browser'
WebUI.openBrowser('')

'navigate to web page'
WebUI.navigateToUrl(GlobalVariable.url_herokuapp)

'deplay loading'
WebUI.delay(3)

'input user name'
WebUI.setText (findTestObject('Object Repository/herokuapp/txt.username'), GlobalVariable.username_herokuapp)

'input password'
WebUI.setEncryptedText (findTestObject('Object Repository/herokuapp/txt.password'), GlobalVariable.password_herokuapp)

'click Login'
WebUI.click(findTestObject('Object Repository/herokuapp/btn.login'))

'delay loading'
WebUI.delay(3)

'get validation'
String validation = WebUI.getText (findTestObject('Object Repository/herokuapp/sld.warning'))
//List<String> text = validation.split("\n")
//println (text[0])
//println (text[1])
text = validation.split("\n")
println (text[0])

'verify validation'
WebUI.verifyEqual (text[0], 'You logged into a secure area!')


