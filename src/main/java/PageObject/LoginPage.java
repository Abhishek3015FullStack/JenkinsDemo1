package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@formcontrolname='agencyName']")
	WebElement AgencyNameElement;
	
	@FindBy(xpath ="//input[@formcontrolname='userName']")
	WebElement UsernameElement;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement PasswordElement;
	
	By Abhishek =  By.xpath("//input[@formcontrolname='password']");
	public WebElement data ()
	{
		return driver.findElement(Abhishek);
	}
	
	public WebElement AddData()
	{
		
		return AgencyNameElement;
	}
}
