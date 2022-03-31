package interviewQuestions;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample_Part16 {
	//static WebElement q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.ca");
		
		//Case 1 : Using switchTo().activeElement()
		driver.switchTo().activeElement().sendKeys("Erode \n");
		
		/*
		 * //case 2 : using; WebElement q PageFactory.initElements(driver,
		 * ActiveElementExample_Part16.class); q.sendKeys("Erode \n");
		 */
		
	}

}
