package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertsPage {
	
	WebDriver driver;
	public JavaScriptAlertsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//button[@class='btn btn-success']")
WebElement AlertBox;

public void clickAlertsBox()
{
	AlertBox.click();
}
}
