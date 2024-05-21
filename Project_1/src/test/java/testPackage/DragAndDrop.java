package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverInitializer;
import pages.DragAndDropPage;
import pages.HomePage;
import pages.OthersPage;
import pages.SimpleInputPage;


public class DragAndDrop extends DriverInitializer{

	WebDriver  driver;
	HomePage homePage;
	//OthersPage drag;
	SimpleInputPage simpleInput;
	SoftAssert softAssert;
	DragAndDropPage dragdrop;
	
	@Test(priority=1)
	public void DragAndDrops() throws IOException, InterruptedException {
		
		driver=getDriver();
		
		homePage=new HomePage(driver);
		homePage.clickOthers();
		//drag =new OthersPage(driver);
		//drag.clickDrag();
		Thread.sleep(2000);
		dragdrop =new DragAndDropPage(driver);
		dragdrop.elementWait();
		dragdrop.drag();
		Thread.sleep(8000);
		
	}
	
}
