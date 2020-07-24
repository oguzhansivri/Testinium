package com.testinium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		driver.get("https://www.trendyol.com/");
	}

	public String input = "search-box";
	
	public String checkInput(String input) {
		click(By.className(input));
		return driver.getCurrentUrl();
	}
}
