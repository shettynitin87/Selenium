import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildWindowSwitchCh11 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//Click on the hyperlink to open a child window
		driver.findElement(By.className("blinkingText")).click();
		
		//Grab ID of all windows opened by Selenium
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		String parentWindowID = itr.next();
		String childWindowID = itr.next();
		
		driver.switchTo().window(childWindowID);
		
		//Grab the required text and then extract email ID from that
		String emailID = driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
		//Navigate back to the parent window
		driver.switchTo().window(parentWindowID);
		
		//Enter the required email ID
		driver.findElement(By.cssSelector("[id='username']")).sendKeys(emailID);
		
	}

}
