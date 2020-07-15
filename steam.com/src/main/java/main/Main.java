package main;


import browser.Browser;
import pages.Steam;

public class Main {
	
	public static void main(String[] args) {
		
		Steam steam = new Steam();
		Browser.getBrowser().get("https://store.steampowered.com/");
		steam.getHomePage().getSearchField().clear();
		steam.getHomePage().getSearchField().sendKeys("Red Dead Redemption 2");
		Browser.getBrowser().quit();
	}

}
