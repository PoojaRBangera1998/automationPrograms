package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TogetOptionsInDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/LENOVO/Desktop/dropDown.html");
		
		WebElement manualList = driver.findElement(By.id("s1"));
		Select manualListDrop=new Select(manualList);
		System.out.println(manualListDrop.isMultiple());
		
		List<WebElement> manualListOption = manualListDrop.getOptions();
		for(WebElement ele: manualListOption) {
			System.out.println(ele.getText());

		}
		
//---------------------Multi Select drop down----------------------------------------------------------		
		System.out.println("=========================================================");
		
		WebElement fruitList = driver.findElement(By.id("m1"));
		Select fruitListDrop=new Select(fruitList);
		System.out.println(fruitListDrop.isMultiple());
		
		List<WebElement> fruitListOption = fruitListDrop.getOptions();
		for(WebElement ele1: fruitListOption) {
			System.out.println(ele1.getText());

		}
		

	}

}
