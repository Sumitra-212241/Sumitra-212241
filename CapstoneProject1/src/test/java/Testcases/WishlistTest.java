package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.CartPage;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.Wishlist;

public class WishlistTest extends BaseClass {
	
	@BeforeMethod
	public void init() {
		Setup();
	}
	
	@Test
	public void verifyAddToWishlist() {
		
		LoginPage login = new LoginPage(driver);
		login.login("Siri10@gmail.com", "@Siri10");
		
		//Navigate to AddToCart
		
	   Homepage page = new Homepage(driver);
		page.clickGiftCard();
		
		
		//Cart page
		CartPage cart = new CartPage(driver);
		
		
		//Enter valid details
		cart.addProductDetails("Siri", "Siri10@gmail.com", "1");
		
		Wishlist list = new Wishlist(driver);
		list.addToWishlist();
		
		String message = cart.getSuccessMessage();
		System.out.println(message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Assert.assertTrue(message.contains("added to your wishlist"));
	
	

}
	
	@Test
	public void verifyWishlistToCart() {
		
		LoginPage login = new LoginPage(driver);
		login.login("Siri10@gmail.com", "@Siri10");
		
		//Navigate to AddToCart
		
	   Homepage page = new Homepage(driver);
		page.clickGiftCard();
		
		
		//Cart page
		CartPage cart = new CartPage(driver);
		
		
		//Enter valid details
		cart.addProductDetails("Siri", "Siri10@gmail.com", "1");
		
		Wishlist list = new Wishlist(driver);
		list.addToWishlist();
		
		
		
		list.addWishlistToCart();
		
		
	
		
		
		
		
		
	}
	
	@AfterMethod
	public void close() {
		
		teardown();
	} 
	
}
