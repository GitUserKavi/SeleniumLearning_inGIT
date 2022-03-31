package interviewQuestions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
//import org.apache.commons.io.FileUtils;
/*import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*import org.openqa.selenium.io.FileHandler;
*/
public class Takes_ScreenShotExample {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", 				
					"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.navigate().to("http://www.leafground.com/pages/Alert.html");
			
			
			/*
			 * //Take a Screenshot here TakesScreenshot screenshot = (TakesScreenshot)
			 * driver; File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			 * 
			 * File detinationfile = new File("D:\\Selenium_Related\\sample.png");
			 * FileHandler.copy(sourceFile, detinationfile);
			 */
			
			WebElement alertBox = driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]"));
			alertBox.click();
						
			//Take a TakesScreenshot here// will not work here because of alert
					
			Robot robot = new Robot();
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle recatangle = new Rectangle(screensize);
			BufferedImage source = robot.createScreenCapture(recatangle);
			
			File destinationFile = new File("D:\\Selenium_Related\\robotsnap.png");
			ImageIO.write(source, "png", destinationFile);
			
	}

}
