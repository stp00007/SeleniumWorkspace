package com.Example;




import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class autosuggetionbysikuli {
	@Test
	public void auto() throws InterruptedException, FindFailed
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		org.sikuli.script.Pattern p1=new org.sikuli.script.Pattern("C:\\Users\\Dell\\Documents\\Lightshot\\g1.png");
		org.sikuli.script.Pattern p2=new org.sikuli.script.Pattern("C:\\Users\\Dell\\Documents\\Lightshot\\g2.png");
		Screen s1=new Screen();
		s1.click(p1);
		s1.type(p1, "Selenium");
		Thread.sleep(200);
		s1.click(p2);
		
	}
}
