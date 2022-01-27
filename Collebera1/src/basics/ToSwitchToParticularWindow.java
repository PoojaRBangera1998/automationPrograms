package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParticularWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Set<String> allWindowId = driver.getWindowHandles();
		String expectedTitle = "Tech Mahindra";
		
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedTitle.equals(actualWindowTitle)) {
				driver.manage().window().maximize();
				break;
			}
		}
	}

}
