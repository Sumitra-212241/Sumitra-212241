package Assignment_02_06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	static WebDriver driver;
	
	@Test
	public void login() {
	    
		WebDriverManager.chromedriver().setup();
		
		
			
			try {
				
				driver =new ChromeDriver();
				
				driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
				
				driver.manage().window().maximize();
				
				//String title = driver.getTitle();
				
				//System.out.println(title);
				
				WebElement Alertbutton1 = driver.findElement(By.cssSelector("button[onclick='showAlert()']"));
			     Alertbutton1.click();
			     
			     Thread.sleep(2000);
			     
			     Alert alt1= driver.switchTo().alert();
			     
			     System.out.println("Alert text :"+alt1.getText());
			     alt1.accept();
			     
			     
			     
			     /*WebElement Alertbutton2 = driver.findElement(By.cssSelector("button[onclick='myMessage()']"));
			     Alertbutton2.click();
			     
			     Thread.sleep(2000);
			     
			     Alert alt2= driver.switchTo().alert();
			     alt2.accept();  */
			     
			     WebElement Alertbutton3 = driver.findElement(By.cssSelector("button[onclick='myDesk()']"));
			     Alertbutton3.click();
			     
			     Thread.sleep(2000);
			     
			     Alert alt3= driver.switchTo().alert();
			     alt3.dismiss();
			     
			     WebElement Alertbutton4 = driver.findElement(By.cssSelector("button[onclick='myPromp()']"));
			     Alertbutton4.click();
			     
			     Thread.sleep(2000);
			     
			     Alert alt4= driver.switchTo().alert();
			     Thread.sleep(2000);
			     alt4.sendKeys("Suma");
			     Thread.sleep(2000);
			     alt4.accept();
				
				
				
				driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
