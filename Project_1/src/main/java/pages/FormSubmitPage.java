package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSubmitPage {
	  WebDriver driver;
	
	
	public FormSubmitPage(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="validationCustom01")
	WebElement firstName;
	
	@FindBy(id="validationCustom02")
	WebElement lastName;
	
	@FindBy(id="validationCustomUsername")
	WebElement userName;
	
	@FindBy(id="validationCustom03")
	WebElement city;
	
	@FindBy(id="validationCustom04")
	WebElement state;
	
	@FindBy(id="validationCustom05")
	WebElement zip;
	
	@FindBy(xpath="//input[@class='form-check-input']")
	WebElement radioButton;
	
	@FindBy(xpath="//button[text()='Submit form']")
	WebElement submitButton;
	
	@FindBy(id="message-one")
	WebElement validMessage;
	
	@FindBy(xpath="//div[contains(text(),'You must agree before submitting.')]")
	WebElement errorMessage;
	
	public void fillForm(String firstname,String lastname,String username,String cityname,String nameofstate,String zipvalue)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		userName.sendKeys(username);
		city.sendKeys(cityname);
		state.sendKeys(nameofstate);
		zip.sendKeys(zipvalue);
		radioButton.click();
		submitButton.click();
	}
	public void fillFormError(String firstname,String lastname,String username,String cityname,String nameofstate,String zipvalue)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		userName.sendKeys(username);
		city.sendKeys(cityname);
		state.sendKeys(nameofstate);
		zip.sendKeys(zipvalue);
		submitButton.click();
	}
	
	public String validateSuccess()
	{
		return validMessage.getText();
	}
	
	public String validateErrorMessage()
	{
		return errorMessage.getText();
	}
	
	
}

