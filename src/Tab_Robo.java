import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Robo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\SoftwareFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// To search "Baking" in google, then highlight recipes
		driver.findElement(By.name("q")).sendKeys("Baking", Keys.ENTER);
		Thread.sleep(3000);
		WebElement recipes = driver.findElement(By.xpath("//div[@class=\"e2BEnf U7izfe\"]/h3[contains(.,'Recipes')]"));
		// WebElement baking =
		// driver.findElement(By.xpath("//a[@ping=\"/url?sa=t&source=web&rct=j&url=https://en.wikipedia.org/wiki/Baking&ved=2ahUKEwjx26-c7dbkAhV873MBHcZ6BwoQFjAAegQIARAB\"]/descendant::div[contains(.,'Baking
		// - Wikipedia')]"));

		Thread.sleep(2000);

		Actions a = new Actions(driver);
		a.doubleClick(recipes).build().perform();
		Thread.sleep(2000);

		// To copy, open new tab and paste "Recipes" in new tab 
		
		Robot r = new Robot();

		// To copy r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

		// To open new tab r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		// To paste r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

}
