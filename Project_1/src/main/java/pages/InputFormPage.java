package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPage {
	
		public  WebDriver driver;
		
		
		public InputFormPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//a[text()='Simple Form Demo']")
		WebElement SimpleFormDemo;
		
		@FindBy(xpath="//a[text()='Ajax Form Submit']")
		WebElement AjaxFormSubmit;
		
		@FindBy(xpath="//a[text()='Form Submit']")
		WebElement formSubmit;
		@FindBy(xpath="//a[text()='Radio Buttons Demo']")
		WebElement RadioButton;
		
		
		
		public void clickSimpleForm()
		{
			SimpleFormDemo.click();
		}
		public void clickAjaxForm()
		{
			AjaxFormSubmit.click();
		}
		public void clickFormSubmit()
		{
			formSubmit.click();
		}
		public void clickRadioButton()
		{
			RadioButton.click();
		}
}

