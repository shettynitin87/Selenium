import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assert_types {

	public static void main(String[] args) throws InterruptedException {
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Check the status of the checkbox and mark it accordingly
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		
		//Click on that checkbox
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		
		
		//Click Respective drop down
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		Thread.sleep(3000);
		
		//Click on add adults button to add 6 adults
		for(int count=1; count<=5; count++)
		{
			Thread.sleep(1000);
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		//Click On Done Button once done
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Validate the text after adding adults
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
	}

}
