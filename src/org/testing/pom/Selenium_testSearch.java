package org.testing.pom;

import java.util.concurrent.TimeUnit;
import org.methods.pom.Selenium_searchMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_testSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\SoftwareFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		
		Selenium_searchMethods sm = new Selenium_searchMethods(driver);
		sm.search_selenium("Java");
		sm.click_go();
		driver.navigate().back();
		
		sm.clear_search();
		sm.search_selenium("testng");
		sm.click_go();		
					
	}
}
