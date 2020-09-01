package jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import SeleniumWebDriver.YahooMailLogin;


@RunWith(Suite.class)
@Suite.SuiteClasses({YahooJunit.class, OpenYoutube.class, YahooMailLogin.class})
public class JunitSuites {

}
