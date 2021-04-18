import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://yahoo.com");
		
		//Click on Sign In Button
		driver.findElement(By.xpath("//*[@id='header-signin-link']")).click();
		
		//Enter the email ID
		driver.findElement(By.xpath("//*[contains(@name,'user')]")).sendKeys("shetty_nitin87@yahoo.co.in");
		
		//Click on the next button
		driver.findElement(By.cssSelector("input[name*='sign']")).click();
	}

}
