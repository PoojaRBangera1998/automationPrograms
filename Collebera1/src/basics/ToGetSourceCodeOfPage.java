package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSourceCodeOfPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.purplle.com/");
		String value = driver.getPageSource();
		System.out.println(value);

	}

}
