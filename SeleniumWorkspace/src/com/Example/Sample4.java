package com.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample4 {
	@Test
	public void test()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
}
