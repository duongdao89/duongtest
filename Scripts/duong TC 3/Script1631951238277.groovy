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
WebUI.navigateToUrl('http://the-internet.herokuapp.com/login')

'deplay loading'
WebUI.delay(3)

'input user name'
WebUI.setText (findTestObject('Object Repository/herokuapp/txt.username'), 'tomsmith')

'input password'
WebUI.setText(findTestObject('Object Repository/herokuapp/txt.password'), 'SuperSecretPassword!')

'click Login'
WebUI.click(findTestObject('Object Repository/herokuapp/btn.login'))

'delay loading'
WebUI.delay(3)

'get validation'
String validation = WebUI.getText (findTestObject('Object Repository/herokuapp/sld.warning'))
println validation

'verify validation'
WebUI.verifyEqual(validation, "Welcome to the Secure Area. When you are done click logout below.")


