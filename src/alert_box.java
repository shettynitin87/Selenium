import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_box {

	public static void main(String[] args) throws InterruptedException {
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Enter Text
		String requiredText = "Nitin";
		
		driver.findElement(By.id("name")).sendKeys(requiredText);
		
		//Click on alert button
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);
			
		//Grab alert text and Press ok button on the alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("name")).sendKeys(requiredText);
		
		//Click on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(2000);
			
		//Grab alert text and Press cancel button on the alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
