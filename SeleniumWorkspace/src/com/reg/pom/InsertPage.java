package com.reg.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertPage {
	@FindBy(xpath="//input[@name='ename']")
	private WebElement ename;
	@FindBy(xpath="//input[@name='emob']")
	private WebElement emob;
	@FindBy(xpath="//input[@name='esal']")
	private WebElement esal;
	@FindBy(xpath="//input[@name='eaddress']")
	private WebElement eaddress;
	@FindBy(xpath="//input[@name='edesig']")
	private WebElement edesignation;
	@FindBy(xpath="//input[@value='Insert']")
	private WebElement insertdata;
	public InsertPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Insert(String name,String mob,String sal,String address,String desig)
	{
		ename.sendKeys(name);
		emob.sendKeys(mob);
		esal.sendKeys(sal);
		esal.sendKeys(address);
		edesignation.sendKeys(desig);
		//insertdata.click();
	}
}
