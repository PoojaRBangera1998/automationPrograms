package TakesScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenShortOfWebPageUsingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.javatpoint.com/");
		File tempFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);

		File destFile=new File("./errorshots/Screenshot1.png");
		tempFile.renameTo(destFile);
	}

}
