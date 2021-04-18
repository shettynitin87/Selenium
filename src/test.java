import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//Fetching the title of the page
		//System.out.println(driver.getTitle());
		
		//Verify if the page has landed on a correct or specified URL
		//System.out.println(driver.getCurrentUrl());
		
		//To get the source of the page
		//System.out.println(driver.getPageSource());
		
		
		//Navigating to other URL
		driver.get("http://google.com");
		
		//Navigate back to the previous URL
		driver.navigate().back();
		
		//To close the browser after usage
		driver.close();
	}

}
