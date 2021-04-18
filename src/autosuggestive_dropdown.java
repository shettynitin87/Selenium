import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Enter text into respective textbox
		driver.findElement(By.id("autosuggest")).sendKeys("can");
		
		Thread.sleep(3000);
		
		//Grab the list of autosuggested elements
		List<WebElement> required_list = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		//Iterating through the list
		for(WebElement requiredElement: required_list)
		{
			if(requiredElement.getText().equalsIgnoreCase("Canada"))
			{
				requiredElement.click();
				break;
			}
		}
	}

}
