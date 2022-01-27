package TakesScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetScreenShortOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.javatpoint.com/");
		
		File WebElementScreen = driver.findElement(By.xpath("(//button[@class='gsc-search-button gsc-search-button-v2'])[1]")).getScreenshotAs(OutputType.FILE);
		
		File WebDestFile=new File("./errorshots/WebElementScreenshot.png");
		WebElementScreen.renameTo(WebDestFile);		
	}

}
