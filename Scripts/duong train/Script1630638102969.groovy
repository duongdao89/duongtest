import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.openBrowser('')

WebUI.navigateToUrl('https://kiemthutudong.com/blog/')

WebUI.click(findTestObject('Object Repository/Page_Automation Blog  Quality is not an act_8c22d4/a_Create New AccountCreate New Account'))

WebUI.setText(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Username_user_login'), 
    'duongdao')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Email_user_email'), 
    'duongtest02@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Email_wp-submit'))

WebUI.delay(10)

WebUI.closeBrowser()
