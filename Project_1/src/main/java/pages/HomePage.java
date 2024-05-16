package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//By InputForm = By.xpath("//div[@id='collapsibleNavbar']//descendant::li[2]");
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@id='collapsibleNavbar']//descendant::li[2]")
	WebElement home;
	
	@FindBy(xpath="//a[@href='simple-form-demo.php' and @class='nav-link']")
	WebElement inputform;
	
	@FindBy(id="others")
	WebElement others;
	
	@FindBy(id="alert-modal") 
	WebElement AlertsAndModels;
	
	@FindBy(xpath="//a[contains(text(),'Table')]")
	WebElement table;
	
	@FindBy(id="progress-bars") 
	WebElement progressBars;
	
	public void clickInput()
	{
		inputform.click();
	}
	public void clickOthers()
	{
		others.click();
	}
	public void clickAlerts()
	{
		AlertsAndModels.click();
	}
	public void clickTable()
	{
		table.click();
	}
	public void clickProgressBars()
	{
		progressBars.click();
	}
	
	
}
