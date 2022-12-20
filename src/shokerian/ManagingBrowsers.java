package shokerian;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

public class ManagingBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// cross browsing. managing.browser
		
		
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("Enter browser type c for chrome, e for edge");
		
		String browser= scanner.next();
		
		scanner.close();
		
		WebDriver driver;
		
		if (browser.equalsIgnoreCase("c")){
			
		}else if (browser.equalsIgnoreCase("e")) {
			driver = new EdgeDriver();
		}else {
			throw new RuntimeException("Not a valid browser type.");
			
			Thread.sleep(1000);e
			
			// maximizing windows afeter navitating
			
			driver() .manage()).window().maximize();
		}
		
		
		
		
		
	}

	private static Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
