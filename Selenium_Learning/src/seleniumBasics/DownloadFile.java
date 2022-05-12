package seleniumBasics;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		try{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\Chrome\\chromedriver.exe");  
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://www.java2s.com/Code/Jar/o/Downloadojdbc14jar.htm");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();

			WebElement downloadLink = driver.findElement(By.xpath("/html/body/div/div/div/a"));
			
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].scrollIntoView();", downloadLink);
			 
			
		
			Thread.sleep(2000);

			downloadLink.click();
			Point position =  driver.manage().window().getPosition();
			System.out.println("Position is " + position);
			
		
		
			
						
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}




}
