package com.testinium.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.testinium.pages.HomePage;

public class HomeTest extends TestBase {
	@Test
	public void valid_input() throws InterruptedException{
		HomePage homePage = new HomePage(driver,wait);
		assertEquals(homePage.checkInput(homePage.input),"bilgisayar");
	}
	
	@Test
	public void invalid_input() throws InterruptedException{
		HomePage homePage = new HomePage(driver,wait);
		assertNotEquals(homePage.checkInput(homePage.input), "");
	}
}
