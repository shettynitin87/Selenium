import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//Enter email ID and Password using CSS Selector
		driver.findElement(By.cssSelector("#email")).sendKeys("shettynitin87@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("rocker123$");
		
		//Clicking login button using xpath
		//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		//Validate the text pertaining to incorrect credentials
		//System.out.println(driver.findElement(By.cssSelector("#loginform > div:nth-child(15) > div._9ay7")).getText());
		
		//Clicking login button using CSS
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
