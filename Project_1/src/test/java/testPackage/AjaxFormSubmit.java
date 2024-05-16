package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverInitializer;
import pages.AjaxFormSubmitPage;
import pages.HomePage;
import pages.InputFormPage;


public class AjaxFormSubmit extends DriverInitializer{
	 
		WebDriver driver;
		HomePage home;
		InputFormPage inputform;
		AjaxFormSubmitPage ajax;
		 SoftAssert softAssert = new SoftAssert();
	      
		
		@Test
		public void alertsHandling() throws InterruptedException
		{
			driver =getDriver();
			home =new HomePage(driver);
			home.clickInput();
			inputform =new InputFormPage(driver);
			inputform.clickAjaxForm();
			ajax = new AjaxFormSubmitPage(driver);
			ajax.passValues("Subjectline", "Description about");  
			String vaue =ajax.feedBack();
			  softAssert.assertEquals("Looks good!",vaue);
}
	}
