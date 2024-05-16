package testPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.DriverInitializer;
import pages.AlertsAndModelsPage;
import pages.HomePage;
import pages.JavaScriptAlertsPage;

public class JavaScriptAlerts extends DriverInitializer{
	WebDriver driver;
	HomePage home;
	AlertsAndModelsPage alertModals;
	JavaScriptAlertsPage javaAlertBox;
	
	
	@Test
	public void alertsHandling() throws InterruptedException
	{
		driver =getDriver();
		home =new HomePage(driver);
		home.clickAlerts();
		alertModals =new AlertsAndModelsPage(driver);
		alertModals.clickJavaAlert();
		javaAlertBox= new JavaScriptAlertsPage(driver);
		
		javaAlertBox.clickAlertsBox();
		Thread.sleep(10000);
		Alert alert =driver.switchTo().alert();
		alert.accept();
	}


}
