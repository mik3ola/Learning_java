package jUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OpenYoutube {
WebDriver testDriver;
	
	@Test
	public void youTube() {
			
			testDriver = library.Browsers.chooseBrowser("firefox");
			// Navigate to /Youtube Sports testers
			testDriver.get("https://www.youtube.com");
			library.ScreenShots.scrnshot(testDriver, "newpage");
			testDriver.close();
			  
			
			}
	}

