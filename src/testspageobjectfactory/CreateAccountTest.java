package testspageobjectfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testobjects.CreateAccount;

public class CreateAccountTest {

	@Test
	public void CreateAccount() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sso.teachable.com/secure/9521/users/sign_up?flow_school_id=9521");
		
		CreateAccount createAccount = new CreateAccount(driver);
		
	
		createAccount.UserName().sendKeys("Nitin Shetty");
		createAccount.UserEmail().sendKeys("shettynitin87@gmail.com");
	}
}
