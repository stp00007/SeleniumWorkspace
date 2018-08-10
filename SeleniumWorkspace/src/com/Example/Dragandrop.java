package com.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement a2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions  act=new Actions(driver);
		act.dragAndDrop(a1, a2).perform();

	}
}
