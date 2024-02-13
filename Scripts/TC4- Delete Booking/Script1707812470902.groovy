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

responses = WS.sendRequest(findTestObject('Booking/Update Booking'))


//ambil token
responses = WS.sendRequest(findTestObject('Object Repository/Auth/Create Token'))

// simpan token di variabel
token = WS.getElementPropertyValue(responses, 'token')

// jalankan method put, input parameter token dengan nilai variabel token
updated = WS.sendRequestAndVerify(findTestObject('Object Repository/Booking/Delete Booking',[('token'):token]))


//WS.verifyElementPropertyValue(updated, 'firstname', "James")
//WS.verifyElementPropertyValue(updated, 'lastname', "Kwait")
//WS.verifyElementPropertyValue(updated, 'totalprice', 200)
//WS.verifyElementPropertyValue(updated, 'depositpaid', true)
//WS.verifyElementPropertyValue(updated, 'bookingdates.checkin', "2023-03-03")
//WS.verifyElementPropertyValue(updated, 'bookingdates.checkout', "2023-03-04")
//WS.verifyElementPropertyValue(updated, 'additionalneeds', "Breakfast")



