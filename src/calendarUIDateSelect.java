import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarUIDateSelect {

	public static void main(String[] args) throws InterruptedException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(5000);
		
		//Click on the depart on calendar UI
		driver.findElement(By.cssSelector("[id='travel_date']")).click();
		
		Thread.sleep(1000);
		
		//Select the Required Month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		//Select the Reuired Date
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int count = dates.size();
		
		for(int i=0; i < count; i++)
		{
			String dayText = driver.findElements(By.className("day")).get(i).getText();
			if(dayText.equalsIgnoreCase("22"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
