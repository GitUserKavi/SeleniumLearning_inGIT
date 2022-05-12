package seleniumBasics;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\Chrome\\chromedriver.exe");  
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.google.ca");
		driver.manage().window().maximize();
		
		
		
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("Good Vibes" + "\n");
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("D:\\Selenium_Related\\sample.png");
		FileUtils.copyFile(sourceFile, destinationFile);
		
		driver.quit();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		

}
