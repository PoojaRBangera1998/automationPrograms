package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocator {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.foodpanda.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("ORDER")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Malaysia")).click();
		
		Thread.sleep(3000);
		driver.get("https://www.bigcup.in/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shop")).click();
		
		
		
		
		
	}
}
