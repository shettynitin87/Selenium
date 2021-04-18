import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTableSortingCh15 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on the Vegetable header to sort
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Grab the list of WebElements from the first column
		List<WebElement> requiredWebElements = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Fetching the original list
		List<String> originalList = requiredWebElements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sorted List
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//Compare Both Lists
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> requiredPrice;
		
		//Pagination to find the price of Rice
		do
		{
			List<WebElement> requiredNewWebElements = driver.findElements(By.xpath("//tr/td[1]"));
			requiredPrice = requiredNewWebElements.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
			requiredPrice.forEach(s->System.out.println(s));
			
			if(requiredPrice.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		}while(requiredPrice.size()<1);
	}

	private static String getPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
