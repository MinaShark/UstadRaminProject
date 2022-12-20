package raminSeleniumPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdSession {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		// TODO Auto-generated method stub

		
		// we can use the webdriver interface refrence and create object of chrome driver class
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		// this methode will maximaize my window
		driver.manage().window().maximize();
		
		// this methode will use the timeout for pageload and should be first than implicit wait
	//	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		// the implicite wait is wating to load all the elements 
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		// we can use explicit and fluent wait for elements that takes time to load. 
		
		
		
		// practice of find elements here below. we have more elements 
		
	/// first we have to create list of elements to find those elements for example:
		
	List<WebElement> companyName = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//td[1]"));
		
		for (int i =0; i<companyName.size(); i++) {
			
		System.out.println(companyName.get(i).getText());
	}
		
		
		
			
			
		
	

		
	
	
	}
	
	
	
	
	
	
	
	
	
}
