package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	private String homePageLink = "//div[@id='responsive_page_menu']";
	private String searchField = "//input[@id='store_nav_search_term']";
	private String searchButton = "//a[@id='store_search_link']//img";
	private String viewWishlistButton = "//a[@id='wishlist_link']";
	private String logInButton = "//a[@class='global_action_link']";
	private String cartButton = "//a[@id='cart_link']";
	private String gameLink = "//span[contains(text(),'Red Dead Redemption 2')]";
	private String game2Link = "//a[1]//div[1]//img[1]";
	private String game3Link = "//body[contains(@class,'v6 search_page responsive_page')]/div[contains(@class,'responsive_page_frame with_header')]/div[contains(@class,'responsive_page_content')]/div[contains(@class,'responsive_page_template_content')]/form[@id='advsearchform']/div[contains(@class,'page_content_ctn')]/div[contains(@class,'page_content')]/div[contains(@class,'leftcol large')]/div[@id='search_results']/div[@id='search_result_container']/div[@id='search_resultsRows']/a[2]/div[2]/div[1]/span[1]";
	
	public WebElement getSearchField() {
		return findElement(searchField);
	}
	
	public WebElement getSearchButton() {
		return findElement(searchButton);
	}
	
	public WebElement getViewWishlistButton() {
		return findElement(viewWishlistButton);
	}
	
	public WebElement getLogInButton() {
		return findElement(logInButton);
	}

	
	public WebElement getFirstGameResultRDR2() {
		return findElement("//*[@id=\"search_suggestion_contents\"]/a[1]");

	}

	public WebElement getGameLink() {
		return findElement(gameLink);
	}

	public WebElement getHomePageLink() {
		return findElement(homePageLink);
	}

	public WebElement getGame2Link() {
		return findElement(game2Link);
	}

	public WebElement getGame3Link() {
		return findElement(game3Link);
	}

	public WebElement getCartButton() {
		return findElement(cartButton);
	}	

	
}
	
	
	