package actionClassmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("poojabangeraak@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Amitha990");
		driver.findElement(By.id("login-submit")).click();
	
		driver.findElement(By.xpath("//div[text()='MyBoard']")).click();
		Thread.sleep(3000);
		
		Actions actions=new Actions(driver);
		WebElement sdlcElement = driver.findElement(By.xpath("//span[text()='SDLC']"));
		actions.contextClick(sdlcElement).perform();
		List<WebElement> rightClickOptions = driver.findElements(By.xpath("//a[contains(@class,'quick-card-edito')]"));
		
		for(WebElement ele:rightClickOptions) {
			System.out.println(ele.getText());
			
		}
	}

}
