package javaScriptExecutor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();


		WebElement usernameTextField = driver.findElement(By.id("login1"));
		usernameTextField.sendKeys("poojarbangeraak@rediffmail.com");

		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("Amitha990_");

		driver.findElement(By.className("signinbtn")).click();

		driver.findElement(By.linkText("Write mail")).click();

		WebElement emailTextField =driver.findElement(By.id("TO_IDcmp2"));
		emailTextField.sendKeys("poojarbangeraak@rediffmail.com");
		Thread.sleep(2000);
		WebElement subTextField=driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']"));
		subTextField.sendKeys("Pooja R Bangera");



		Thread.sleep(2000);
		WebElement FrameElement= driver.findElement(By.xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])[1]"));
		driver.switchTo().frame(FrameElement);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Good Morning..!");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(2000);
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='Pooja R Bangera']/..//cite[@title='Select mail']")).click();
				driver.findElement(By.xpath("(//span[text()='Delete'])[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.navigate().refresh();
			}
		}
	}
}
