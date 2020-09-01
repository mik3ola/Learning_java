package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouTubeSports extends TesterProfile {
	
	public void testResult() {
		System.out.println("TESTER - "+ name);
		System.out.println("POSITION - "+ role);
		System.out.println("TEST OUTCOME - "+ status);
	}
	
	public static void main(String[] args) {
		
		// Set System properties
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MIK3\\eclipse-workspace\\SELENIUM\\geckodriver.exe");
		
		// Import selenium standalone server into project.
		// Create a chrome browser instance from the WebDriver Class
		// Hover mouse over Classes to import Webdriver and Chromedriver
		WebDriver myDriver = new FirefoxDriver(); 
		
		// Create a new object of the class YouTubeSports
		// using the attribute of the extended Class TestProfile, assign values to the variables
		YouTubeSports output = new YouTubeSports();
		output.name = "Michael";
		output.role = "Automation Tester";
		output.status = "Successful";
		
		// Navigate to /Youtube Sports
		String ABC = "http://www.youtube.com/";
		myDriver.get(ABC);
		
		myDriver.close();  
		
		output.testResult();
	}

}
