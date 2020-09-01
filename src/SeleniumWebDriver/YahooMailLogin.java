package SeleniumWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooMailLogin {

	@Test
	public void newTest() throws Exception{
		// Lunch google chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MIK3\\eclipse-workspace\\SELENIUM\\chromedriver.exe");
		
		// Create an instance of the browser
		WebDriver testDriver = new ChromeDriver();
		
		
		// Type destination URL
		
		testDriver.get("http://www.yahoomail.com");
		//Enter email address or username, click next
		testDriver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("matkin97");
		testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		testDriver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
		
		//Enter password click sign in.
		
		testDriver.findElement(By.xpath("//input[@id=\"login-passwd\"]")).sendKeys("beauty123");
		
		// introduce a wait period
		//testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Click sign in.
		//testDriver.findElement(By.id("idChkBx_PWD_KMSI0Pwd")).click();  //check checkbox
		testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click(); //login
		
		// Close X readables
		testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		//testDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/input[19]")).click();
		
		// SCREENSHOT
		// IMPLEMENT TakeScreenShotAs interface
		// Need JAVA files and JAVA Utils - need to download APACHE COMONS IO software
		// NB Interfaces can not have instances like classes
		testDriver.manage().timeouts().implicitlyWait(1500, TimeUnit.MICROSECONDS);
		
		TakesScreenshot ak = (TakesScreenshot)testDriver;
		File imgFile = ak.getScreenshotAs(OutputType.FILE);
		
		// Download Apache IO software
		// Extract and place in working folder. Add to project via Build paths and under Classes
		FileUtils.copyFile(imgFile, new File("./screenshots/VerifyImg3.png"));
		
		
		// VERIFY LOGIN NAME AND CLOSE
		String UsernameVerify = testDriver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div/div[3]/div[1]/div/label/span")).getText();
		System.out.println(UsernameVerify);
		testDriver.close();
		
				
		if (UsernameVerify.equals("michael")) 
		{
		System.out.println(UsernameVerify+" logged in successfully");
		} 
		else {
			System.out.println("failed");
		}
		
		System.out.println(UsernameVerify.contains("michael"));
		
		
		
		
		
		
		
		
		
		
		
		// compose message
		/*testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testDriver.findElement(By.id("id__3")).click();
		testDriver.findElement(By.id("app")).sendKeys("michael.akinola@icloud.com");
		*/
		// SIGN OUT
		//testDriver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div/div[3]/div[1]/div/label/span")).click();
	}
	

}
