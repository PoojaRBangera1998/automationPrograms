package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//li[@role=\"presentation\"]"));
		
		for(WebElement list:listOfSuggestions) {
			System.out.println(list.getText());
		}
	
		
		

	}

}
