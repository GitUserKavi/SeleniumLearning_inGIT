package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestionLists {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Note: As I have set the path for chrome driver already. So there is no need
		 * of System.setProperty()
		 */
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of Thrones");
		Thread.sleep(5000);
		List<WebElement> searchSuggestions = driver
				.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));

		// Case 1 :print all the suggestions for "Game of Thrones"
		
		 for (WebElement webElement : searchSuggestions) {
			 System.out.println(webElement.getText() + "\n");
		 }
		// Case 2 : click 3rd suggestion 
		/*
		 * int position = 0; //click 3rd suggestion for
		 * (WebElement webElement : searchSuggestions) {
		 * System.out.println(webElement.getText() + "\n"); // position++; //b++, b=b+1
		 * 
		 * 
		 * if(position==3) { webElement.click(); break; }
		 * 
		 * 
		 * }
		 */

		// Case 3:  Without using position, click on cast keyword word

		/*for (WebElement webElement : searchSuggestions) {
			String text = webElement.getText();
			System.out.println(text);
			if(text.contains("cast")) {
				webElement.click();
				break;
			}
		}
*/
	
		 
	}
}

