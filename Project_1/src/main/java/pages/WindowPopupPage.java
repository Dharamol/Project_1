package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopupPage {
	WebDriver driver;
	public WindowPopupPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//a[@class='btn btn-primary windowSingle']")
	WebElement LikeUs;
	
	@FindBy(xpath="//input[@id=':rm:']")
	WebElement faceBook;
	
	public void clickLikeUs()
	{
		LikeUs.click();
	}
	@FindBy(xpath="//div[@class='xjbqb8w x1iyjqo2 x193iq5w xeuugli x1n2onr6']/child::input[@name='email']")
	WebElement Facebookuser;
	
	@FindBy(xpath="//div[@class='xjbqb8w x1iyjqo2 x193iq5w xeuugli x1n2onr6']/child::input[@name='pass']")
	WebElement FacebookPassword;
	
	@FindBy(xpath="//form[@id='login_popup_cta_form']/descendant::div[@class='x1i10hfl xjbqb8w x1ejq31n xd10rxx x1sy0etr x17r0tee x972fbf xcfux6l x1qhh985 xm0m39n x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x87ps6o x1lku1pv x1a2a7pz x9f619 x3nfvp2 xdt5ytf xl56j7k x1n2onr6 xh8yej3']")
	WebElement login;
	
	@FindBy(xpath="//span[text()='Like']")
	WebElement like;
	@FindBy(xpath="//div[@class='xjbqb8w x1iyjqo2 x193iq5w xeuugli x1n2onr6']/child::input[@name='email']")
	WebElement waitUntilElement;
	
	@FindBy(xpath="//div[@class='x92rtbv x10l6tqk x1tk7jg1 x1vjfegm']")
	WebElement close;
	
	@FindBy(xpath="//h1[@class='html-h1 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1vvkbs x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']")
	WebElement isItObsqura;
	
	//h1[@class='html-h1 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1vvkbs x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']
	
	public void multipleWindowHandle()
	{
		 String parentWindow = driver.getWindowHandle(); //current window handle
	     Set<String> WindowHandlesss= driver.getWindowHandles(); //all windows handle
	     
	        for (String childWindow : WindowHandlesss)
	        {
	        	
	            if (!parentWindow.equals(childWindow)) 
	            {
	            	driver.switchTo().window(childWindow);
	            	  driver.manage().window().maximize();
		                WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		              wait.until(ExpectedConditions.visibilityOf(close));
		              
	                
	            }
	        }
	}
	public void closeWindow()
	{
		close.click();
	}
	public String getobs()
	{
		return isItObsqura.getText();
	}
	

}
