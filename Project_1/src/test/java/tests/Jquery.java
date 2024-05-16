package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Jquery {
	WebDriver driver;
	@Test
	public void  cancelButtonJquery() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.xpath("//a[contains(text(),'Progress Bars')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'JQuery UI Progress')]")).click();
		 driver.findElement(By.id("downloadButton")).click();
		// driver.findElement(By.xpath("//button[(@class='ui-button ui-corner-all ui-widget' and text()='Close')]"));
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(@class='ui-button ui-corner-all ui-widget' and text()='Close')]"))).click();
	}
}
