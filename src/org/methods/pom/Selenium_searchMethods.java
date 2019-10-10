package org.methods.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium_searchMethods {

	@FindBy(id="q")
	private WebElement search_box;
	
	@FindBy(id="submit")
	private WebElement go_button;
	
	public Selenium_searchMethods(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void search_selenium(String name)
	{
			search_box.sendKeys(name);
	}
	
	public void click_go()
	{
		go_button.click();
	}
	
	public void clear_search()
	{
		search_box.clear();
	}
	
	
	
	
}
