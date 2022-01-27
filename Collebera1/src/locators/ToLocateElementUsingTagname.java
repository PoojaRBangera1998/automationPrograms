package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementUsingTagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		Thread.sleep(2000);
		driver.findElement(By.className("textField")).sendKeys("Gajjjj"); //classname
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();						//tagname Locator
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();  //linkText Locator
		
		

	}

}
