package TakesScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		

		driver.get("https://hudabeauty.com/");
		File tempFile = driver.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		System.out.println(tempFile);
		
		
	}

}
