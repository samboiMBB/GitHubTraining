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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dbmosaj-trials73.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('Object Repository/Orange/Login2/Page_OrangeHRM/input_Login_txtUsername'), 'Admin')

WebUI.setText(findTestObject('Object Repository/Orange/Login2/Page_OrangeHRM/input_Login_txtPassword'), 'Password@1')

WebUI.sendKeys(findTestObject('Page_OrangeHRM/button_Login'), Keys.chord(Keys.ENTER))

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://www.random.org/integers/')

WebUI.click(findTestObject('Randomorg/Page_RANDOM.ORG - Integer Generator/input'))

RandomV = WebUI.getText(findTestObject('Randomorg/Page_RANDOM.ORG - Integer Generator/get_number'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Orange/Spy/Page_Dashboard/span_Leave'))

WebUI.click(findTestObject('Orange/Spy/Page_Dashboard/span_Apply'))

WebUI.setText(findTestObject('MyInfo/Page_Personal Details/Page_Apply Leave/textarea_Required_comment'), RandomV)

not_run: WebUI.click(findTestObject('Object Repository/Orange/Login2/Page_Dashboard/i_keyboard_arrow_down'))

not_run: WebUI.click(findTestObject('Object Repository/Orange/Login2/Page_Dashboard/a_Logout'))

not_run: WebUI.closeBrowser()

not_run: WebUI.click(findTestObject('MyInfo/Page_Dashboard/span_My Info'))

not_run: WebUI.click(findTestObject('Page_Personal Details/input__select-dropdown'))

not_run: WebUI.click(findTestObject('MyInfo/Page_Personal Details/i_date_range'))

not_run: WebUI.click(findTestObject('MyInfo/Page_Personal Details/span_1996'))

not_run: WebUI.click(findTestObject('MyInfo/Page_Personal Details/div_8'))

not_run: WebUI.click(findTestObject('MyInfo/Page_Personal Details/h4_COVID Vaccination'))

not_run: WebUI.scrollToElement(findTestObject('MyInfo/Page_Personal Details/h4_COVID Vaccination'), 0)

not_run: WebUI.scrollToElement(findTestObject('MyInfo/Page_Personal Details/span_Attachments'), 0)

not_run: WebUI.click(findTestObject('MyInfo/Page_Personal Details/a_Add'))

not_run: WebUI.uploadFile(findTestObject('MyInfo/Page_Personal Details/input_(Accepts up to 5MB)_filename'), 'C:\\Users\\intel CORE i5\\Desktop\\Tes222.txt')

not_run: WebUI.click(findTestObject('MyInfo/Page_Personal Details/button_Save'))

not_run: WebUI.closeBrowser()

