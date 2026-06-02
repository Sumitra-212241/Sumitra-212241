package Assignment_01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTutorialPoint {
	
	static WebDriver driver;

	public static void main(String[] args) {
	    
		WebDriverManager.chromedriver().setup();
		
		
			
			try {
				
				driver =new ChromeDriver();
				
				driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
				
				driver.manage().window().maximize();
				
				//String title = driver.getTitle();
				
				//System.out.println(title);
				
				WebElement Email = driver.findElement(By.id("email"));
				Email.sendKeys("test@gmail.com");
				
				
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("@test123");
				
				Thread.sleep(2000);
			
				WebElement Login = driver.findElement(By.xpath("//input[@value='Login']"));
				Login.click();
				
				
				//driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

}
}
