package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String []args) throws InterruptedException {
		//Base URL : http://www.javascriptkit.com/javatutors/alert2.shtml

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\Chrome\\chromedriver.exe");

			WebDriver  driver = new ChromeDriver();

			driver.navigate().to("http://www.javascriptkit.com/javatutors/alert2.shtml");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();

			//Simple Alert - window.alert()
			WebElement simpleAlert = driver.findElement(By.name("B2"));
			simpleAlert.click();

			
			Alert alert1 = driver.switchTo().alert();
			Thread.sleep(2000);
			System.out.println(alert1.getText());
			alert1.accept();



			//Confirm Alert - window.confirm(), window.alert()

			WebElement confirmAlert = driver.findElement(By.name("B3"));
			confirmAlert.click();

			Alert alert2 = driver.switchTo().alert();
			Thread.sleep(2000);
			alert2.accept();
			Thread.sleep(2000);
			System.out.println(alert2.getText());
			alert2.accept();



			// Alert Prompt - 	window.prompt()

			WebElement alertPrompt = driver.findElement(By.name("B4"));
			alertPrompt.click();
			Alert alert3 = driver.switchTo().alert();
			Thread.sleep(2000);
			alert3.sendKeys("automation");
			Thread.sleep(2000);
			alert3.accept();
			Thread.sleep(2000);
			System.out.println(alert3.getText());
			alert3.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		}
	}




