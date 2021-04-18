import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmentNumber3 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		//Click on required link
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		//Introducing explicit wait condition
		WebDriverWait waitForTheInfoText = new WebDriverWait(driver, 5);
		
		waitForTheInfoText.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='results']")));
		
		//Display that text in the console
		System.out.println(driver.findElement(By.cssSelector("div[id='results']")).getText());

	}

}
