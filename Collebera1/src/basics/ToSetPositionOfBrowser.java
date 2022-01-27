package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.purplle.com/");		//to(String url) work same as get()
		Thread.sleep(3000);
		driver.get("https://www.wonderla.com/");
		
		driver.navigate().back();       						//back()
		Thread.sleep(3000);
		
		driver.navigate().forward();							//forward()
		Thread.sleep(3000);
		
		driver.navigate().refresh();							//forward()
	
		
		

	}

}
