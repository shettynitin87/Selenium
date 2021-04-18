import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class pagescrollingCH13 {

	public static void main(String[] args) throws InterruptedException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//Grab values from a table's column and sum them up
		List<WebElement> gridValues = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		for(int i=0; i<gridValues.size();i++)
		{
			sum+=Integer.parseInt(gridValues.get(i).getText());
		}
		
		int totalValue = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, totalValue);

	}

}
