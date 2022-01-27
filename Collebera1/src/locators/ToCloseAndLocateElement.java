package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAndLocateElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");

		String parentId = driver.getWindowHandle();
		Set<String> allIdOfwindows = driver.getWindowHandles();
		allIdOfwindows.remove(parentId);

		for(String windowId:allIdOfwindows) {
			driver.switchTo().window(windowId);
			driver.close();
		}
		driver.switchTo().window(parentId);
		WebElement textfield = driver.findElement(By.id("qsb-keyword-sugg"));
		textfield.sendKeys("Information Science");
		
	}


}
