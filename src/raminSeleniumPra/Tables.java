package raminSeleniumPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		List<WebElement> country = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[3]"));
		for (int i = 0; i< country.size(); i++) {
			if (country.get(i).getText().equals("Canada")) {
				
			}else {
			System.out.println(country.get(i).getText());
			
		}
			
		}
	
	}
} 

