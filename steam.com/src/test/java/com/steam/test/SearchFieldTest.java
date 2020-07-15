package com.steam.test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import browser.Browser;

public class SearchFieldTest extends BasePageTest {
	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://store.steampowered.com/");
		Browser.getBrowser().manage().window().maximize();
	}

	@Test
	public void SearchIconTest() {
		steam.getHomePage().getSearchField().sendKeys("Red");
		assertTrue(steam.getHomePage().getSearchButton().isDisplayed());
	}

	@Test
	public void searchingForGameTest() {
		steam.getHomePage().getSearchField().sendKeys("Red Dead Redemption 2");
		steam.getHomePage().getSearchButton().click();
		assertTrue(steam.getHomePage().getGameLink().isDisplayed());
	}

}
