package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	
	 public static void main(String[] args) {
		  
		 System.setProperty("Webdriver.chrome.driver","D:\\riverChrome\\chromedriver.exe");
WebDriver driver;
		 
		  driver = new ChromeDriver(); 

		  
		  driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php"); 
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']")).click();
		 //Navigator commands
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();

	
	 }
}
