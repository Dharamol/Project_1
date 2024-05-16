package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxClass {
	WebDriver driver;
	@Test
public void crossBrowserFirefox()
{
	 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://selenium.qabible.in/simple-form-demo.php");
}
}
