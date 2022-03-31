package interviewQuestions;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToSearchGoogle_Part15 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.ca");
		
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		
		/* searchBox.sendKeys("Erode"+Keys.ENTER); */
		
		//if Form type=submit means, submit() will work
		
		  //searchBox.sendKeys("Erode"); 
		  //searchBox.submit();
		 
		
		//Using Robot class "do" google search
		/*searchBox.sendKeys("Erode"); 
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		
		// New line command after the sendkey term will also work
		  
		searchBox.sendKeys("Erode \n"); 
		
	}

}
