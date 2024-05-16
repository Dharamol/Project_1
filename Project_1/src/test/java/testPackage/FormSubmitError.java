package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverInitializer;
import pages.FormSubmitPage;
import pages.HomePage;
import pages.InputFormPage;

public class FormSubmitError extends DriverInitializer{

	WebDriver  driver;
	HomePage homePage;
	InputFormPage inputForm;
	FormSubmitPage form;
	
	
	@Test(priority=1)
	public void verifyFormsubmitWithoutTerms()
	{
		
		driver=getDriver();
		homePage=new HomePage(driver);
		homePage.clickInput();
		
		inputForm = new InputFormPage(driver);
		inputForm.clickFormSubmit();
		form= new FormSubmitPage(driver);
		form.fillFormError("dhara","name","DHARA","Thrissur","kerala","72873");
		String message =form.validateErrorMessage();
		
		 Assert.assertEquals("You must agree before submitting.",message);
	}
}