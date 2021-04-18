import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		
		//Click on click here text
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		//Grab all the windows
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		String parentID = itr.next();
		String childID  = itr.next();
		
		//Switch to child window and print the required text
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		//Switch to parent window and print the required text
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());		

	}

}
