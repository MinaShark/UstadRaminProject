package seleniumPracticeWithMirwais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TekschoolWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// we use selenium 5 and that is why we use the below feature
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail/");
		
		driver.manage().window().maximize();
		
		WebElement searchSpace = driver.findElement(By.xpath("//input[@type='text']"));
		searchSpace.sendKeys("Desktops");
		Thread.sleep(2000);
		
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		searchButton.click();
		
		
		
		
		
	}

}
