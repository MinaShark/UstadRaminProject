package shokerian;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.support.FindAll;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		// locators are the ways to locate the elements in web application
		// locatores interacts with HTML codes
		// 
		
		// we have 8 locators in selenium
		// Id:if you use id it shoud be uniqe. 
		
		
		//name: it is usually for input field. you can input valuee
		
		//classname: sometimes have nunque name for each element sometimes it shares
		
		//linktext: is for element with tag a (HREF)
		
	//	partiallinktext, 
		
		
		//xpaths: the path to the element
		
		
		//tagname: every element has tag and you can click on the arrow to open and close and in between are other elemnets
		
		
		//css 
		
		// there are two typs of xpaths
		// relatives and absolute
		
		
		// HTML: every element start an open and they might have childeren
		
		
		
          WebDriverManager.chromedriver().setup();
		
		// create or instantiat the object of chrome driver and it is static way
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");// navigate to this web 
		driver.manage().window().maximize();
		
	// log in to tek insurance web
		
		// find locator and create option using BY class
		
		// used css locator here
		
		By loginSectionTitle = By.cssSelector("div.login-section mat-card mat-card-title strong");
		
		// find element using driver and findelement method pass a locator
		WebElement loginSectionElement =driver.findElement(loginSectionTitle);
		
		//get text of element, using get text method
		
	String loginSecitonText= 	loginSectionElement.getText();
	
	if (loginSecitonText.equalsIgnoreCase("Customer Service Portal")) {
		System.out.println("longin Section is correct");
	}else {
		throw new RuntimeException("Wrong page");
	}
		
		
	
	// locate username element using name locator
	
	By usernameLocator = By.name("username");
	WebElement usernameElement = driver.findElement(usernameLocator);
	usernameElement.sendKeys("supervisor");
	
	
	By passowordLocator = By.name("password");
	WebElement passwordEelemtnElement= driver.findElement(passowordLocator);
	passwordEelemtnElement.sendKeys("tek_supervisor");
	
	
	By loginButtonLocator = By.id("loginButton");
    WebElement logingButtonElement =	driver.findElement(loginButtonLocator);
    logingButtonElement.click();
    
    Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	

		
	}

}
