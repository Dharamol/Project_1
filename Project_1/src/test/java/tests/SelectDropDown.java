package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
	WebDriver driver;
	@Test
	public void  dropDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		 driver  =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']")).click();
		 driver.findElement(By.xpath("//a[text()='Select Input']")).click();
		 
		 driver.findElement(By.xpath("//select[(@class='form-control' and @id='single-input-field')]")).click();
		 Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		 dropdown.selectByIndex(1);
		// driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();

	}
}
