package seleniumWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenSearchEngines {
	
	 @Test
	    public void openGoogle(){
	        long startTime = System.currentTimeMillis();
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
	        // Launch the FireFox browser.
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.google.com");
	        driver.quit();
	        long endTime   = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println(totalTime/1000.0+" seconds");
	    }

	    @Test
	    public void openBing(){
	        long startTime = System.currentTimeMillis();
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
	        // Launch the FireFox browser.
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.bing.com");
	        driver.quit();
	        long endTime   = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println(totalTime/1000.0+" seconds");
	    }

	    @Test
	    public void openYahoo(){
	        long startTime = System.currentTimeMillis();
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
	        // Launch the FireFox browser.
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.yahoo.com");
	        driver.quit();
	        long endTime   = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println(totalTime/1000.0+" seconds");
	    }

}
