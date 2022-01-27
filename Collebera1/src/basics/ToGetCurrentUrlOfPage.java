package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrlOfPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.purplle.com/");
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
