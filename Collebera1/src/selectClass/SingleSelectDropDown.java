package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("file:///C:/Users/LENOVO/Desktop/dropDown.html");
		
		
		WebElement project = driver.findElement(By.id("s1"));
		Select projectselect=new Select(project);
		System.out.println(projectselect.isMultiple());
		
		WebElement fruit = driver.findElement(By.id("m1"));
		Select fruitselect=new Select(fruit);
		System.out.println(fruitselect.isMultiple());
		
		
	}

}
