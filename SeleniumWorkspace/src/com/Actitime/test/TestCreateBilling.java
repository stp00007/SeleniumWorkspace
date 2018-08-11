package com.Actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Actitime.pom.ActitimeLoginPage;
import com.Actitime.pom.BasePage;
import com.Actitime.pom.BillingTypePage;
import com.Actitime.pom.CreateNewBillingPage;
import com.Actitime.pom.GeneralSettingPage;

public class TestCreateBilling extends SuperTestNG 
{
	@Test
	public void test() 
	{
	ActitimeLoginPage rv= new ActitimeLoginPage(driver);
	rv.login("admin", "manager");
	BasePage rv1= new BasePage(driver);
	rv1.settings();
	GeneralSettingPage rv3=new GeneralSettingPage(driver);
	rv3.billing();
	BillingTypePage rv4=new BillingTypePage(driver);
	rv4.create();
	CreateNewBillingPage rv5=new CreateNewBillingPage(driver);
	rv5.newbill("admin");
	rv5.alertpop();
	rv5.logout();
	}
}
