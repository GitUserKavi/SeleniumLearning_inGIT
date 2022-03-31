package interviewQuestions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MaximizeWindow_usingireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Drivers\\FireFox\\geckodriver.exe");
		 */
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.addArguments("--start-maximized");
		 * 
		 * WebDriver driver = new ChromeDriver(chromeOptions);
		 */
		
		  FirefoxOptions firefoxOptions = new FirefoxOptions();
		  firefoxOptions.addArguments("--start-maximized");
		  
		  WebDriver driver = new FirefoxDriver(firefoxOptions);
	

		driver.get("http://www.google.ca");

		


	}	

}
