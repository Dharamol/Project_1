package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class AlertsAndModels {
	
		WebDriver driver;
	@Test(retryAnalyzer=tests.RetryAnalyzer.class)
	public void  scroll() throws InterruptedException
	{
		
		String value ="dhara@gmail.com";
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/javascript-alert.php");
		 driver.findElement(By.xpath("//a[text()='Javascript Alert']")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		 Alert alert = driver.switchTo().alert();
		String alertMessage= alert.getText();
		String value1 ="I am a Javascript alert box!1";
		System.out.println(alertMessage);
		Assert.assertEquals(alertMessage,value1);
	
	}
}
