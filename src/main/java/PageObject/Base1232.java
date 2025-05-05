package PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base1232 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public  void OpenUrl()
	{
		driver = intializeDriver();
		driver.get("https://buildcon.shaligraminfotech.com:7002/#/login");
		
	}
	public WebDriver intializeDriver()
	{
		driver = new ChromeDriver();
		return driver;
	}

	public String getscreenshot(String testname, WebDriver driver) throws IOException {
		// we first take as screen shot and save it in to virtual source file and then
		// will copy same to in physical file with failed test case name
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\reports\\" + testname + ".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
}
