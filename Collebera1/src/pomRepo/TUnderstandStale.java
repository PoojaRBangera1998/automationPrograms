package pomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TUnderstandStale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");


		//		WebElement usernametextfield = driver.findElement(By.id("username"));
		//		driver.navigate().refresh();
		//		usernametextfield.sendKeys("Pooja R Bangera");  //we get StaleElementReferenceException because of using refresh



		WebElement usernametextfield = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		driver.findElement(By.id("username")).sendKeys("Pooja R Bangera"); 
	}

}
