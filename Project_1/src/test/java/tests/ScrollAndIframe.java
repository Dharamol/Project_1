package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollAndIframe {

	WebDriver driver;
@Test
public void  scroll() throws InterruptedException
{
	
	String value ="dhara@gmail.com";
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
	 driver  =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.pcloudy.com/blogs/handling-iframes-in-selenium-based-test-automation/");
	 driver.switchTo().frame("hs-form-iframe-0");
	 JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver ;
	WebElement locate = driver.findElement(By.id("email-fd0dd34f-38ca-4103-88e4-0cd5ff240ad1"));
//	javascriptExecutor.executeScript("arguments[0].scrollIntoView();",locate);
	//javascriptExecutor.executeScript("window.scrollBy(100, 0)");
	//javascriptExecutor.executeScript("window.scrollBy(0, 500)");
	
	 locate.sendKeys(value);
	 driver.findElement(By.id("firstname-fd0dd34f-38ca-4103-88e4-0cd5ff240ad1")).sendKeys("dhara");
}
}
