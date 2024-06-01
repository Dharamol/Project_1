package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverInitializer;
import util.WaitUtil;

public class DragAndDropPage extends DriverInitializer {
	
	
	WebDriver driver;
	Actions action;
	WaitUtil wait;
	
	public DragAndDropPage(WebDriver driver)
	{
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.action =new Actions(driver);
		
	}
	
	@FindBy(xpath="//span[text()='Draggable n°1']")
	WebElement draggable;
	
	@FindBy(id="mydropzone")
	WebElement dropArea;
	
	public void elementWait(){
	wait = new WaitUtil(driver);
	wait.waitMethod(draggable);
	}
	
public void drag()
{
	
	
	action.dragAndDrop(draggable, dropArea).build().perform();
}
	

}
