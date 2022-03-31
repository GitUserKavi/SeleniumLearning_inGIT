package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResualtsLinks_Part14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.ca");
		driver.manage().window().maximize();
		WebElement searchBox =  driver.findElement(By.name("q"));
		//Search Term "12 Angry men \n"
		searchBox.sendKeys("12 Angry men \n");
		
		Thread.sleep(3000);
		
/*		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
		 //Case 1 : This will print all the URL in the page 
		
		for (WebElement links :
		 totalLinks) { System.out.println(links.getAttribute("href")); }
		  driver.manage().window().minimize();
		 
		*/
		
		
		// Case 2: It will print all h3(heading) listing ie Fetch main links only
		
		// xpath //*[@id ='search']//following::h3//following::cite
		
		List<WebElement> mainLinks = driver.findElements(By.xpath("//*[@id ='search']//following::h3//following::cite"));
		for (WebElement links : mainLinks) {
			System.out.println(links.getText());
			
		}
	}
}
