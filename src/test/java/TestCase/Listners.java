package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageObject.Base1232;

public class Listners extends Base1232 implements ITestListener  {
	
	public ExtentReports extents  = GetReportObject.getReportObject();
	public WebDriver driver;
	public ExtentTest test;
	public ThreadLocal<ExtentTest> extentTest  = new ThreadLocal<ExtentTest>(); 

	public void onTestStart(ITestResult result) 
	{
	    // not implemented
		test = extents.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		 extentTest.get().log(Status.PASS, "This is TestCase is passed");
		
	}

	 public void onTestFailure(ITestResult result) 
	 {
		 extentTest.get().fail(result.getThrowable());
		try 
		{
			String Testname = result.getMethod().getMethodName();
			driver  = (WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			String getpath = getscreenshot(Testname, driver);
			extentTest.get().addScreenCaptureFromPath(getpath, "Screenshot on failure");
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public void onFinish(ITestContext context)
	 {
		 extents.flush();
	 }
}
