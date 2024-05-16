package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.DriverInitializer;
import pages.AlertsAndModelsPage;
import pages.HomePage;
import pages.WindowPopupPage;
import util.ScreenshotUtil;

public class FacebookLike extends DriverInitializer{
	
	WebDriver driver;
	HomePage home;
	AlertsAndModelsPage alerts;
	WindowPopupPage window;
	ScreenshotUtil screen;
	
	
	@Test
	public void LikeUsonFaceBook() throws InterruptedException, IOException
	{
		driver=getDriver();
		home =new HomePage(driver);
		home.clickAlerts();
		
		alerts=new AlertsAndModelsPage(driver);
		alerts.clickWindow();
		
		window =new WindowPopupPage(driver);
		window.clickLikeUs();
		window.multipleWindowHandle();
		Thread.sleep(8000);
		window.closeWindow();
		String name =window.getobs();
		System.out.println(name);
		Thread.sleep(8000);
		screen = new ScreenshotUtil();
		screen.screenshot(driver,"Facebook");
	}
	

}
