package seleniumWaitsExample;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 				
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");

		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("demouser");

		WebElement loginButton = driver.findElement(By.xpath(
				"//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginButton.click();


		WebElement myprofile = driver.findElement(By.xpath("//div[3]/ul/li[4]/a"));
		myprofile.click();

		driver.quit();


	}

}
