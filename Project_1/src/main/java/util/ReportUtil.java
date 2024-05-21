package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtil implements ITestListener{

public static ExtentReports extenReports;
ExtentTest extendTest;

static {
	    String reportPath = System.getProperty("user.dir") + "\\test-output\\ExtentReport.html";
	    ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
	    htmlReporter.config().setDocumentTitle("Automation Report");
	    htmlReporter.config().setReportName("Test Automation Results");
	    htmlReporter.config().setTheme(Theme.STANDARD);
	    extenReports= new ExtentReports();
	    extenReports.attachReporter(htmlReporter);
		
		
	}
@Override
public  void onTestStart(ITestResult result) {
    String testName =result.getMethod().getMethodName();
	extendTest =extenReports.createTest(testName);
	extendTest.log(Status.INFO,"Test Cases started");
  }


@Override
  public  void onTestSuccess(ITestResult result) {
	extendTest.log(Status.PASS,"Test passed");
  }
@Override
  public  void onTestFailure(ITestResult result) {
	extendTest.log(Status.FAIL,"test Failed");	
  }

@Override
  public  void onTestSkipped(ITestResult result) {
    // not implemented
  }

  @Override 
  public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // not implemented
  }

  @Override
  public  void onTestFailedWithTimeout(ITestResult result) {
    onTestFailure(result);
  }
  @Override
  public  void onStart(ITestContext context) {
	  
	  
    // not implemented
  }
  @Override
  public  void onFinish(ITestContext context) {
	  extenReports.flush();
  }



}
