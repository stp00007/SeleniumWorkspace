package com.Example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pqr 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File("./Screenshot/google.png"));
		System.out.println("The Snapshot has been taken");
		driver.close();
	}
}
