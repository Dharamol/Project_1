package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import org.testng.Assert;


public class DragAndDrop {

	WebDriver driver;
@Test
public void  dragAndDrop() 
{
	
	String value ="dhara@gmail.com";
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
	 driver  =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("others")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		Actions action = new Actions(driver);
		String dragcontent =driver.findElement(By.xpath("//span[text()='Draggable n°1']")).getText();
		action.dragAndDrop(driver.findElement(By.xpath("//span[text()='Draggable n°1']")), driver.findElement(By.id("mydropzone"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("//span[text()='Draggable n°2']")), driver.findElement(By.id("mydropzone"))).perform();
		System.out.println(dragcontent);
		String compare=driver.findElement(By.id("mylist")).getText();
	//	Assert.assertEquals(dragcontent,compare);
		System.out.println(compare);
}
}
