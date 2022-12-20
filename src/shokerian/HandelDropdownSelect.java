package shokerian;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelDropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		

		// dropdown: we can
		
		
		  WebDriverManager.chromedriver().setup();
			
		// create or instantiat the object of chrome driver and it is static way
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");// navigate to this web 
		driver.manage().window().maximize();
		
		
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		By dropdownLocator = By.id("languageSelect");
		
		WebElement dropdownElement = driver.findElement(dropdownLocator);
		
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(1);
		
		dropdown.selectByValue("English");
		
		dropdown.selectByVisibleText("Persian");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	//	FluentWait<WebDriver> wait  = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5));
		
	//	WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
	}

}
