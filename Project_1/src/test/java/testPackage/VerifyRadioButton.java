package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverInitializer;
import pages.AjaxFormSubmitPage;
import pages.HomePage;
import pages.InputFormPage;
import pages.RadioButtonDemoPage;

public class VerifyRadioButton extends DriverInitializer{
	
		 
		WebDriver driver;
		HomePage home;
		InputFormPage inputform;
		RadioButtonDemoPage radio;
		
		
	      
		
		@Test
		public void alertsHandling() throws InterruptedException
		{
			driver =getDriver();
			home =new HomePage(driver);
			home.clickInput();
			inputform = new InputFormPage(driver);
			inputform.clickRadioButton();
			radio = new RadioButtonDemoPage(driver);
			radio.clickMale();
			radio.clickSelect();
			String value =radio.getMessage();
			Assert.assertEquals("Radio button 'Male' is checked",value);
			
}
}
