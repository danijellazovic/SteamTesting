package com.steam.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import browser.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pages.Steam;

public class BasePageTest {

	protected static Steam steam;
	protected static WebDriver driver;

	@BeforeClass
	public static void setup() {
		steam = new Steam();
		
		ChromeDriverManager.chromedriver().setup();
	}

	@AfterClass
	public static void cleanUp() {
		Browser.getBrowser().quit();
	}
	
}

