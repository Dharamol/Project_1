package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeClass {
	WebDriver driver;
	@Test
public void crossBrowserChrome()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
	 driver  =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://selenium.qabible.in/simple-form-demo.php");
}
}
