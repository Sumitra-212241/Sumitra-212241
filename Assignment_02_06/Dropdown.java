package Assignment_02_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
static WebDriver driver;
	
	@Test
	public void login() {
	    
		WebDriverManager.chromedriver().setup();
		
		
			
			try {
				
				driver =new ChromeDriver();
				
				driver.get("https://the-internet.herokuapp.com/dropdown");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
			     WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
			     Select dropdownoption = new Select(dropdown);
			     
			    dropdownoption.selectByIndex(1);
			    
			    Thread.sleep(2000);
			    			
				
				driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}