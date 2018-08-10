package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewBillingPage extends BasePage
{
	@FindBy(id="name")
	private WebElement name;
	@FindBy( id="billingType_setBillable")
	private WebElement billable;
	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement cancel;
	WebDriver driver;
	public CreateNewBillingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void newbill(String billname) 
	{
		name.sendKeys(billname);
		billable.click();
		cancel.click();
		
	}
	public void alertpop()
	{
		driver.switchTo().alert().accept();
	}
}
