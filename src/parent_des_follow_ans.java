import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_des_follow_ans {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\SoftwareFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bluestone.com/");
		
		//To get all the web elements on parent menu bar 
		
		List<WebElement> eles = driver.findElements(By.xpath("//nav[@class=\"wh-navbar\"]/ul/li"));
		for (WebElement index : eles) {
			System.out.println(index.getText());
		}
		
		//To click on Ring
		/*
		 * driver.findElement(By.
		 * xpath("//nav[@class=\"wh-navbar\"]/descendant::li[@class=\"menuparent repb\"]/a[@title=\"Rings\"]"
		 * )).click(); Thread.sleep(3000);
		 */
	}

}
