package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverInitializer;
import pages.AlertsAndModelsPage;
import pages.BootSTrapAlertPage;
import pages.HomePage;

public class NormalSuccessVerify extends DriverInitializer{

	
	WebDriver driver;
	HomePage home;
	AlertsAndModelsPage alerts;
	BootSTrapAlertPage boot;
	SoftAssert softAssert = new SoftAssert();
	String variableText ="I'm a normal success message. To close use the appropriate button.";
	@Test
	public void verifyNoralSuccess()
	{
		driver=getDriver();
		home= new HomePage(driver);
		home.clickAlerts();
		
		alerts  = new AlertsAndModelsPage(driver);
		alerts.clickBootStrapAlert();
		
		boot = new BootSTrapAlertPage(driver);
		boot.clickSuccess();
		String value=boot.verify();
		System.out.println(value);
		 softAssert.assertEquals(variableText,value);
		
	}
	
}
