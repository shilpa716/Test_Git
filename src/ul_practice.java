import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ul_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\SoftwareFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(12000);
		
		//To close pop-up
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		Thread.sleep(2000);
		
		//To goto "collections" from "Dining"
		driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]/following::li[@class=\"topnav_item collectionsunit\"]"))
		.click();
		Thread.sleep(2000);
		
		//From Collections goto living using ancestor
		/*
		 * driver.findElement(By.
		 * xpath("//li[@class=\"topnav_item collectionsunit\"]/ancestor::div[@id=\"topnav_wrapper\"]/descendant::li[@class=\"topnav_item livingunit\"]"
		 * )) .click(); Thread.sleep(2000);
		 */
		
		/*
		 * //From Collections goto living using preceding 
		 * driver.findElement(By.
		 * xpath("//li[@class=\"topnav_item diningunit\"]/following::li[@class=\"topnav_item collectionsunit\"]/preceding::li[@class=\"topnav_item livingunit\"]"
		 * )) .click(); Thread.sleep(2000);
		 */
		
		//From Collections goto living using parent and descendant
		driver.findElement(By.xpath("//li[@class=\"topnav_item collectionsunit\"]/parent::ul[@class=\"topnav bodytext\"]/descendant::li[@class=\"topnav_item livingunit\"]"))
				.click();
		Thread.sleep(2000);

	}

}
