import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class multipleLinkResponseSoftAssertCh14 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert stAssert = new SoftAssert();
		
		//Fetch all the required URLs
		List<WebElement> requiredList = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement webEl:requiredList)
		{
			String reqURL = webEl.getAttribute("href");
			HttpURLConnection urlConn = (HttpURLConnection)new URL(reqURL).openConnection();
			urlConn.setRequestMethod("HEAD");
			urlConn.connect();
			
			int returnCode = urlConn.getResponseCode();
			
			stAssert.assertTrue(returnCode<400, "The return code for "+ webEl.getText()+" is "+ returnCode);
		}
		stAssert.assertAll();
		

	}

}
