package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.CartPage;
import Pages.Homepage;
import Pages.LoginPage;

public class CartTest extends BaseClass {
	
	
	//WebDriver driver;
	
	@BeforeMethod
	public void init() {
		Setup();
	}
	
	@Test
	public void verifyAddToCart() {
		
		//Login step
		LoginPage login = new LoginPage(driver);
		login.login("Siri10@gmail.com", "@Siri10");
		
		//Navigate to AddToCart
		
	   Homepage page = new Homepage(driver);
		page.clickGiftCard();
		
		
		//Cart page
		CartPage cart = new CartPage(driver);
		
		
		//Enter valid details
		cart.addProductDetails("Siri", "Siri10@gmail.com", "2");
		
		//Add to cart
		cart.addToCart();
		
	
		
	
	
	
	//Validate Success
	
		String message = cart.getSuccessMessage();
		System.out.println(message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Assert.assertTrue(message.contains("added to your shopping cart"));
		}
	
	@Test
	public void verifyUpdateQuantity() {
		

		//Login step
		LoginPage login = new LoginPage(driver);
		login.login("Siri10@gmail.com", "@Siri10");
		
		//Navigate to AddToCart
		
	   Homepage page = new Homepage(driver);
		page.clickGiftCard();
		
		
		//Cart page
		CartPage cart = new CartPage(driver);
		
		
		//Enter valid details
		cart.addProductDetails("Siri", "Siri10@gmail.com", "1");
		
		//Add to cart
		cart.addToCart();
		
		//verify in shopping cart
		cart.addToShoppingCart();
		
		
		
			
			
		}
	
	
	@Test	
public void verifyQuantityNegativeValue() {
	
	//Login step
	LoginPage login = new LoginPage(driver);
	login.login("Siri10@gmail.com", "@Siri10");
	
	//Navigate to AddToCart
	
   Homepage page = new Homepage(driver);
	page.clickGiftCard();
	
	
	//Cart page
	CartPage cart = new CartPage(driver);
	
	
	//Enter valid details
	cart.addProductDetails("Siri", "Siri10@gmail.com", "-1");
	
	//Add to cart
	cart.addToCart();
	
	String message = cart.getErrorMessage();
	System.out.println(message);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
Assert.assertTrue(message.contains("Quantity should be positive"));
	
	
	
}
	
		@AfterMethod
		public void close() {
			
			teardown();
		} 
}





