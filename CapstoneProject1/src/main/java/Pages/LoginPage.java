package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
     WebDriver driver;

	By loginLink = By.className("ico-login");
	
	By loginEmail  = By.xpath("//input[@id='Email']");
	
	By loginPassword = By.xpath("//input[@id='Password']");
	
	By loginButton = By.xpath("//input[@value='Log in']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
		
	

	public void login(String email,String password) {
	  try { 
				
	 driver.findElement(loginLink).click();
				 
	 driver.findElement(loginEmail).sendKeys(email);
				 
	 driver.findElement(loginPassword).sendKeys(password);
				 
     driver.findElement(loginButton).click();
	  }catch(Exception e) {
		 
		  System.out.println("login failed"+e.getMessage());	
		  
	  }
				
			} 
			
	}



