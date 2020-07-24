package com.testinium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public String txtMail = "user-name";
	public String txtPassword = "password";
	public String btnText = "account_button login";
	
	public boolean verifyUsernameAndPassword(String username, String password) throws InterruptedException{
		writeText(By.className(txtMail),username);
		
		click(By.className(btnText));
		
		Thread.sleep(500);
		if(driver.getCurrentUrl().contains("password")) {
			writeText(By.name(txtPassword),password);
			Thread.sleep(600);
			return driver.getCurrentUrl().contains("signinoptions");
		}else {
			return false;
		}
	}
}
