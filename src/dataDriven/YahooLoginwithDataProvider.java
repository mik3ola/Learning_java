package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooLoginwithDataProvider {
	
	WebDriver testDriver;
	
	
	@Test(dataProvider = "details")
	public void login(String username, String password) {

	testDriver = library.Browsers.chooseBrowser("firefox");
	testDriver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-GB&.intl=uk&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Duk%26.lang%3Den-GB%26.partner%3Dnone%26.src%3Dfp");
	library.ScreenShots.scrnshot(testDriver, "loginpg");
	testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(username);
	testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	testDriver.findElement(By.id("login-passwd")).sendKeys(password);
	testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click(); //login
	library.ScreenShots.scrnshot(testDriver, "privacypg");
	
	
	// Close X readables
	//testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	testDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/input[19]")).click();
	testDriver.manage().timeouts().implicitlyWait(1500, TimeUnit.MICROSECONDS);
	
	library.ScreenShots.scrnshot(testDriver, "inbox");
	// VERIFY LOGIN NAME AND CLOSE
	String UsernameVerify = testDriver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div/div[3]/div[1]/div/label/span")).getText();
	testDriver.close();
	
	if (UsernameVerify.equals("mikel")) 
	{
	System.out.println(UsernameVerify+" logged in successfully");
	} 
	else {
		System.out.println("failed");
	}
}
	@DataProvider(name = "details")
	public Object [][] data(){
		Object[][]myData = {{"mikel.law01", "beauty123"}, {"matkin97", "beauty123"}, {"testing", "fail"}};
		return myData;
	}
	
}

