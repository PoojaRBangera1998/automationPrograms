package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.purplle.com/");
		
		Point point = driver.manage().window().getPosition();
		System.out.println(point.getX());
		System.out.println(point.getY());
	

	}

}
