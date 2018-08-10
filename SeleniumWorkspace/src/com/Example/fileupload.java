package com.Example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class fileupload {
	@Test
	public void file() throws FindFailed, InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
		Pattern p1=new Pattern("E:\\SHUBHAM PATIL\\Qspider\\snapsot\\pics.png");
		Pattern p2=new Pattern("E:\\SHUBHAM PATIL\\Qspider\\snapsot\\samplepasdpasodpa.png");
		Pattern p3=new Pattern("E:\\SHUBHAM PATIL\\Qspider\\snapsot\\tulip.png");
		Pattern p4=new Pattern("E:\\SHUBHAM PATIL\\Qspider\\snapsot\\open1.png");
		Screen s1=new Screen();
		s1.click(p1);
		s1.doubleClick(p2);
		s1.click(p3);
		s1.click(p4);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
	}
}
