package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeTaskPage;
import pom.CustomerDeletePage;

public class TestDeleteCustomerLogout extends BaseTest
{
	@Test
	public void deletecustomer() throws InterruptedException
	{
		ActitimeHomePage hompage = new ActitimeHomePage(driver);
		hompage.hometaskMethod();
		
		ActitimeTaskPage tskpage = new ActitimeTaskPage(driver);
		tskpage.customersettingMethod();
	
		CustomerDeletePage delpage = new CustomerDeletePage(driver);
		delpage.actionMethod();
		delpage.deleteMethod();
		delpage.permanentdelMethod();	
	}
}




