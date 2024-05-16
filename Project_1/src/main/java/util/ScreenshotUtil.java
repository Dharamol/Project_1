package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenshotUtil {
	WebDriver driver;

	public void screenshot(WebDriver driver, String screenshot) throws IOException
	{
		this.driver=driver;
		String Filelocation = System.getProperty("user.dir")+"\\src\\main\\resources\\Screenshots";
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver ;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File(Filelocation+"\\"+screenshot+".png"));
	}
}
