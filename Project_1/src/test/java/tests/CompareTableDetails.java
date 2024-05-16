package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import util.ExcelUtil;



public class CompareTableDetails {
	@Test
	public  void excelRead()throws IOException{
		System.setProperty("Webdriver.chrome.driver","D:\\DriverChrome\\chromedriver.exe");

		  WebDriver driver ; 
		  SoftAssert softAssert = new SoftAssert();
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		 driver.get("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.xpath("//div[@id='collapsibleNavbar']/descendant::li[4]")).click();
		 for(int i=1;i<10;i++) {
			 
			 String b= driver.findElement(By.xpath("//table[@id='dtBasicExample']/child::tbody/child::tr["+i+"]/child::td[1]")).getText();
			
				 if(b.equals("Ashton Cox"))
					 softAssert.assertEquals(b,"Ashton Cox");
				 {
					 int k=1;
					
						 
						 for(int a=0;a<7;a++)
						 {
							 String details =driver.findElement(By.xpath("//table[@id='dtBasicExample']/child::tbody/child::tr[3]/td["+(a+1)+"]")).getText();

							 String o =ExcelUtil.getStringData(k,a);
							 
							 if(details.equals(o))
							 {
								 System.out.println(details);
							 }
							 else
							 {
								 System.out.println("failed");
							 }
					 }
					 break;
				 }
				 
			 }
	}

}
