package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingPage extends BasePage
{
	@FindBy(xpath="//a[contains(text(),'Billing')]")
	private WebElement billingtype;
	public GeneralSettingPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void billing() 
	{
		billingtype.click();
	}
}
