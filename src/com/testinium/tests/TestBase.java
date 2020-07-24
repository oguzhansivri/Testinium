package com.testinium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class TestBase {
	protected static ChromeDriverService service;
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public TestBase() {
		// TODO Auto-generated constructor stub
	}
	
	public static void Setup() {
		service = new ChromeDriverService.
				Builder().
				usingPort(0).
				usingAnyFreePort().
				build();
		try {
			service.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		wait = new WebDriverWait(driver,15);
		driver.manage().window().maximize();
	}
	
	public static void Stop() {
		driver.quit();
		service.stop();
	}
}
