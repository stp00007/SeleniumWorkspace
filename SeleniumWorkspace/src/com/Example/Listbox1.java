package com.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		//day
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		day.sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		day.sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		day.sendKeys(Keys.ENTER);
		//month
		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("april");
		//year
		WebElement year = driver.findElement(By.id("year"));
		Select s1=new Select(year);
		//s1.selectByIndex(3);
		s1.selectByValue("2014");
	}
}
