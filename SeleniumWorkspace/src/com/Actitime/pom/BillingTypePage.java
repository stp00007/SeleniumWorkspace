package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingTypePage extends BasePage
{
	@FindBy(xpath="//input[@name='addLeaveType']")
	private WebElement create;

	public BillingTypePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, driver);
	}
	public void create()
	{
		create.click();
	}
}
