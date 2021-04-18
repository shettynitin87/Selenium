import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox_assignment {

	public static void main(String[] args) {
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Check the the checkbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		//Check if the checkbox has been ticked
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//UnCheck the the checkbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
				
		//Check if the checkbox has been unticked
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//Number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
}
