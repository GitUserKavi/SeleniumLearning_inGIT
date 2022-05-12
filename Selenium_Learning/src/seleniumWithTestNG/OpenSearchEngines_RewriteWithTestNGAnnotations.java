package seleniumWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenSearchEngines_RewriteWithTestNGAnnotations {
	
	WebDriver driver;
    long startTime;
    long endTime;
    long totalTime;

    @BeforeSuite
    public void launchBrowser(){
        startTime = System.currentTimeMillis();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
        // Launch the FireFox browser.
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openGoogle(){
        driver.get("http://www.google.com");    
    }
    @Test
    public void openBing(){
        driver.get("http://www.bing.com");
    }

    @Test
    public void openYahoo(){
        driver.get("http://www.yahoo.com");    
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
        endTime   = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println(totalTime/1000.0+" seconds");
    }

}
