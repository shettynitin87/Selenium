import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ui_validation {

	public static void main(String[] args) throws InterruptedException {
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		//Click on RoundTrip Radio Button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		//Clicking on the from drop down box
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		//Select Mumbai as from City
		driver.findElement(By.xpath("//a[contains(text(),'Mumbai (BOM)')]")).click();
		
		Thread.sleep(2000);
		
		//Select Pune as to City
		driver.findElement(By.xpath("(//a[contains(text(),'Pune (PNQ)')])[2]")).click();
		
		//Check if the calendar selection for return date has been activated
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
