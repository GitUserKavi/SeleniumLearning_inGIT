package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample_Part16 {
	static WebElement q, btnK;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.ca");
		driver.manage().window().maximize();

		/*
		 * //Case 1 : Using switchTo().activeElement()
		 * driver.switchTo().activeElement().sendKeys("Erode \n");
		 */


		//case 2 : using; WebElement q 
		//PageFactory.initElements(driver,ActiveElementExample_Part16.class); 
		//q.sendKeys("Erode \n");

		PageFactory.initElements(driver, ActiveElementExample_Part16.class);
		Thread.sleep(1000);
		q.sendKeys("Life");
		q.sendKeys(" ");
		Thread.sleep(1000);
		q.sendKeys("of");
		Thread.sleep(1000);
		q.sendKeys(" ");
		q.sendKeys("pi");
	
		Thread.sleep(3000);
		btnK.click();
		Thread.sleep(3000);
		
		


	}

}
