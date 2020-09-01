package bDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class YahooLoginBDDimplementation {
	WebDriver testDriver;
	
	
	@Given("the user is on the correct login page")
	public void the_user_is_on_the_correct_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MIK3\\eclipse-workspace\\SELENIUM\\chromedriver.exe");
		testDriver = new ChromeDriver();
		testDriver.get("https://login.yahoo.com/?.src=ym&.lang=en-SG&.intl=sg&.done=https%3A%2F%2Fsg.mail.yahoo.com%2Fd");
		testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		  //library.Browsers.chooseBrowser("chrome"); 
		  //library.ScreenShots.scrnshot(testDriver, "loginpg"); 
	}
	
	@When("^enter username$")
	public void enter_username() {
		testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("mikel.law01");
		testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	/*
	 * @When("enter username") public void enter_username() {
	 * testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(
	 * "mikel.law01"); // testDriver.manage().timeouts().implicitlyWait(5,
	 * TimeUnit.SECONDS);
	 * testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click(); //
	 * Write code here that turns the phrase above into concrete actions //throw new
	 * PendingException();
	 */	//}

	@When("the user inputs a valid password")
	public void the_user_inputs_a_valid_password() {
	//	testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		testDriver.findElement(By.id("login-passwd")).sendKeys("beauty123");
		testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click(); //login
		library.ScreenShots.scrnshot(testDriver, "privacypg");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("the user should be logged in")
	public void the_user_should_be_logged_in() {
		library.ScreenShots.scrnshot(testDriver, "inbox");
		testDriver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
	/*
	 * @Given("^Given the user is on the correct login page$") public void
	 * Given_the_user_is_on_the_correct_login_page() { testDriver =
	 * library.Browsers.chooseBrowser("chrome"); testDriver.get(
	 * "https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-GB&.intl=uk&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Duk%26.lang%3Den-GB%26.partner%3Dnone%26.src%3Dfp"
	 * ); library.ScreenShots.scrnshot(testDriver, "loginpg");
	 * testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * //testDriver.close(); }
	 * 
	 * 
	 * @When("^When the user inputs a valid username$") public void
	 * When_the_user_inputs_a_valid_username() { //testDriver =
	 * library.Browsers.chooseBrowser("firefox"); //testDriver.get(
	 * "https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-GB&.intl=uk&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Duk%26.lang%3Den-GB%26.partner%3Dnone%26.src%3Dfp"
	 * ); //library.ScreenShots.scrnshot(testDriver, "loginpg");
	 * //testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(
	 * "mikel.law01"); testDriver.manage().timeouts().implicitlyWait(5,
	 * TimeUnit.SECONDS);
	 * testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	 * //testDriver.close(); }
	 * 
	 * 
	 * @And("^And the user inputs a valid password$") public void
	 * And_the_user_inputs_a_valid_password() { //testDriver =
	 * library.Browsers.chooseBrowser("chrome"); //testDriver.get(
	 * "https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-GB&.intl=uk&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Duk%26.lang%3Den-GB%26.partner%3Dnone%26.src%3Dfp"
	 * ); library.ScreenShots.scrnshot(testDriver, "loginpg");
	 * //testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * //testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(
	 * "mikel.law01"); testDriver.manage().timeouts().implicitlyWait(5,
	 * TimeUnit.SECONDS);
	 * //testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	 * testDriver.findElement(By.id("login-passwd")).sendKeys("beauty123");
	 * testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	 * //login library.ScreenShots.scrnshot(testDriver, "privacypg");
	 * //testDriver.close(); }
	 * 
	 * 
	 * @Then("^Then the user should be logged in$") public void
	 * Then_the_user_should_be_logged_in( ) { //testDriver =
	 * library.Browsers.chooseBrowser("firefox"); //testDriver.get(
	 * "https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-GB&.intl=uk&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Duk%26.lang%3Den-GB%26.partner%3Dnone%26.src%3Dfp"
	 * ); //library.ScreenShots.scrnshot(testDriver, "loginpg");
	 * //testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * //testDriver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(
	 * "mikel.law01"); //testDriver.manage().timeouts().implicitlyWait(5,
	 * TimeUnit.SECONDS);
	 * //testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	 * //testDriver.findElement(By.id("login-passwd")).sendKeys("beauty123");
	 * //testDriver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	 * //login //library.ScreenShots.scrnshot(testDriver, "privacypg");
	 * //testDriver.findElement(By.xpath(
	 * "/html/body/div[1]/div[1]/div[2]/form/input[19]")).click();
	 * //testDriver.manage().timeouts().implicitlyWait(1500, TimeUnit.MICROSECONDS);
	 * 
	 * library.ScreenShots.scrnshot(testDriver, "inbox"); testDriver.close(); }
	 */
	

}
