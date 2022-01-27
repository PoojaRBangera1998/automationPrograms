package classWorkAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartToSwitchFromOnePageToAnotherAndSortUsingPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("poco",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();

		String parentWindowID = driver.getWindowHandle();
		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(parentWindowID);

		String expectedPageTitle="POCO C31 ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";

		for(String windowID:AllWindowId) {
			driver.switchTo().window(windowID);
			String actualPageTitle = driver.getTitle();
			if(actualPageTitle.equals(expectedPageTitle)) {
				System.out.println("driver switched the control to the correct page");
			}

		}

		String actualPrice = driver.findElement(By.xpath("(//div[text()='₹9,499'])[1]")).getText();
		System.out.println(actualPrice);
		int price=0;
		for(int i=0;i<actualPrice.length();i++) {
			if((actualPrice.charAt(i)>47) && (actualPrice.charAt(i)<58)) {
				price=price*10+(int)(actualPrice.charAt(i)-48);
			}
		}

		System.out.println(price);
		int expectedPrice=9000;
		if(price<=expectedPrice) {
			System.out.println("Product has been successfully added to cart");
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
}
	

