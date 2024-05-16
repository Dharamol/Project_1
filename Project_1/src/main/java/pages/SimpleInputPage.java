package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleInputPage {
	WebDriver driver;
	
	
	public SimpleInputPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//label[text()='Enter Message']//following-sibling::input")
	WebElement SimpleFormDemo;
	
	@FindBy(xpath="//button[text()='Show Message']")
	WebElement ShowMessage;
	
	@FindBy(xpath="//div[@id='message-one' and @class='my-2']")
	WebElement getMessage;
	
	
	public void enterTheValue(String value)
	{
		SimpleFormDemo.sendKeys(value);
	}
	public void clickShwMessgae() {
		ShowMessage.click();
	}
	public String getShowMessage()
	{
		return getMessage.getText();
	
	}
}

