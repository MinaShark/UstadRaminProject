package raminSeleniumPra;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CotactXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		List<WebElement> allmonths = driver.findElements(By.xpath("//select[@id='month']//option"));
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < allmonths.size(); i++) {
			list.add(allmonths.get(i).getText());
			if(allmonths.get(i).getText().equals("Jan")) {
				System.out.println(list.get(i));
			}
			
			
		}
		
		System.out.println(list);
		
		
		
	}

}
