package testobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	WebDriver driver;
	public CreateAccount(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create an Account")
	WebElement createAccount;
	
	@FindBy(id="user_name")
	WebElement userName;
	
	@FindBy(id="user_email")
	WebElement userEMail;
	
	
	public WebElement CreateAnAccount()
	{
		return createAccount;
	}
	
	public WebElement UserName()
	{
		return userName;
	}
	
	public WebElement UserEmail()
	{
		return userEMail;
	}

}
