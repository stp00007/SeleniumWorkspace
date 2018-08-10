package com.Example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class autosuggetion {
	@Test
	public void abc() throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium");
		Thread.sleep(200);
		List<WebElement> rv = driver.findElements(By.xpath("//div[contains(text(),'selenium')]"));
		for (WebElement ele : rv) {
			String str = ele.getText();
			if (str.contains("ide")) {
				ele.click();
				break;
			}
			else
			{
				System.out.println("Ide not present");
			}
		}
	}
}
