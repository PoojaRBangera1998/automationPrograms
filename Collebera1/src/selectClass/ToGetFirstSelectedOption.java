package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/LENOVO/Desktop/dropDown.html");

		WebElement fruitList = driver.findElement(By.id("m1"));
		Select fruitListDrop=new Select(fruitList);
		System.out.println(fruitListDrop.isMultiple());


		fruitListDrop.selectByValue("6");
		fruitListDrop.selectByValue("2");
		fruitListDrop.selectByValue("4");

		WebElement firstOption = fruitListDrop.getFirstSelectedOption();
		System.out.println(firstOption.getText());







	}


}
