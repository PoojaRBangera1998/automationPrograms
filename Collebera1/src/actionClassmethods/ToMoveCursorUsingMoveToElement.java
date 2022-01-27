package actionClassmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveCursorUsingMoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		WebElement womenElement = driver.findElement(By.linkText("WOMEN"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(womenElement).perform();
		driver.findElement(By.linkText("Sweaters & Sweatshirts")).click();
	}

}
