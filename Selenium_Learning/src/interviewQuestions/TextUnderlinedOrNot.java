package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca");
		
		WebElement french = driver.findElement(
				By.xpath("//a[contains(text(),'Français')]"));
		// xpath //a[contains(text(),'Français')]
		
		String beforeHovering =  french.getCssValue("text-decoration");
		System.out.println("Before Hovering :" + beforeHovering);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(french);
		actions.build().perform();
		
		String afterHovering =  french.getCssValue("text-decoration");
		System.out.println("After Hovering :" + afterHovering);
		
	}

}
