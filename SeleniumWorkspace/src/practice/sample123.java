package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample123 {
 @Test
 public void sample()
 {
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.google.com");
 }
}
