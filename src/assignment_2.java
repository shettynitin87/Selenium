import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		// Click and Select number of adults
		WebElement adultDropdown = driver.findElement(By.id("Adults"));

		Select adultDropdownOption = new Select(adultDropdown);

		adultDropdownOption.selectByIndex(3);

		Thread.sleep(2000);

		// Click and Select number of adults
		WebElement childrenDropdown = driver.findElement(By.id("Childrens"));

		Select childrenDropdownOption = new Select(childrenDropdown);

		childrenDropdownOption.selectByIndex(2);

		Thread.sleep(2000);

		// Click on more options link
		driver.findElement(By.id("MoreOptionsLink")).click();

		// Enter text inside preffered airline box
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("xxx");

		// Click on Search flights button
		Thread.sleep(2000);
		driver.findElement(By.id("SearchBtn")).click();

		// Grab the error text and print
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
