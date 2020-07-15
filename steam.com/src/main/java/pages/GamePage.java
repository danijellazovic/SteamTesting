package pages;

import org.openqa.selenium.WebElement;

public class GamePage extends BasePage {
	
	private String addToCartButton = "//a//span[contains(text(),'Add to Cart')]";
	private String addToWishlistButton = "//span[contains(text(),'Add to your wishlist')]";
	private String purchaseForMyselfButton = "//span[contains(text(),'Purchase for myself')]";
    private String purchaseAsAGiftButton = "//span[contains(text(),'Purchase as a gift')]";
	private String continueShoppingButton = "//span[contains(text(),'Continue Shopping')]";
	private String removeFromCartButton = "//a[@class='remove_link'][contains(text(),'Remove')]";
	private String removeAllButton = "//a[contains(text(),'Remove all items')]";
	private String removeFromWishlist = "//div[@class='delete']";
	private String statusMessage = "//div[@class='cart_status_message']";
	private String conformationButton = "//span[contains(text(),'Yes')]";
	private String estimatedTotal = "//div[@id='cart_estimated_total']";
	private String addedToWishlistMessage = "//div[@class='wishlist_added_temp_notice']";
	private String removeFromWishlistConformation = "//span[contains(text(),'OK')]";
	private String emptyWishlist = "//h2[contains(text(),\"Oops, there's nothing to show here\")]";
	
	public WebElement getAddToCartButton() {
		return findElement(addToCartButton);
	}

	public WebElement getAddToWishListButton() {
		return findElement(addToWishlistButton);
	}
	
    public WebElement getPurchaseForMyselfButton() {
		return findElement(purchaseForMyselfButton);
	}
    
	public WebElement getPurchaseAsAGiftButton() {
		return findElement(purchaseAsAGiftButton);
	}

	public WebElement getContinueShoppingButton() {
		return findElement(continueShoppingButton);
	}

	public WebElement getRemoveFromCartButton() {
		return findElement(removeFromCartButton);
	}

	public WebElement getRemoveAllButton() {
		return findElement(removeAllButton);
	}

	public WebElement getRemoveFromWishlist() {
		return findElement(removeFromWishlist);
	}

	public WebElement getStatusMessage() {
		return findElement(statusMessage);
	}

	public WebElement getConformationButton() {
		return findElement(conformationButton);
	}

	public WebElement getEstimatedTotal() {
		return findElement(estimatedTotal);
	}

	public WebElement getAddedToWishlistMessage() {
		return findElement(addedToWishlistMessage);
	}

	public WebElement getRemoveFromWishlistConformation() {
		return findElement(removeFromWishlistConformation);
	}

	public WebElement getEmptyWishlist() {
		return findElement(emptyWishlist);
	}
}
