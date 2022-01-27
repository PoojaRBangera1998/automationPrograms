package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleUrlPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Url: "+driver.getCurrentUrl());
		
		System.out.println("Title: "+driver.getTitle());
		
		System.out.println("Source Code:  "+driver.getPageSource());
	}

}
