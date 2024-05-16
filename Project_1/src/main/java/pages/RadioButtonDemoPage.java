package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonDemoPage {
	
		WebDriver driver;
		
		
		public RadioButtonDemoPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}

		@FindBy(id="inlineRadio1")
		WebElement male;
		@FindBy(id="inlineRadio2")
		WebElement female;
		@FindBy(id="button-one")
		WebElement showselected;
		@FindBy(id="message-one")
		WebElement validateMessage;
		public void clickMale()
		{
			male.click();
		}
		public void clickFemale()
		{
			female.click();
		}
		public void clickSelect()
		{
			showselected.click();
		}
		public String getMessage()
		{
			return validateMessage.getText();
		}
}

