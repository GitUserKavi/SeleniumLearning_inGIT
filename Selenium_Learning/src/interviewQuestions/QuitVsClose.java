package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 				
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	}

}
