package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	static WebDriver driver;
	
	
	
	By shoppingCart = By.xpath("//span[normalize-space()='Shopping cart']");
	
	By recipientName = By.xpath("//input[@id='giftcard_2_RecipientName']");
	
	By recipientEmail = By.xpath("//input[@id='giftcard_2_RecipientEmail']");
	
	By quantity = By.xpath("//input[@id='addtocart_2_EnteredQuantity']");
	
	By shoppingCartQuantity = By.cssSelector("input.qty-input");
	
	By updateShoppingCart = By.name("updatecart");
	
	By addToCartButton = By.id("add-to-cart-button-2");
	
	
	

	
	//By successMessage = By.xpath("//p[@class='content']");//
	
	//By successMessage =By.className("content");
	
	By successMessage = By.cssSelector(".bar-notification.success");
	
	//By invalidQuantityMessage = By.cssSelector(".bar-notification.error']");
	
	By invalidQuantityMessage = By.xpath("//div[contains(@class,'bar-notification')]//p[contains(text(),'Quantity should be positive')]");
	
	
	
			
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addProductDetails(String rname, String remail,String tquantity)
	{
		
		try {
		
		
		driver.findElement(recipientName).sendKeys(rname);
		
		driver.findElement(recipientEmail).sendKeys(remail);
		
		driver.findElement(quantity).clear();
		
		driver.findElement(quantity).sendKeys(tquantity);	
		
		}catch(Exception e){
			
			System.out.println("Error entering product details" +e.getMessage());
			
		}
		
				
		}
	
	public void addToCart() {
		
		
	     try {
	    	 
	    	 driver.findElement(addToCartButton).click();
	    	 
	    
	    	 
	     }catch(Exception e){
	    	 System.out.println("Add to cart error" +e.getMessage());
	     }
		
	}
	
	public String getSuccessMessage() {
		
		try {
			Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
		    
		    return message.getText();
		    
			
		}catch(Exception e){
			return "Message not found";
		}
	}
		public String getErrorMessage() {
			
			try {
				Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			    WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(invalidQuantityMessage));
			    
			    return message.getText();
			    
		
			    
				
			}catch(Exception e){
				return "Message not found";
			}
		
	}
	
	public void addToShoppingCart() {
		
		driver.findElement(shoppingCart).click();
		driver.findElement(shoppingCartQuantity).clear();
		driver.findElement(shoppingCartQuantity).sendKeys("2");
		driver.findElement(updateShoppingCart).click();
		
		
		
		
		
	}
}
	
	
	


