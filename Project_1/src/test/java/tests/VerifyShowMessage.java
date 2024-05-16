package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverInitializer;
import pages.HomePage;
import pages.InputFormPage;
import pages.SimpleInputPage;
import util.ReportUtil;
import util.ScreenshotUtil;

public class VerifyShowMessage   extends DriverInitializer {
   
	WebDriver  driver;
	HomePage homePage;
	InputFormPage inputForm;
	SimpleInputPage simpleInput;
	ReportUtil report;
	
	
	@Test(priority=1)
	public void InputFormTestCase_1() throws IOException {
		
		driver=getDriver();
		
		homePage =new HomePage(driver);
		homePage.clickInput();
		inputForm=new InputFormPage(driver);
		inputForm.clickSimpleForm();
		simpleInput = new SimpleInputPage(driver);
		simpleInput.enterTheValue("dhara");	
		String reuslt =simpleInput.getShowMessage();
		ScreenshotUtil screen =new ScreenshotUtil();
		screen.screenshot(driver, "dhara1");
		
		SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Your Message : dhara",reuslt+" dhara");
        
        report = new ReportUtil();
        report.generateAllReports();
        report.createTestCases("VerifyTestcase");
        report.createTestCases("VerifyFacebook");
        report.createTestCases("Verifyshowmessage");
        report.extendreportFlush();
        
       
	}

	
}
