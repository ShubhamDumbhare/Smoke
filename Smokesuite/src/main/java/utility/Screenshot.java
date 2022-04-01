package utility;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	//With Random Number
	public static  void ScreenShotMethod(WebDriver driver) throws IOException
	{
		Random r = new Random();
		int value = r.nextInt();
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("E:\\VELOCITY LEC\\SOFTWARE\\ECLIPSE\\ECLIPSE CODE\\Smokesuite\\ScreenShot"+value+".png");
		FileHandler.copy(Source, target);
	}

}
