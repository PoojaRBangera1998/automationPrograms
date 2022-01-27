package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://licindia.in/Home/Policy-Loan-Options#");
		
		driver.findElement(By.linkText("Pay Direct (Without login)")).click();
		
		Alert ConfirmationAlert = driver.switchTo().alert();
		ConfirmationAlert.accept();// it is used to click on ok button
		//ConfirmationAlert.dismiss();// it is used to click on cancel button
		
	
	}

}
