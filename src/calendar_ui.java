import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar_ui {

	public static void main(String[] args) throws InterruptedException {
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		//Clicking on the from drop down box
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		//Select Mumbai as from City
		driver.findElement(By.xpath("//a[contains(text(),'Mumbai (BOM)')]")).click();
		
		Thread.sleep(2000);
		
		//Select Pune as to City
		driver.findElement(By.xpath("(//a[contains(text(),'Pune (PNQ)')])[2]")).click();
		
		Thread.sleep(2000);
		
		//Select the current date in the calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
