package com.Example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abc 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://desktop.github.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Download for Windows')]")).click();
		Robot rt= new Robot();
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}
}
