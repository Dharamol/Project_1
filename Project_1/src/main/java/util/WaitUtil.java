package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	WebDriver driver;
	public WaitUtil()
	{
		
		this.driver= driver;
	}
	
	
	public void WaitMethod() {
	
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
	}

}
