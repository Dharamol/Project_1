package pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import util.ExcelUtil;


public class TablePage {
	
	ExcelUtil excelutil =new ExcelUtil();
	SoftAssert   softAssert = new SoftAssert();
	WebDriver driver ;
	public TablePage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Table with Pagination')]")
	WebElement TablePagination;
	
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='Ashton Cox']")
	WebElement name;
	
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='Junior Technical Author']")
	WebElement position;
	
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='San Francisco']")
	WebElement office;
	
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='66']")
	WebElement age;
	
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='2009/01/12']")
	WebElement startDate;
	
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='$86,000']")
	WebElement salary;





public Map<String ,String> tableData( ) throws IOException
{

	Map<String ,String> dataMap =new HashMap<>();
	
	dataMap.put("Position", position.getText()); 
	dataMap.put("Office", office.getText());
	dataMap.put("Age", age.getText());
	dataMap.put("StartDate", startDate.getText());
	dataMap.put("Salary", salary.getText()); 
	//dataMap.get("Salary");
	
		  
	return dataMap;
}
}




