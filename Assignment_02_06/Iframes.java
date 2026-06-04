package Assignment_02_06;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	
	static WebDriver driver;
	
	@Test
	public void login() {
	    
		WebDriverManager.chromedriver().setup();
		
		
			
			try {
				
				driver =new ChromeDriver();
				
				driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				//String title = driver.getTitle();
				
				//System.out.println(title);
				
				
				driver.switchTo().frame(1);
				
				//System.out.println(driver.getPageSource());
			Thread.sleep(2000);
			String text = driver.findElement(By.tagName("h1")).getText();
		
			
			
			System.out.println(text);
				
				
				

				
				
				driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}}
	


