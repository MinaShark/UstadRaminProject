package raminSeleniumPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement months = driver.findElement(By.xpath("//select[@name='Month']"));
		Select select = new Select(months);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		select.selectByIndex(4);
		List<WebElement> month = select.getAllSelectedOptions();
		for(WebElement mnt: month) {
			System.out.println(mnt.getText());
		}
		
		
		// deselect
		
		select.deselectByIndex(3);
	}

}
