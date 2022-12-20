package testleafgrand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		// checks for the latest version of the specified Webdriver binary
		
		WebDriver driver = new ChromeDriver();
		
		// we use upcasting to use so we can run the scrpts in any browser
		
		
		driver.get("https://leafground.com/");
		
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
	//	driver.close();
		driver.findElement(By.xpath("//img[@src=\"images/chebox.png\"]")).click();
		
	}

}
