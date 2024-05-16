package util;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtil implements ITestListener{

public static ExtentReports extenReports;
ExtentTest extendTest;

public ExtentReports generateReports(){
	    String reportPath = System.getProperty("user.dir") + "\\test-output\\ExtentReport.html";
	    ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
	    htmlReporter.config().setDocumentTitle("Automation Report");
	    htmlReporter.config().setReportName("Test Automation Results");
	    htmlReporter.config().setTheme(Theme.STANDARD);
	    ExtentReports extentReports= new ExtentReports();
	    extentReports.attachReporter(htmlReporter);
		return extentReports;
		
	}

public void generateAllReports()
{
	extenReports=generateReports();
}
public void createTestCases(String testName)
{
	extendTest =extenReports.createTest(testName);
}
public void extenTestLogInfo()
{
	extendTest.log(Status.INFO,"entering test");
}
public void extendTestlogPass()
{
	extendTest.log(Status.PASS,"test passed");	
}

public void extendreportFlush()
{
	extenReports.flush();
}




}
