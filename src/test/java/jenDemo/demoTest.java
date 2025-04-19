package jenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest {
@Test
public void run() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Reporter.log("Flipkart launch successfully",true);
}
}
