package com.Actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTestNG 
{
	WebDriver driver;
	@BeforeClass
	public void precondition()
	{
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8090/login.do;jsessionid=busqlr28ofch");
	}
	@AfterClass
	public void postcondition()
	{
		driver.quit();
	}
}
