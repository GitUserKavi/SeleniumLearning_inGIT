package interviewQuestions;

/*import org.openqa.selenium.Dimension;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 				
				"D:\\Drivers\\Chrome\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://www.google.ca");

		// Option : 1
		/*
		 * driver.manage().window().maximize();
		 */


		// Option : 2
		//Dimension
		/*
		 * Dimension dimension = new Dimension(1920, 1080);
		 * 
		 * driver.manage().window().setSize(dimension);
		 */


		//Option 3: 
		// so, this will come on top, 
		//while chrome driver lanching method

		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.addArguments("--start-maximized");
		 */



	}	

}
