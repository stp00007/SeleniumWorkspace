package com.Example;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Athentication 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Documents\\server.exe");
		driver.get("https://Dell-PC/svn/actitime/");
	}
}
