package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserNavigation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maxfashion.in/");
		driver.get("https://www.purplle.com/");
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
}
