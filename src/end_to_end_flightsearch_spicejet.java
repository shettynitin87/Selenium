import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class end_to_end_flightsearch_spicejet {

	public static void main(String[] args) throws InterruptedException {
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		//Click on One Way Radio Button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//Click on senior citizen check box
		driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
		
		//Clicking on the from drop down box
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		//Select Mumbai as from City
		driver.findElement(By.xpath("//a[contains(text(),'Mumbai (BOM)')]")).click();
				
		Thread.sleep(2000);
				
		//Select Pune as to City
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Pune (PNQ)')]")).click();

		//Check if the calendar selection for return date has been deactivated
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//Select the current date on calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//Click Respective drop down
		/*driver.findElement(By.id("divpaxinfo")).click();
				
		Thread.sleep(3000);
		
		//Select 6 adults
		for(int count=1; count<=5; count++)
		{
			Thread.sleep(1000);
			driver.findElement(By.id("hrefIncAdt")).click();
		}*/
		
		
		//Click On Done Button once done
		//driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Click on Search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}
