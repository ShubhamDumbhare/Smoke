package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pOM.LogInPage;
import pojo.LaunchBrowser;
import utility.Parametrization;
import utility.Screenshot;

public class guru99 {
	
	 static Logger log = Logger.getLogger(guru99.class.getName());
	
	WebDriver driver;

	@BeforeTest
	public void OpenBrowser()
	{
		driver = LaunchBrowser.CromeBrowserLaunch();
	}
		
	@Test
	public void PostiveTestLogInPage() throws EncryptedDocumentException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LogInPage pom = new LogInPage(driver);
		String userid = Parametrization.DataFromExecl("LogInCredential",0, 0);
		log.info("Entering userid");
		pom.EnterUserId(userid);
		String pass = Parametrization.DataFromExecl("LogInCredential",1, 1);
		log.info("Entering Password");
		pom.EnterPassword(pass);
		pom.ClickOnLogIn();	
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
	}
	
	@AfterTest
	public void CloseBrowser() throws IOException
	{
//		Screenshot.ScreenShotMethod(driver);
		driver.close();
	}

	}


