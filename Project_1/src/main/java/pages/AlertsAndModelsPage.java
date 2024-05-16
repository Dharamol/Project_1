package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsAndModelsPage {
WebDriver driver;
public AlertsAndModelsPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[contains(text(),'Window Popup')]") 
WebElement Windowpopups;

@FindBy(xpath="//a[contains(text(),'Javascript Alert')]") 
WebElement JavaScript;

public void clickWindow()
{
	Windowpopups.click();

}
public void clickJavaAlert()
{
	JavaScript.click();

}
}
