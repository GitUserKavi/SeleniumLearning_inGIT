package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserRefreshing_Multipleways {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.google.ca");
		driver.findElement(By.name("q")).sendKeys("Agni Pariktchai");
		

		//Refresh comand
		//driver.navigate().refresh();

		//get current URL
		driver.get(driver.getCurrentUrl());
		
		
		/*
		 * //JavascriptExecuter JavascriptExecutor executer = (JavascriptExecutor)
		 * driver; executer.executeScript("location.reload()");
		 * //executer.executeScript("history.go(0)");
		 */ 	
		
		//if javascript executer is not used, we can use robot class
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_F5);
		 * robot.keyRelease(KeyEvent.VK_F5);
		 */
		
		//Page Refresh using F5 key, by robot class 
		
		/*
		 * Robot robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_F5); robot.keyRelease(KeyEvent.VK_F5);
		 * 
		 */
		// Not working  one
		/*
		 * driver.findElement(By.name("q")).sendKeys("Agni Pariktchai");
		 * driver.findElement(By.name("q")).sendKeys("\uE035");
		 * driver.findElement(By.name("q")).sendKeys(Keys.F5);
		 */
	}

}

