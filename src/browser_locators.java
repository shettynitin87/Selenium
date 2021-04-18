import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//Searching for email ID box and entering the email ID
		driver.findElement(By.id("email")).sendKeys("shettynitin87@gmail.com");
		
		//Searching for Password box and entering the password
		driver.findElement(By.name("pass")).sendKeys("rocker123$");
		
		//Click on login button
		driver.findElement(By.name("login")).click();
		
	}

}
