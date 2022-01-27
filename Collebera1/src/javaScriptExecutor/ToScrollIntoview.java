package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollIntoview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		WebElement elementScroll=driver.findElement(By.xpath("(//a[@class='view-all-comp'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",elementScroll);
		js.executeScript("arguments[0].scrollIntoView(false);",elementScroll);
	}

}







