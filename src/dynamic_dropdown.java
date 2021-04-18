import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Clicking on the from drop down box
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		//Select Mumbai as from City
		driver.findElement(By.xpath("//a[contains(text(),'Mumbai (BOM)')]")).click();
		
		Thread.sleep(2000);
		
		//Select Pune as to City
		//driver.findElement(By.xpath("(//a[contains(text(),'Pune (PNQ)')])[2]")).click();
		
		//Traversing to Pune City option through Parent Child relationship instead of using index
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Pune (PNQ)')]")).click();
	}

}
