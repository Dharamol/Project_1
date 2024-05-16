package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.InputFormPage;
import pages.SimpleInputPage;


public class SampleWithPageFactory {
	WebDriver driver;
	HomePage home;
	InputFormPage input;
	SimpleInputPage simpleInput;
	
	
	@BeforeClass
	public void login()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 // System.setProperty("Webdriver.chrome.driver","D:\\riverChrome\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  
	}
	@Test
	public void testCaseInputfor() 
	{
		home = new HomePage(driver);
		input = new InputFormPage(driver);
		simpleInput = new SimpleInputPage(driver);
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		home.clickInput();
		input.clickSimpleForm();
		simpleInput.enterTheValue("dhara");
		simpleInput.clickShwMessgae();
		
	}
}
