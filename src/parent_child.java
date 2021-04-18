import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		
		//Writing an xpath to travel to a child
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Hi");
	}

}
