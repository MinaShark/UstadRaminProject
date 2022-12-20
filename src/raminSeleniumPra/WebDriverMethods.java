package raminSeleniumPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.facebook.com/ ");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	// get current URL(); this method will get the url for th website that is launch by selenium
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
		
	//driver.close();
//	driver.quit();
	
	
	// driver.navigate to(another url) we can luanc second url after the first one
	driver.navigate().to("https://www.google.com/");
		
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
		
		// those are the methods that come from the webdriver
	
	}

}
