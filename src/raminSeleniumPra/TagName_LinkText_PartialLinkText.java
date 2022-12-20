package raminSeleniumPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName_LinkText_PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// we are going to practice Tagname, LinkText and partialLinkText
		
//		WebElement element1 = driver.findElement(By.tagName("h2"));
	//	System.out.println(element1.getText());
		
	//	WebElement element2 = driver.findElement(By.tagName("button"));
	//element2.click();
		
	//WebElement element3 = driver.findElement(By.linkText(" Create new account"));
	// element3.click();
		
		
		
	//	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		//for (int i = 0; i<allLinks.size();i++) {
		//	System.out.println(allLinks.get(i).getText());
		//}
		
	//	WebElement element4 = driver.findElement(By.linkText("Forgot password?"));
	//	element4.click();
		
		// partial link text we dont have to provide the full link text
		// we should be able to interact with that element
		
		WebElement element5  =  driver.findElement(By.partialLinkText("Forgot"));
		element5.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
