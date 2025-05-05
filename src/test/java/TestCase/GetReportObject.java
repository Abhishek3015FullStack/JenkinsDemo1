package TestCase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class GetReportObject {

	public static ExtentReports getReportObject()
	{
		String Path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);  // path for the file
		reporter.config().setReportName("Abhishek Extent repor4t"); // report name 
		reporter.config().setDocumentTitle("Abhishek extent rep45ort"); // setting the document name
		
		ExtentReports extent  = new ExtentReports(); 
		extent.attachReporter(reporter); // attach this configuration for the reporter
		extent.setSystemInfo("Tester", "Abhishek"); // tester name will show there
		return extent; 
		
	}
}
