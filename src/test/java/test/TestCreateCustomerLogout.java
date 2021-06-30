package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeTaskPage;
import pom.CreateNewCustomerPage;

public class TestCreateCustomerLogout extends BaseTest 
{
	@Test
	public void createcustomer() throws InterruptedException, IOException
	{	
		ActitimeHomePage hompage = new ActitimeHomePage(driver);
		hompage.hometaskMethod();
		
		ActitimeTaskPage tskpage = new ActitimeTaskPage(driver);
		tskpage.taskMethod();
		tskpage.newcustomerMethod();
		
		CreateNewCustomerPage custopage = new CreateNewCustomerPage(driver);
		custopage.newcustomerMethod();
		custopage.descMethod();
		custopage.createcustomerMethod();
	}
}


















