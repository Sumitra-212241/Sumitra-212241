package Assignment_01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWebsite {
	
	static WebDriver driver;

	public static void main(String[] args) {
	    
		WebDriverManager.chromedriver().setup();
		
		
			
			try {
				
				driver =new ChromeDriver();
				
				driver.get("https://www.saucedemo.com/");
				
				driver.manage().window().maximize();
				
				String title = driver.getTitle();
				
				System.out.println(title);
				
				WebElement Username = driver.findElement(By.name("user-name"));
				Username.sendKeys("standard_user");
				
				WebElement Password = driver.findElement(By.name("password"));
				Password.sendKeys("secret_sauce");
				
				WebElement Login = driver.findElement(By.name("login-button"));
				Login.click();
				
				
				driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

}
