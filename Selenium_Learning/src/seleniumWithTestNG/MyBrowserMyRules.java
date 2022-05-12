package seleniumWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyBrowserMyRules {
	
	WebDriver driver;

    @BeforeSuite
    @Parameters ("browser")
    public void launchBrowser(String ChosenBrowser){

        if(ChosenBrowser.equalsIgnoreCase("Firefox")){
            System.out.println("You have chosen "+ ChosenBrowser);
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
            // Launch the FireFox browser.
            driver = new FirefoxDriver();

        } else if (ChosenBrowser.equalsIgnoreCase("Chrome")) {
            System.out.println("You have chosen "+ ChosenBrowser);
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\Chrome\\chromedriver.exe");  
            // Launch the FireFox browser.
            driver = new ChromeDriver();

        } else if (ChosenBrowser.equalsIgnoreCase("Edge")) {
            System.out.println("You have chosen "+ ChosenBrowser);
            System.out.println("May God bless You! I prefer Firefox only");
            System.setProperty("webdriver.edge.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\EdgeWin64\\msedgedriver.exe");  
            // Launch the FireFox browser.
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
    }
    @Test
    public void openGoogle(){
        driver.get("http://www.google.com");    
    }

    @AfterSuite
    public void closeBrowser(){    
        driver.quit();
    }

}
