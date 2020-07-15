package com.steam.test;

    import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
	import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class WishlistPageTest extends BasePageTest {

	public WebDriverWait wait;
	

		@Before
		public void testSetup() {
			Browser.getBrowser().manage().window().maximize();
			Browser.getBrowser().get("https://store.steampowered.com/");
			wait = new WebDriverWait(Browser.getBrowser(), 10);
			

			
		}

		@Test
		public void aAddToWishListTest() {
			steam.getHomePage().getLogInButton().click();
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getLogInPage().getAccountNameField().click();
			steam.getLogInPage().getAccountNameField().sendKeys("danijellazovic");
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			steam.getLogInPage().getPasswordField().click();
			steam.getLogInPage().getPasswordField().sendKeys("danijell.96");
			steam.getLogInPage().getSignInButton().click();
			wait.until(ExpectedConditions.visibilityOf(steam.getLogInPage().getAccountPulldown()));
			steam.getHomePage().getSearchField().sendKeys("Red dead redemption 2");
			steam.getHomePage().getSearchButton().click();
			steam.getHomePage().getGameLink().click();
			steam.getGamePage().click(steam.getGamePage().getAddToWishListButton());
			wait.until(ExpectedConditions.visibilityOf(steam.getGamePage().getAddedToWishlistMessage()));
			assertEquals(steam.getGamePage().getAddedToWishlistMessage().getText() , "Item added to your wishlist!");
			
			}
		
		@Test
		public void bRemoveFromWishlistTest() {
			steam.getHomePage().getViewWishlistButton().click();
			steam.getGamePage().getRemoveFromWishlist().click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='newmodal_content']")));
			steam.getGamePage().getRemoveFromWishlistConformation().click();
			assertEquals(steam.getGamePage().getEmptyWishlist().getText() , "OOPS, THERE'S NOTHING TO SHOW HERE");
		}

	}



