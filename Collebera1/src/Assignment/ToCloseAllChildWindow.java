package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		
		allWindowId.remove(parentWindowId);
		
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			driver.close();
		}
	}
}