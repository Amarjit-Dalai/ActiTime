package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeLeaveTypesPage;
import pom.ActitimeSettingPage;
import pom.CreateNewLeaveTypePage;

public class TestLeaveTypeLogout extends BaseTest 
{
	@Test
	public void createleavetype() throws IOException
	{
		ActitimeHomePage hmpage = new ActitimeHomePage(driver);
		hmpage.settingMethod();
		
		ActitimeSettingPage settpage = new ActitimeSettingPage(driver);
		settpage.leavetypesMethod();
		ActitimeLeaveTypesPage levtype = new ActitimeLeaveTypesPage(driver);
		levtype.createleavetypeMethod();
		CreateNewLeaveTypePage createlevtype = new CreateNewLeaveTypePage(driver);
		createlevtype.newleavetypeMethod();
		createlevtype.submittMethod();
	}
}





