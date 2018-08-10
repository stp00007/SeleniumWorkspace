package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	@FindBy(xpath="//a[@class='content administration']")
	private WebElement settings; 
	@FindBy(xpath="//a[contains(@class,'logout')]")
	private WebElement logout;
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void settings() 
	{
		settings.click();
		
	}
	public void logout()
	{
		logout.click();
	}
}
