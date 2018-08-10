package com.Hidendivision.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMYTripPage 	
{
	@FindBy(xpath="//input[@id='hp-widget__depart']")
	private WebElement datemenu;
	@FindBy(xpath="(//td[@data-year='2018'])[3]")
	private WebElement day;
	
	public MakeMYTripPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void date() 
	{
		datemenu.click();
		day.click();
	}
}
