package jUnit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class YahooJunit {
	
	WebDriver testDriver;
	
	@Before
	public void openBrowser() {
		testDriver = library.Browsers.chooseBrowser("firefox");
	}
	
	
	@After
	public void closeBrowser() {
		testDriver.close();
	}
	
	
	
	@Test
	public void login()
	{

		
		//testDriver = library.Browsers.chooseBrowser("firefox");
		testDriver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-GB&.intl=uk&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Duk%26.lang%3Den-GB%26.partner%3Dnone%26.src%3Dfp");
		library.ScreenShots.scrnshot(testDriver, "LOG1");
		testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("mikel.law01");
		testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		testDriver.findElement(By.id("login-passwd")).sendKeys("beauty123");
		testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click(); //login
		library.ScreenShots.scrnshot(testDriver, "LOG2_INBOX");
		
		
		// Close X readables
		//testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
		testDriver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div[3]/div[1]/div/label/div/img")).click(); //CLICKS ACCOUNT NAME

		testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.MICROSECONDS);
		
		
		// VERIFY LOGIN NAME AND CLOSE
		String UsernameVerify = testDriver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div[3]/div[1]/div/div/div/ul/li/div/span[1]")).getText();
		testDriver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div[3]/div[1]/div/div/div/a[3]")).click(); //SIGNOUT
		library.ScreenShots.scrnshot(testDriver, "SIGNEDOUT");
		System.out.println(UsernameVerify);
		
}
	
}