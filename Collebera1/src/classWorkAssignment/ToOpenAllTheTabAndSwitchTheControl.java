package classWorkAssignment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenAllTheTabAndSwitchTheControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");
		Actions actions=new Actions(driver);
		
		List<WebElement> navElement = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		
		for(WebElement ele:navElement) {
			actions.keyDown(Keys.CONTROL).click(ele).perform();
			actions.keyUp(Keys.CONTROL).perform();
			
		}
		String expectedTitle="Home and Living - Buy Interior Decoration Products and Accessories Online in India";

		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedTitle.equals(actualWindowTitle)) {
				driver.close();
				break;
			}
		}

	}

}
