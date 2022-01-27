package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toGetLinkTextOfanElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://careers.foodpanda.com/");
		String Link= driver.findElement(By.linkText("Jobs")).getText();
		System.out.println("Link Text = " +Link);
	}

}
