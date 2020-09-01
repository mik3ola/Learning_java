package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	
	public static void scrnshot(WebDriver testDriver, String imgName) {
		
		TakesScreenshot ak = (TakesScreenshot)testDriver;
		File imgFile = ak.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imgFile, new File("./screenshots/"+imgName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
