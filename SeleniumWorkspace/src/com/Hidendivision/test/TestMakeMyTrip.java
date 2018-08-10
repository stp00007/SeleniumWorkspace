package com.Hidendivision.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Hidendivision.pom.MakeMYTripPage;

public class TestMakeMyTrip 
{
	@Test
	public void test() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MakeMYTripPage rv= new MakeMYTripPage(driver);
		rv.date();
		
	}
}
