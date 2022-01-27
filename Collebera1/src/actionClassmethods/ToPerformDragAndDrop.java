package actionClassmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);

		driver.get("https://trello.com/login");

		driver.findElement(By.id("user")).sendKeys("poojabangeraak@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Amitha990");
		driver.findElement(By.id("login-submit")).click();

		driver.findElement(By.xpath("//div[text()='MyBoard']")).click();
		Thread.sleep(3000);




		//*******************************dragAndDrop(WebElement src, WebElement dest)***************************************
		//		Actions actions=new Actions(driver);
		//		WebElement srcElement = driver.findElement(By.xpath("//span[text()='STLC']"));
		//		WebElement dstElement = driver.findElement(By.xpath("//textarea[text()='Java']/../..//span[text()='OOPS']"));
		//		actions.dragAndDrop(srcElement, dstElement).perform();



		//*******************************dragAndDrop(WebElement src, int Xo,intYo)********************************************
		//		Actions actions=new Actions(driver);
		//		WebElement srcElement = driver.findElement(By.xpath("//span[text()='SDLC']"));
		//		WebElement dstElement = driver.findElement(By.xpath("//textarea[text()='Java']/../..//span[text()='STLC']"));
		//		actions.dragAndDropBy(srcElement, 400, 0).perform();


		//******clickAndHold and release without accepting arguments************//
		Actions actions=new Actions(driver);
		WebElement srcElement = driver.findElement(By.xpath("//h2[text()='Manual']/../..//span[text()='Agile']"));
		WebElement dstElement = driver.findElement(By.xpath("//h2[text()='Selenium']/../..//span[text()='TakeScreenshot']"));
		actions.clickAndHold(srcElement).moveByOffset(600, 300).perform();
		Thread.sleep(3000);
		actions.release().perform();// in release method we cannot pass the dstElement bcz clickandHold method will hold that particular webelement and release method wont have the access to release the webelement
	}

}
