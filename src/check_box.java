import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box {

	public static void main(String[] args) {
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Check the status of the checkbox and mark it accordingly
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		
		//Click on that checkbox
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		
		
		//Number of checkboxes in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
