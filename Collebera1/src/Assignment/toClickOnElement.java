package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toClickOnElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/brand/m-a-c");
		
		
		driver.findElement(By.xpath("//img[@title='M.A.C Shreya Jain Festive Kit - Get Lippy with Verve, Twig & Chilli - 44% Savings']")).click();


	}

}
