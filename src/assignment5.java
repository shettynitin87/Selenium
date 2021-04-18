import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//Navigate to the outer frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		
		//Navigate to the inner frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		//Grab the required text
		System.out.println(driver.findElement(By.id("content")).getText());

		driver.switchTo().defaultContent();
	}

}
