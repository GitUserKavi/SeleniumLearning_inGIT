package seleniumWaitsExample;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");

		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("demouser");

		WebElement submit = driver.findElement(By.xpath(
				"//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		submit.click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement profile =  (WebElement) wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//div[3]/ul/li[4]/a")); 
			}
		});

		profile.click();
		
	}

}
