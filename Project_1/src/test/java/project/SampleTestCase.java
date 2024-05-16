package project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.InputFormPage;
import pages.SimpleInputPage;
import util.PropertyReaderUtil;
import base.DriverInitializer;

public class SampleTestCase {
	WebDriver  driver;
	HomePage homePage;
	InputFormPage inputForm;
	SimpleInputPage simpleInput;
	
	@Test(priority=1)
	public void InputFormTestCase_1() {
		//driver=getDriver();

		homePage =new HomePage(driver);
		inputForm=new InputFormPage(driver);
		simpleInput = new SimpleInputPage(driver);
		
		homePage.clickInput();
		inputForm.clickSimpleForm();
		simpleInput.enterTheValue("dhara");	
		simpleInput.clickShwMessgae();
		
	}
}
