package com.steam.test;

import browser.Browser;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LogInPageTest extends BasePageTest {
	
	public WebDriverWait wait;

	@Before
	public void testSetup() {		
		Browser.getBrowser().manage().window().maximize();
		Browser.getBrowser().get("https://store.steampowered.com/");
		wait = new WebDriverWait(Browser.getBrowser(), 10);
	}
		
	
	@Test
	public void cSuccessfullLogInTest() {
		
		
		steam.getHomePage().getLogInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		steam.getLogInPage().getAccountNameField().click();
		steam.getLogInPage().getAccountNameField().sendKeys("danijellazovic");
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		steam.getLogInPage().getPasswordField().click();
		steam.getLogInPage().getPasswordField().sendKeys("danijell.96");
		steam.getLogInPage().getSignInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertTrue(steam.getLogInPage().getAccountPulldown().isDisplayed());
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	}   
	
	
	@Test
	public void aInvalidUsernameTest() {
		steam.getHomePage().getLogInButton().click();
		steam.getLogInPage().getAccountNameField().click();
		steam.getLogInPage().getAccountNameField().sendKeys("123123213dasdada");
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		steam.getLogInPage().getPasswordField().click();
		steam.getLogInPage().getPasswordField().sendKeys("danijell.96");
		steam.getLogInPage().getSignInButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='error_display']")));
		String error = Browser.getBrowser().findElement(By.xpath("//div[@id='error_display']")).getText();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("The account name or password that you have entered is incorrect." , error);

	}

	@Test
	public void bInvalidPasswordTest() {
		steam.getHomePage().getLogInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		steam.getLogInPage().getAccountNameField().click();
		steam.getLogInPage().getAccountNameField().sendKeys("danijellazovic");
		steam.getLogInPage().getPasswordField().click();
		steam.getLogInPage().getPasswordField().sendKeys("1");
		steam.getLogInPage().getSignInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='error_display']")));
		assertEquals("The account name or password that you have entered is incorrect." ,
				steam.getLogInPage().getErrorPassword().getText());
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
}


