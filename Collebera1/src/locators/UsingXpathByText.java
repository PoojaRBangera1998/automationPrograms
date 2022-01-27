package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.purplle.com/brand/m-a-c");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='BRANDS ']")).click();
		
		
		driver.navigate().back();  
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='NEW ']")).click();
		
		
		
		

	}

}
