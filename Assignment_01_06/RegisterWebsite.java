package Assignment_01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterWebsite {
	
	static WebDriver driver;

	public static void main(String[] args) {
	    
		WebDriverManager.chromedriver().setup();
		
		
			
			try {
				
				driver =new ChromeDriver();
				
				driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
				
				driver.manage().window().maximize();
				
				//String title = driver.getTitle();
				
				//System.out.println(title);
				
				WebElement FirstName = driver.findElement(By.id("firstname"));
				FirstName.sendKeys("Siri");
				
				WebElement LastName = driver.findElement(By.id("lastname"));
				LastName.sendKeys("Dutt");
				
				WebElement Username = driver.findElement(By.id("username"));
				Username.sendKeys("Siri Dutt");
				
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("@setsiri");
				
				Thread.sleep(2000);
			
				WebElement Register = driver.findElement(By.xpath("//input[@value='Register']"));
				Register.click();
				
				
				//driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}}


