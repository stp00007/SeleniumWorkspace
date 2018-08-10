package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage 
{
	@FindBy(name="username")
	private WebElement user;
	@FindBy(name="pwd")
	private WebElement pass;
	@FindBy(id="loginButton")
	private WebElement login;
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String un,String pwd)
	{
		user.sendKeys(un);
		pass.sendKeys(pwd);
		login.click();
	}
}
