package com.Example;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dropdown 
{
	@Test
	public void drop() throws InterruptedException, IOException
	{
	WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		WebElement rvq = driver.findElement(By.xpath("(//img[@class='lazy'])[5]"));
		
		Actions act=new Actions(driver);
//		act.moveToElement(rv).perform();
//		WebElement bc = rv.findElement(By.xpath("(//a[@id='ch_logged-intrip'])[1]"));
//		bc.click();
//	
		act.moveToElement(rvq).perform();
		act.contextClick().perform();
		act.sendKeys("i").perform();
	}	
	
}
