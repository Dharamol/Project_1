package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BootSTrapAlertPage {
	WebDriver driver;
	public BootSTrapAlertPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@id='normal-btn-success']")
		WebElement NormalSuccess;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-normal-success']")
	WebElement message;
	public void clickSuccess()
	{
		NormalSuccess.click();
	}
	public String verify() {
		return message.getText();
	}

}
