package seleniumBasics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ScrollPage {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");
			//find the drop down first
			driver.manage().window().maximize();
			driver.navigate().refresh();
			
			
			  //pass the web element to Select as below WebElement dropDown=
			  WebElement dropDown = driver.findElement(By.name("mydropdown")); 
			  Select selectValue= new  Select(dropDown); 
			  selectValue.selectByVisibleText("Old Cheese");
			  Thread.sleep(2000);
			 
			
			//Click on the previous button at the bottom of the screen
			System.out.println("Current page title is " +driver.getTitle());
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			WebElement previousButton = driver.findElement(By.className("boxprevnext"));
			previousButton.click();
			
			WebElement previousButton1 = driver.findElement(By.className("boxprevnext"));
	        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
	        js1.executeScript("arguments[0].scrollIntoView();", previousButton1);
			System.out.println("Previous Page title is " +driver.getTitle());
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
