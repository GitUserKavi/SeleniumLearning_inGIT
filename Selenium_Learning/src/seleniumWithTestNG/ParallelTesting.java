package seleniumWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void openGoogle(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

	@Test
	public void openBing(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}

	@Test
	public void openYahoo(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		driver.quit();
	}

}
