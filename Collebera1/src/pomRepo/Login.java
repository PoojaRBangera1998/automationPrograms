package pomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataDriven.ExcelLib;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		//test Data
		String testurl=ExcelLib.readStringData("Sheet5",0, 0);
		String username=ExcelLib.readStringData("Sheet5", 0, 1);
		String password=ExcelLib.readStringData("Sheet5", 0, 2);
		String expectedLoginPageTitle=ExcelLib.readStringData("Sheet5",1,0);
		String expectedHomePageTitle=ExcelLib.readStringData("Sheet5", 1,1);


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized  Successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(testurl);
		String actualLoginPageTitleString=driver.getTitle();
		if(actualLoginPageTitleString.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page is displayed successfully");
		}
		else {
			System.out.println("Login Page is not displayed successfully");
		}
		
		
		LoginPage loginPage=new LoginPage(driver);

		//		loginPage.getUsernameTextField().sendKeys("admin");
		//		loginPage.getPasswordTextField().sendKeys("manager");
		//		loginPage.getLoginButton().click();

		
		
		
		loginPage.getUsernameTextField().sendKeys(username);
		loginPage.getPasswordTextField().sendKeys(password);
		//loginPage.getLoginButton().click();
		  loginPage.getLoginButton().click();
		  Thread.sleep(2000);
		 String actualHomePageTitle=driver.getTitle();
		 if(actualHomePageTitle.equals(expectedHomePageTitle)) {
				System.out.println("HomePage is displayed successfully");
			}

		
	}

}
