package seleniumWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenGoogle  {  
	
	
	@Test
  public void openGoogle() {
		
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
	        // Launch the FireFox browser.
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.google.com");
	        
	        driver.quit();
  }
}
