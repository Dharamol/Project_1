package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	WebDriver driver;
	@Test
	public void  tickRadioButtonMale() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']")).click();
		 driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
		 driver.findElement(By.xpath("//button[text()='Show Selected Value']/preceding-sibling::div[@class='form-group']/descendant::label[text()='Female']")).click();
		 driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();

	}
	@Test
	public void  tickCheckBoxFemale() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']")).click();
		 driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
		 driver.findElement(By.xpath("//label[text()='Male']")).click();
		 driver.findElement(By.xpath("//button[text()='Show Selected Value']/preceding-sibling::div[@class='form-group']/descendant::label[text()='Male']")).click();
		 driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();
	}
}
