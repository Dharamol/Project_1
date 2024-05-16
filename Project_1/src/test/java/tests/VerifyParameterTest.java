package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyParameterTest {

	

	@Test(priority=1)
	public void diffBrowser()
	{
		WebDriver driver;
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\msedgedriver.exe");
		 driver =new EdgeDriver();
		 driver.manage().window().maximize();	
		 driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		 System.out.println("hi");
	}
	@Test(priority=2)
	public void diffChrome()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();	
		 driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		 System.out.println("chrome");
	}
	
	@Test(priority=3)
	public void fireFox()
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
	}
}
