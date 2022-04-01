package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	@FindBy (xpath ="//input[@name=\"uid\"]") private WebElement UseridField;
	@FindBy (xpath ="//input[@name=\"password\"]") private WebElement passwordField;
	@FindBy (xpath ="//input[@name=\"btnLogin\"]") private WebElement login;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterUserId(String userid)
	{
		UseridField.sendKeys(userid);
	}
		
	public void EnterPassword(String Password)
	{
		passwordField.sendKeys(Password);
	}

	public void ClickOnLogIn()
	{
		login.click();
	}

}
