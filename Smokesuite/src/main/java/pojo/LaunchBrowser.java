package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static WebDriver CromeBrowserLaunch(String a)
	{
		System.setProperty("webdriver.chrome.driver","E:\\VELOCITY LEC\\SOFTWARE\\ECLIPSE\\ECLIPSE CODE\\Smokesuite\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(a);
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver FirefoxBrowserLaunch()
	{
		System.setProperty("webdriver.gecko.driver","E:\\VELOCITY LEC\\SOFTWARE\\ECLIPSE\\ECLIPSE CODE\\Smokesuite\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		return driver;
	}
	
}
