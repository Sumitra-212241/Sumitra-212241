package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	
	protected WebDriverWait wait;
	
	
	public void Setup()
	{
		try {
			
			
			WebDriverManager.chromedriver().setup();
			
			driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Explicit wait initialization
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			driver.get("https://demowebshop.tricentis.com/");
			
			
			
			
			
		} catch (Exception e) {
			
			System.out.println("Error in launching browser"+e.getMessage());
		}
		
	}
	
	public void teardown() {
		try {
			
		
			driver.quit();
		}  catch (Exception e) {
			
			System.out.println("Error closing browser" +e.getMessage());
	}

}
}

