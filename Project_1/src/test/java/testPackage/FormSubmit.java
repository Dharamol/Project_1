package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverInitializer;
import pages.FormSubmitPage;
import pages.HomePage;
import pages.InputFormPage;

public class FormSubmit extends DriverInitializer{

			WebDriver  driver;
			HomePage homePage;
			InputFormPage inputForm;
			FormSubmitPage form;
			
			
			@Test(priority=1)
			public void verifyFormsubmitdetails()
			{
				
				driver=getDriver();
				homePage=new HomePage(driver);
				homePage.clickInput();
				
				inputForm = new InputFormPage(driver);
				inputForm.clickFormSubmit();
				form= new FormSubmitPage(driver);
				form.fillForm("dhara","name","DHARA","Thrissur","kerala","72873");
				String message =form.validateSuccess();
				
				 Assert.assertEquals("Form has been submitted successfully!",message);
			}
}
