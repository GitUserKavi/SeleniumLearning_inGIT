package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups_InSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		/*
		 * How to solve: 
		 * 1. Use a third party tool like Sikuli, AutoIt 
		 * 2. http://username:password@url.com //Sending credentials via URL
		 *  driver.get("http://the-internet.herokuapp.com/basic_auth"); 
		 *  username: admin, password: admin
		 */		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
