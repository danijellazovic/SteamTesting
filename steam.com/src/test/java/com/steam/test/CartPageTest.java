package com.steam.test;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import browser.Browser;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class CartPageTest extends BasePageTest {
		
	public WebDriverWait wait;

		@Before
		public void testSetup() {
			Browser.getBrowser().manage().window().maximize();
			Browser.getBrowser().get("https://store.steampowered.com/");
			wait = new WebDriverWait(Browser.getBrowser(), 10);

		}
		
		@Test
		public void aAddItemToCartTest() {
			steam.getHomePage().getSearchField().sendKeys("Red dead redemption 2");
			steam.getHomePage().getSearchButton().click();
			steam.getHomePage().click(steam.getHomePage().getGameLink());
			wait.until(ExpectedConditions.elementToBeClickable(steam.getGamePage().getAddToCartButton()));
			steam.getGamePage().getAddToCartButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			assertEquals(steam.getGamePage().getStatusMessage().getText() , "YOUR ITEM'S BEEN ADDED!");
		
		}
		
		@Test
		public void bRemoveFromCartTest() {
			steam.getHomePage().getCartButton().click();
			steam.getGamePage().getRemoveFromCartButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			assertEquals(steam.getGamePage().getStatusMessage().getText() , "YOUR ITEM HAS BEEN REMOVED!");
		}
		
	
		@Test
		public void cRemoveAllFromCartTest() {
			steam.getHomePage().getSearchField().sendKeys("Red dead redemption 2");
			steam.getHomePage().getSearchButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getHomePage().click(steam.getHomePage().getGameLink());
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getGamePage().getAddToCartButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getHomePage().getSearchField().sendKeys("Cyberpunk 2077");
			steam.getHomePage().getSearchButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getHomePage().getGame2Link().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getGamePage().getAddToCartButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getGamePage().getRemoveAllButton().click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='newmodal_buttons']")));
			steam.getGamePage().getConformationButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			assertEquals(steam.getGamePage().getEstimatedTotal().getText() , "0,--ˆ");
		}
}

		