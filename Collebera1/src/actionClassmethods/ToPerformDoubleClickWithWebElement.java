package actionClassmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformDoubleClickWithWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");



		WebElement plusIcon = driver.findElement(By.id("add"));

		Actions action=new Actions(driver);
		action.doubleClick(plusIcon).perform();//this is for just showing that we can perform double Click by passing an webelement
		action.moveToElement(plusIcon).doubleClick().perform();//this is for just showing that we can perform double Click without passing any webelement

	}

}
