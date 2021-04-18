import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Enter 3 Starting letters of the country
		driver.findElement(By.id("autocomplete")).sendKeys("can");

		Thread.sleep(2000);
		//2 times down key
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		//Print the value
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
