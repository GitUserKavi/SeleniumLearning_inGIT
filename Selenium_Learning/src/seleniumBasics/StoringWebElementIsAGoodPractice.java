package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StoringWebElementIsAGoodPractice {

	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			driver.navigate().to("http://www.google.ca"); 

			WebElement searchBox=driver.findElement(By.name("q"));
			searchBox.sendKeys("Say Cheese!");

			WebElement searchIcon=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
			searchIcon.click();

			Thread.sleep(2000); // waiting for two seconds for the page gets loaded

			WebElement link=driver.findElement(By.partialLinkText("Say cheese - Wikipedia"));
			link.click();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
