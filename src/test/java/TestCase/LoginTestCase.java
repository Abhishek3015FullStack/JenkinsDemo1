package TestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Base1232;
import PageObject.LoginPage;
import resources.base;

public class LoginTestCase extends Base1232{
	
	@Test(retryAnalyzer= TestCase.Retry.class)
	public void LoginData()
	{
		LoginPage LoginPage = new LoginPage(driver);
		LoginPage.AddData();
		Assert.assertTrue(false);
		
	}
	
}
