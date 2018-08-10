package com.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8090/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		driver.findElement(By.xpath("(//a[@class='item'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'delete')])[1]")).click();
		Alert rv = driver.switchTo().alert();
		String str = rv.getText();
		System.out.println(str);
		rv.dismiss();
		driver.close();
	}
}
