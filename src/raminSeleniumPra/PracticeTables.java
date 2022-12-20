package raminSeleniumPra;

import java.awt.ContainerOrderFocusTraversalPolicy;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		List<WebElement> contacts = driver.findElements(By.xpath("//table[@id = 'customers']//tbody/tr[2]//td[2]"));
		System.out.println(contacts.size());
		for(int i = 2; i< contacts.size(); i++) {
			WebElement namesElement = driver.findElement(By.xpath("//table[@id = 'customers']//tbody/tr["+i+"]//td[2]"));
			System.out.println(namesElement.getText());
			
			
			
			
			
			
			
		}
		
		
	}

}
