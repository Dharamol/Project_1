package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeClass {
	WebDriver driver;
	@Test
	public void crossBrowserEdge()
	{
		 System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\msedgedriver.exe");
		 driver =new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
	}
}
