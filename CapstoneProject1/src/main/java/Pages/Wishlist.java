package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wishlist {
	
	WebDriver driver;
	
	By wishlistButton = By.xpath("//input[@id='add-to-wishlist-button-2']");
	
	By wishlistlink = By.className("ico-wishlist");
	
	By wishlistToCart = By.name("addtocart");
	
	By updateWishlist = By.xpath("//input[@value='Update wishlist']");
	
	By wishlistAddToCart = By.name("addtocartbutton");
	
	By cartQuantity = By.className("cart-qty");
	
	
	public Wishlist(WebDriver driver) {
		this.driver = driver;
	}
	
public void addToWishlist() {
	
	try {
	
	driver.findElement(wishlistButton).click();
	
	}catch(Exception e){
		System.out.println("Unable to add to wishlist" +e.getMessage());
		
		
	}
	
	
}

public void addWishlistToCart() {
	
	driver.findElement(wishlistlink).click();
	driver.findElement(wishlistToCart).click();
	driver.findElement(wishlistAddToCart).click();
	
	
	
	
	
	
     
	
}
}
