package raminSeleniumPra;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/index.php?route=account/register");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement chechBox = driver.findElement(By.xpath("//input[@type= 'checkbox']"));
	
		
		//System.out.println(chechBox.isDisplayed());
	//System.out.println(chechBox.isEnabled());
		//System.out.println(chechBox.isSelected());
		
		boolean isdisplayed = chechBox.isDisplayed();
		boolean isenable = chechBox.isEnabled();
		boolean isselected = chechBox.isSelected();
		
		if (isdisplayed== true && isenable == true && isselected!=true) {
			chechBox.click();
			
		}else {
			System.out.println(" The status of check box does not return desired condition ");
		}
		
		
		
		
		Thread.sleep(3000);
		
		
	}

}
