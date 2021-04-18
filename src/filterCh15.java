import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterCh15 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Enter required text in the search box
		driver.findElement(By.id("search-field")).sendKeys("mango");
		
		//Grab the required list of WebElements
		List<WebElement> requiredWebElements = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Filter through the available list
		List<WebElement> filteredList = requiredWebElements.stream().filter(s->s.getText().contains("Mango")).collect(Collectors.toList());
		
		//Compare if the expected and retrieved results are correct
		Assert.assertEquals(requiredWebElements.size(),filteredList.size());

	}

}
