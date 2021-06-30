package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeLeaveTypesPage;
import pom.ActitimeSettingPage;

public class TestEditLeaveType extends BaseTest
{
	@Test
	public void editleavetype() throws InterruptedException, IOException
	{
		ActitimeHomePage hmpage = new ActitimeHomePage(driver);
		hmpage.settingMethod();
		ActitimeSettingPage settpage = new ActitimeSettingPage(driver);
		settpage.leavetypesMethod();
		ActitimeLeaveTypesPage leavetype = new ActitimeLeaveTypesPage(driver);
		leavetype.editleavetypeMethod();
	}
}






