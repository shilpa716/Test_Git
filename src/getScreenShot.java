import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class getScreenShot {
	public static void ScreenShot_method(WebDriver driver, String name ) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE );
		File store_screenshot = new File("./ScreenShots/"+name+".png");
		Files.copy(screenShot, store_screenshot);
	}
}
