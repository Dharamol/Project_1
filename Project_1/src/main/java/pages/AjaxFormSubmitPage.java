package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxFormSubmitPage {
	WebDriver driver;
	//By InputForm = By.xpath("//div[@id='collapsibleNavbar']//descendant::li[2]");
	
	
	public AjaxFormSubmitPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="subject")
	WebElement SubjectLine;
	
	@FindBy(id="description")
	WebElement DescriptionLine;

	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement submitButton;
	
	@FindBy(xpath="//div[contains(text(),'Looks good!')]")
	WebElement visiblefeedback;
	
	public void passValues(String subject,String description ) {
		SubjectLine.sendKeys(subject);
		DescriptionLine.sendKeys(description);
		submitButton.click();
		
		
	}
	public String  feedBack()
	{
		return visiblefeedback.getText();
	}
}
//input[@class='btn btn-primary']
