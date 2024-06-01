package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.WaitUtil;

public class JqueryUIProgressPage {
	
	WebDriver driver;
	WaitUtil wait;
	
   
	public JqueryUIProgressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="downloadButton") 
	WebElement download;
	@FindBy(xpath="//button[text()='Close' and @class='ui-button ui-corner-all ui-widget' ]") 
	WebElement close;

	public void clickStart()
	{
		download.click();
	}
	public void clicMenu()
	{
		wait = new WaitUtil(driver);
		wait.waitClickable(close);
		
		
	}
	
	
	
		
       
	
}
