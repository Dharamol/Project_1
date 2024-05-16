package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox {
	WebDriver driver;
	@Test
	public void  tickCheckBox() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']")).click();
		 driver.findElement(By.xpath("//a[text()='Checkbox Demo']")).click();
		 driver.findElement(By.xpath("//label[contains(text(),'Click on this check box')]/preceding-sibling::input")).click();
	String text=driver.findElement(By.id("message-one")).getText();
	//System.out.println(text);
	Assert.assertEquals("Success - Check box is checked",text);
	}

}
