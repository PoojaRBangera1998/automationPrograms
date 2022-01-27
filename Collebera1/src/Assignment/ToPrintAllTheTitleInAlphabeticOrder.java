package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAllTheTitleInAlphabeticOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Set<String> allWindowId = driver.getWindowHandles();
		
			

			for(String id:allWindowId) {
				driver.switchTo().window(id);
				
				
		}

	}

}
