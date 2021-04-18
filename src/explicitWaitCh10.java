import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitCh10 {

	public static void main(String[] args) throws InterruptedException {
		// Creating driver object for the Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);

		// List of vegetables
		String[] veggiesList = { "Beans", "Carrot", "Apple", "Onion", "Potato" };

		// Converting Array to List of Array
		List<String> itemsList = Arrays.asList(veggiesList);

		// Calling addItems function
		addItems(driver, itemsList);

		
		Thread.sleep(2000);
		// Click on cart button
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		// Click on proceed to checkout
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		Thread.sleep(2000);

		// Enter the promo code
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		// Click on apply
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		// Grab the promo successfully applied text using explicit wait
		WebDriverWait waitForPromoInfo = new WebDriverWait(driver, 5);
		waitForPromoInfo.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
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
