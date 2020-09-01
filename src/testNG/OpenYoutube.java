 package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OpenYoutube {
	
	@Test
	public void viewPage () {

			WebDriver testDriver;
			testDriver = library.Browsers.chooseBrowser("chrome");
			// Navigate to /Youtube Sports
			testDriver.get("https://www.youtube.com");
			library.ScreenShots.scrnshot(testDriver, "newpage");
			testDriver.close();
			  
			
			}
	
	

}
