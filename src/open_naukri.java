import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\SoftwareFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent thread: "+parent);
		
		Set<String> hs_st = driver.getWindowHandles();
		System.out.println("Set = "+hs_st);
		hs_st.remove(parent);
		System.out.println("After removing parent frm Set = "+hs_st);
		
		for (String str : hs_st) {
			driver.switchTo().window(str);
			driver.close();
		}
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		system.out.println("Closing");
		driver.close();
	}

}
