package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeLeaveTypesPage;
import pom.ActitimeSettingPage;

public class TestDeleteLeaveTypeLogout extends BaseTest
{
	@Test
	public void deleteleavetype() throws InterruptedException
	{
		ActitimeHomePage hmpage = new ActitimeHomePage(driver);
		hmpage.settingMethod();
		
		ActitimeSettingPage settpage = new ActitimeSettingPage(driver);
		settpage.leavetypesMethod();
		ActitimeLeaveTypesPage levtypepage = new ActitimeLeaveTypesPage(driver);
		levtypepage.delleavetypeMethod();
	}
}









