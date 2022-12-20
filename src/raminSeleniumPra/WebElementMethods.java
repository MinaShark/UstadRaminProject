package raminSeleniumPra;

import java.awt.Rectangle;
import java.util.concurrent.TimeUnit;

import org.checkerframework.framework.qual.TargetLocations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.facebook.com/ ");
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	WebElement element1 = driver.findElement(By.name("longin"));
		
	//System.out.println(element1.getAttribute("name"));
	
	WebElement element2 = driver.findElement(By.linkText(" Creat new account "));
	//System.out.println(element2.getAttribute("role"));
	
	
	// get css selector will get us the css value of that element.
	
	//System.out.println(element2.getCssValue("background-color"));
	
	System.out.println(element2.getCssValue("width"));
	
	System.out.println(element2.getLocation());
	
	
	// rectangle
	
	Rectangle rect = element2.getRect();
	System.out.println(rect.height);
	System.out.println(rect.getWidth());
	System.out.println(rect.getCenterX());
	System.out.println(rect.getY());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
