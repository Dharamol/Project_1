package util;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	WebDriver driver;
	public WaitUtil(WebDriver driver)
	{
		
		this.driver= driver;
	}
	
	
	@SuppressWarnings("deprecation")
	public void setImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	
	
	
	
	public void waitMethod(WebElement locate) {
	
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOf(locate));
	}
	public WebElement explictWaitTextPresentInElement(WebElement element,String text)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		return element;
	}
	public WebElement waitClickable(WebElement locate)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(locate));
	}
	
	
	
	
	public void fluentWaitTestPresentInElement(WebElement element,String text)
	{
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(100));	
		fluentWait.pollingEvery(Duration.ofSeconds(100));
		fluentWait.ignoring(NoSuchElementException.class);
		 fluentWait.until(ExpectedConditions.textToBePresentInElement(element,text));
		}
	public WebElement waitForElementToBeVisible(WebElement element, long timeOutInSeconds) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        		fluentWait.withTimeout(Duration.ofSeconds(timeOutInSeconds));
        		fluentWait.pollingEvery(Duration.ofMillis(500));
        		fluentWait.ignoring(NoSuchElementException.class);
        return fluentWait.until(ExpectedConditions.visibilityOf(element));
    }
	public WebElement waitForElementToBeClickable(WebElement element, long timeOutInSeconds) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        		fluentWait.withTimeout(Duration.ofSeconds(timeOutInSeconds));
		fluentWait.pollingEvery(Duration.ofMillis(500));
		fluentWait.ignoring(NoSuchElementException.class);
        return fluentWait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
