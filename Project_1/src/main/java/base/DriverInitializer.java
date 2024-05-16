package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

public class DriverInitializer {
	
	
	WebDriver driver;
	public  String Obs_URL ="https://selenium.qabible.in/simple-form-demo.php";
	public WebDriver getDriver()
	{
		
		return driver;
	}
	
	
	 @BeforeClass
	 @Parameters(("Browser"))
	 public WebDriver browserSelection( String Browser)
	 {
		 switch(Browser)
		 {
		 case  "chrome":
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
			 driver  =new ChromeDriver();
			 driver.get(Obs_URL);
			 driver.manage().window().maximize();
			 break;
		 case "edge":
			 System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\msedgedriver.exe");
			 driver =new EdgeDriver();
			 driver.get(Obs_URL);
			 driver.manage().window().maximize();
			 break;
		default:
			 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.get(Obs_URL);
			 driver.manage().window().maximize();
		 }
		return driver;
	 }
	 @AfterClass
	 public void driverClose()
	 {
		 driver.quit();
	 }

}
