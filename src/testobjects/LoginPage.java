package testobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_email")
	WebElement email;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(css="input[name='commit']")
	WebElement loginBtn;
	
	
	
	public WebElement EmailID()
	{
		return email;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement LoginBtn()
	{
		return loginBtn;
	}

}
