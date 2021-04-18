import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// 1. Check on Option-2 of checkbox and grab the text
		WebElement checkBox = driver.findElement(By.cssSelector("[id=checkBoxOption2]"));
		checkBox.click();
		Thread.sleep(1000);
		String checkBoxText = null;
		if (checkBox.isSelected()) {
			checkBoxText = checkBox.getAttribute("value");
		}

		// 2. Select the same option from Drop-Down
		// Get the respective webelement
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));

		// Select required option from static dropdown
		Select dropdown = new Select(staticDropdown);

		dropdown.selectByValue(checkBoxText);
		Thread.sleep(1000);
		String dropDownText = dropdown.getFirstSelectedOption().getText();

		// 3. Copy the text from drop down box and enter in the text box and press the
		// alert button
		driver.findElement(By.cssSelector("[id=name]")).sendKeys(dropDownText);
		driver.findElement(By.cssSelector("[id=alertbtn]")).click();

		// 4.Grab the text from the alert
		String alertText = ((driver.switchTo().alert().getText().split(","))[0].split(" "))[1];
		System.out.println("Requied Text=" + alertText);
	}

}
