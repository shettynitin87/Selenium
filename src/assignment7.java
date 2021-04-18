import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Total number of table rows and columns.
		WebElement table = driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		//Grab and display data from 2nd Row
		List<WebElement> secondRowElements = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		for(int i = 0; i < secondRowElements.size();i++)
		{
			System.out.println(secondRowElements.get(i).getText());
		}
		
	}
}
		
		