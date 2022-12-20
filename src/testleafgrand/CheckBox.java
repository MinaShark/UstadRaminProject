package testleafgrand;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@src=\"images/chebox.png\"]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'])[1]"));
		driver.findElement(By.xpath("//input[@type='checkbox'])[3]"));
		driver.findElement(By.xpath("//input[@type='checkbox'])[5]"));
		WebElement isElementSelectedElement = driver.findElement(By.xpath("(//input[@type= \"checkbox\"])[6]"));
		
		boolean isCheckedBoxSelected = isElementSelectedElement.isSelected();
		if(isCheckedBoxSelected == true) {
			System.out.println("check box is selected - confiremd");
			
			
			
			WebElement selectedCheck1 = driver.findElement(By.xpath("//input[@type = 'checkbo'])[7]\");"));
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
