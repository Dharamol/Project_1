package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideSample {
	
	@Test(dataProvider = "sample")
	public void simpleFormDemo(String a, String b)
	{
		System.setProperty("Webdriver.chrome.driver","D:\\DriverChrome\\chromedriver.exe");

		  WebDriver driver ; 
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']")).click();
		 driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
		 driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys(a);
		 driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(b);
		 driver.findElement(By.xpath("//button[text()='Get Total']")).click();
	}
	 @DataProvider(name="sample")
	    public Object[][] sampleKeyValuePair(){
	        return new Object[][]
	                {
	                {"3","1"},
	                {"4","2"}
	                } ;
	    }

}
