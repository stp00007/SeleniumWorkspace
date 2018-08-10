package com.Actitime.test;

import org.testng.annotations.Test;

import com.Actitime.pom.ActitimeLoginPage;

public class TestActitimeLogin extends SuperTestNG
{
	@Test
	public void Test()
	{
		ActitimeLoginPage rv= new ActitimeLoginPage(driver);
		rv.login("admin", "manager");
	}
}
