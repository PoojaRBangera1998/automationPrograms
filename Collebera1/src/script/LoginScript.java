package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScript {

	public static void main(String[] args) {
		// Test Data
		String testUrl="https://www.instagram.com/";
		String username="_ms__bangera_";
		String password="banguanvith990";
		String expectedLoginPageTitle="Instagram";
		String expectedHomePageTitle="Login • Instagram";


		//Step1:OPen Browser To enter The URL
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized  Successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);
		driver.get(testUrl);
		String actualLoginPageTitleString=driver.getTitle();
		if(actualLoginPageTitleString.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page is displayed successfully");
		}
		else {
			System.out.println("Login Page is not displayed successfully");
		}

		
		//Step2:Enter Username into username textfield
		 WebElement usernameTextField = driver.findElement(By.xpath("//input[@name='username']"));
		 usernameTextField.clear();
		 usernameTextField.sendKeys(username);
		 String actualUsernameEntered=usernameTextField.getAttribute("value");
		 if(actualUsernameEntered.equals(username)) {
				System.out.println("Username is displayed successfully");
			}
			else {
				System.out.println("Username is not displayed successfully");
			}
		
		 
		//Step3:Enter Password into password textfield
		 WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='password']"));
		 passwordTextField.clear();
		 passwordTextField.sendKeys(password);
		 String actualPasswordEntered=passwordTextField.getAttribute("value");
		 if(actualPasswordEntered.equals(password)) {
				System.out.println("Password is displayed successfully");
			}
			else {
				System.out.println("Password is not displayed successfully");
			}

		 	
		 //Step4: Click On Login button
		 driver.findElement(By.xpath("//div[text()='Log In']")).click();
		 explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		 String actualHomePageTitle=driver.getTitle();
		 if(actualHomePageTitle.equals(expectedHomePageTitle)) {
				System.out.println("HomePage is displayed successfully");
			}
			else {
				System.out.println("HomePage is not displayed successfully");
			}

	}

}
