package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAllTheTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Set<String> AllWindowId = driver.getWindowHandles();

		for(String id:AllWindowId) {
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
		}
		
		

	}

}
