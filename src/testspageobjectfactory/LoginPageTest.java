package testspageobjectfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testobjects.LoginPage;

public class LoginPageTest {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.EmailID().sendKeys("shettynitin87@gmail.com");
		lp.Password().sendKeys("123456");
		lp.LoginBtn().click();
	}
}
