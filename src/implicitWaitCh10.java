import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitCh10 {

	public static void main(String[] args) {
		// Creating driver object for the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// List of vegetables
		String[] veggiesList = { "Beans", "Carrot", "Apple", "Onion", "Potato" };

		// Converting Array to List of Array
		List<String> itemsList = Arrays.asList(veggiesList);

		// Calling addItems function
		addItems(driver, itemsList);

		
		//Click on cart button
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		//Click on proceed to checkout
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//Enter the promo code
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		//Click on apply
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Grab the promo successfully applied text
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}

	public static void addItems(WebDriver driver, List<String> itemsList) {
		// Count for number of items to exit the loop
		int countOfItems = 0;

		// Fetching all the products
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// Iterating through the product list
		for (int count = 0; count < products.size(); count++) {
			// Fetching the product name and formating
			String[] productName = products.get(count).getText().split(" ");

			if (itemsList.contains(productName[0])) {
				countOfItems++;

				// Add To Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(count).click();

				if (countOfItems == itemsList.size()) {
					break;
				}
			}
		}
	}

}
