package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateCssSelector {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//here it will take more time to load name so we use thread.sleep
		 Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("PoojaRBangera");
	}
}
