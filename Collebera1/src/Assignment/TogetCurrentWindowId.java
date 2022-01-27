package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TogetCurrentWindowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);

	}

}
