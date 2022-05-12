package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\FireFox\\geckodriver.exe");  
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




			driver.navigate().to("http://www.echoecho.com/htmlforms11.htm");
			//find the drop down first
			driver.manage().window().maximize();
			driver.navigate().refresh();

			WebElement dropDown= driver.findElement(By.name("dropdownmenu"));


			JavascriptExecutor js1 = ((JavascriptExecutor) driver);
			js1.executeScript("arguments[0].scrollIntoView();", dropDown);

			//pass the web element to Select as below
			Select selectValue= new Select(dropDown);
			Thread.sleep(2000);
			selectValue.selectByIndex(1); //select by index position

			Thread.sleep(2000);

			selectValue.selectByValue("Butter"); //select by value Thread.sleep(2000);
			Thread.sleep(2000);

			selectValue.selectByVisibleText("Milk"); // select by visible text

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}