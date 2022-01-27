package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectByIndexByVisibleTextByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
	
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		
		Select selectdayDropDown=new Select(dayDropDown);
		System.out.println(selectdayDropDown.isMultiple());
		selectdayDropDown.selectByIndex(3);
		
		Select selectmonthDropDown=new Select(monthDropDown);
		System.out.println(selectmonthDropDown.isMultiple());
		selectmonthDropDown.selectByValue("2");
		
		
		Select selectyearDropDown=new Select(yearDropDown);
		System.out.println(selectyearDropDown.isMultiple());
		selectyearDropDown.selectByVisibleText("1998");
		
	
		
	}

}
