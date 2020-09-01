package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	public static WebDriver chooseBrowser(String myBrowser) {
		//String myBrowser;
		
		if (myBrowser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MIK3\\eclipse-workspace\\SELENIUM\\chromedriver.exe");
			return new ChromeDriver();
		
		}else if (myBrowser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MIK3\\eclipse-workspace\\SELENIUM\\geckodriver.exe");
		return new FirefoxDriver();
		}
	else {System.setProperty("webdriver.chrome.driver", "C:\\Users\\MIK3\\eclipse-workspace\\SELENIUM\\chromedriver.exe");
		return new ChromeDriver();
	}
	}

}
