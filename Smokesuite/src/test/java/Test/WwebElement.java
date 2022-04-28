package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;

public class WwebElement {
	WebDriver driver;
	
	
	@BeforeTest
	public void openBrowser() 
	{
	driver = LaunchBrowser.CromeBrowserLaunch("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

       
		 
    		
       
	
	
        
        
        
	

}
