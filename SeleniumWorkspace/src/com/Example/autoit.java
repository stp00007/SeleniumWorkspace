package com.Example;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoit 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new  FirefoxDriver();
		driver.get("file:///E:/SHUBHAM%20PATIL/Qspider/Selenium%20project/fileupload.html");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\abc.exe");
	}
}
