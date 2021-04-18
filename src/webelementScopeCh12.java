import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementScopeCh12 {

	public static void main(String[] args) throws InterruptedException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Print the total number of links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Print the total number of links in the footer
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Grab the list from the first column of footer
		WebElement footerColumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerColumnDriver.findElements(By.tagName("a")).size());
		
		//Click each URL present inside column driver
		for(int count=1; count<footerColumnDriver.findElements(By.tagName("a")).size();count++)
		{
			String keyEvents = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColumnDriver.findElements(By.tagName("a")).get(count).sendKeys(keyEvents);
			Thread.sleep(5000);
		}
		
		//Grab the Name of the newly opened windows
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		

	}

}
