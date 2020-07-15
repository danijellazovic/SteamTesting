package pages;

import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {

	private String accountNameField = "//input[@id='input_username']";
	private String passwordField = "//input[@id='input_password']";
	private String signInButton = "//span[contains(text(),'Sign in')]";
	private String errorAccountName = "//div[@id='error_display']";
	private String errorPassword = "//div[@id='error_display']";
	private String accountPulldown = "//span[@id='account_pulldown']";


	public WebElement getAccountNameField() {
		return findElement(accountNameField);
	}

	public WebElement getPasswordField() {
		return findElement(passwordField);
	}

	public WebElement getSignInButton() {
		return findElement(signInButton);
	}

	public WebElement getErrorAccountName() {
		return findElement(errorAccountName);
	}

	public WebElement getErrorPassword() {
		return findElement(errorPassword);
	}

	public WebElement getAccountPulldown() {
		return findElement(accountPulldown);
	}

}
