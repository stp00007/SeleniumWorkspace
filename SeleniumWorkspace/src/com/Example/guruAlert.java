package com.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class guruAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("0987654");
		driver.findElement(By.name("submit")).click();
		Alert rv = driver.switchTo().alert();
		String str = rv.getText();
		System.out.println(str);
		Thread.sleep(2000);
		rv.dismiss();
	}
}
