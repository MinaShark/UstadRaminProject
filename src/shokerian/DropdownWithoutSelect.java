package shokerian;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		
		// create or instantiat the object of chrome driver and it is static way
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");// navigate to this web 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		By usernameLocator = By.name("username");
		WebElement usernameElement = driver.findElement(usernameLocator);
		usernameElement.sendKeys("supervisor");
		
		
		By passowordLocator = By.name("password");
		WebElement passwordEelemtnElement= driver.findElement(passowordLocator);
		passwordEelemtnElement.sendKeys("tek_supervisor");
		
		
		By loginButtonLocator = By.id("loginButton");
	    WebElement logingButtonElement =	driver.findElement(loginButtonLocator);
	    logingButtonElement.click();
	    
	    Thread.sleep(5000);
	    
		
	}

}
