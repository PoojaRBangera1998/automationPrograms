package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementUsingIDLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Pooja R Bangera");
		Thread.sleep(2000);
		
		
		 WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("amitharaghu990");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
	}

}
