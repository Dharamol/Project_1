package testPackage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.DriverInitializer;
import pages.HomePage;
import pages.JqueryUIProgressPage;

public class JqueryUIProgress extends DriverInitializer{

	WebDriver  driver;
	HomePage homePage;
	JqueryUIProgressPage jquery;
	
	
	
	@Test(priority=1)
	public void verifyFormsubmitdetails()
	{
		
		driver=getDriver();
		homePage=new HomePage(driver);
		homePage.clickProgressBars();
		
		jquery = new JqueryUIProgressPage(driver);
		jquery.clickStart();
		jquery.clicMenu();
		
}
}
