package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Difference Between Get and Navigate to
		//Point 1 :Navigate.to() method stores history; But the get() method won't
		//Point 2 : get() method will wait for all the elements to apper in the DOM, then it will got to the next statement
		System.setProperty("webdriver.chrome.driver", 				
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.google.ca"); 
		driver.navigate().to("http://www.google.ca");
		driver.findElement(By.name("q")).sendKeys("Duckling Farm" + Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
