package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/*import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;*/
import org.openqa.selenium.WebDriver;
/*import org.openqa.selenium.WebElement;*/
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysAlternatives {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca");
		//WebElement searchBox = driver.findElement(By.name("q"));
		
		// Instead of searchBox.sendkeys("Duckling");

		
		//Next way, Javascript Executor
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('q')[0].value='Duckling'", "");
		
		//executor.executeScript("arguments[0].value='Kavin'", searchBox);
		
		//Another Way, using robot class
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_K);	//KAVIN
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
						
	}

}
