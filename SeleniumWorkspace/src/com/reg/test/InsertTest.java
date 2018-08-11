package com.reg.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.reg.pom.InsertPage;

public class InsertTest {
	WebDriver driver;
	@Test
	public void run()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/SHUBHAM%20PATIL/Java/Manager/WebContent/register.html");
		InsertPage in=new InsertPage(driver);
		in.Insert("Ankit", "9876543210", "999999", "Pune", "Dev");
	}
}
