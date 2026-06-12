package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	
	WebDriver driver;
	
	By addGiftCard = By.xpath("(//input[@value='Add to cart'])[1]");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickGiftCard() {
		
		try {
		
		driver.findElement(addGiftCard).click();
		
		} catch(Exception e){
			
			System.out.println("Error clcking on giftcard link" +e.getMessage());
			
		}
		
		
	}

}
