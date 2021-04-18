import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotCh14 {

	public static void main(String[] args) throws IOException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");
		
		//Take Screen Shot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://ScreenShot.png"));

	}

}
