import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkresponseCh14 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Search for Appium Link
		String appURL = driver.findElement(By.cssSelector("a[href*='appium']")).getAttribute("href");
		
		HttpURLConnection urlConn = (HttpURLConnection)new URL(appURL).openConnection();
		urlConn.setRequestMethod("HEAD");
		urlConn.connect();
		
		int returnCode = urlConn.getResponseCode();
		
		System.out.println("The Return Code: "+ returnCode);

	}

}
