package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	WebDriver driver;
	

	@Test(priority=1)
	@Parameters({"browser"})
	public void openBrowser(@Optional("chrome")String browser)
	{
		
		 switch(browser)
		 {
		 case  "chrome":
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
			 driver  =new ChromeDriver();
			 driver.manage().window().maximize();
			 break;
		 case "edge":
			 System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\msedgedriver.exe");
			 driver =new EdgeDriver();
			 driver.manage().window().maximize();
			 break;
		default:
			 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
		 }
	}
	
	
}
