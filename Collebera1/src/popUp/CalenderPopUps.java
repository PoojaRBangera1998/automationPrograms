package popUp;

import java.time.LocalDateTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUps {

	public static void main(String[] args) throws InterruptedException {
		//TODO Auto-generated method stub
		//		LocalDateTime ltd=LocalDateTime.now();
		//		System.out.println(ltd.getMonth().name());
		//		System.out.println(ltd.getDayOfMonth());
		//		System.out.println(ltd.getYear());


		//To get Current date in CheckIn text box
		//		LocalDateTime ltd=LocalDateTime.now();
		//		String month = ltd.getMonth().name();
		//		month=month.substring(0, 1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		//		System.out.println(month);
		//		int date = ltd.getDayOfMonth();
		//		int year = ltd.getYear();


		//LocalDateTime ltd=LocalDateTime.now().plusMonths(2); 
		LocalDateTime ltd=LocalDateTime.now().plusDays(6);
		String month = ltd.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		System.out.println(month);
		int date = ltd.getDayOfMonth();
		int year = ltd.getYear();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.agoda.com/en-in/region/oyo-state-ng.html?site_id=1891440&tag=efcf8aea-bf23-42bd-a1a6-8ca4b3f922d7");
		driver.findElement(By.xpath("//div[@data-element-name='check-in-box']")).click();
		Thread.sleep(2000);


		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");


		//driver.findElement(By.xpath("//div[text()='March 2022']/../..//span[text()='19']")).click();


		// Directly to go to current date month year of system date
		//driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//span[text()='"+date+"']")).click();  


		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//span[text()='"+date+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}

}
