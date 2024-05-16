package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JqueryUIProgressPage {
	
	WebDriver driver;
	
   
	public JqueryUIProgressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="downloadButton") 
	WebElement download;
	@FindBy(xpath="//button[text()='Close']") 
	WebElement close;

	public void clickStart()
	{
		download.click();
	}
	public void clicMenu()
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(100));
		 wait.until(ExpectedConditions.elementToBeClickable(close));
		
	}
	
	
		
       
	
}
