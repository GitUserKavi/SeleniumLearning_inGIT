package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MaximizeWindow_usingEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.edge.driver",
		  "D:\\Drivers\\EdgeWin64\\msedgedriver.exe");
		  
		  
		  EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		  
		  WebDriver driver = new EdgeDriver(edgeOptions);
		  
		  
		 
	
		driver.get("http://www.google.ca");

	}

}
