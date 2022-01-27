package basics;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetHeightAndWidthOfTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");

		driver.manage().window().setSize(new Dimension(1213, 400));


	}

}
