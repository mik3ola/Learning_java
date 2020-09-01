package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserLibraryLogin {

	public static void main(String[] args) {
		
		WebDriver testDriver;
		testDriver = library.Browsers.chooseBrowser("firefox");
		testDriver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-GB&.intl=uk&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Duk%26.lang%3Den-GB%26.partner%3Dnone%26.src%3Dfp");
		library.ScreenShots.scrnshot(testDriver, "loginpg");
		testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("mikel.law01");
		testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		testDriver.findElement(By.id("login-passwd")).sendKeys("beauty123");
		testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click(); //login
		library.ScreenShots.scrnshot(testDriver, "privacypg");
		
		
		// Close X readables
		//testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		testDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/input[19]")).click();
		testDriver.manage().timeouts().implicitlyWait(1500, TimeUnit.MICROSECONDS);
		
		library.ScreenShots.scrnshot(testDriver, "inbox");
		// VERIFY LOGIN NAME AND CLOSE
		String UsernameVerify = testDriver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div/div[3]/div[1]/div/label/span")).getText();
		System.out.println(UsernameVerify);
		testDriver.close();
		
		
		if(UsernameVerify != "Mikel")
		{
			System.out.println("True");
		}
		else {System.out.println("false");
		}
	}

}
