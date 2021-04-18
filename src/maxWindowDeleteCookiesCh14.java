import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxWindowDeleteCookiesCh14 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		//Maximise the window
		driver.manage().window().fullscreen();
		
		//Delete all cookies
		driver.manage().deleteAllCookies();

		driver.get("https://google.com/");

	}

}
