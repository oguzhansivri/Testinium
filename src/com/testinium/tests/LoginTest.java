package com.testinium.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

import com.testinium.pages.HomePage;
import com.testinium.pages.LoginPage;

public class LoginTest extends TestBase {
	@Test
	public void valid_UsernameAndPassword() throws InterruptedException{
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver,wait);
		
		loginPage.click(By.className(loginPage.btnText));
		
		assertEquals(loginPage.verifyUsernameAndPassword("abc@gmail.com", "successPasword"),true);
		
	}
	
	@Test
	public void invalid_UsernameAndPassword() throws InterruptedException{
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver,wait);
		
		homePage.click(By.className(loginPage.btnText));
		
		assertEquals(loginPage.verifyUsernameAndPassword("abc@gmail.com", "successPasword"),false);
		
	}
	
	@Test
	public void empty_UsernameAndPassword() throws InterruptedException{
		HomePage homePage = new HomePage(driver, wait);
		LoginPage loginPage = new LoginPage(driver,wait);
		
		homePage.click(By.className(loginPage.btnText));
		
		assertEquals(loginPage.verifyUsernameAndPassword("", ""),false);
		
	}
}
