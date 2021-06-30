package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeSettingPage;
import pom.ActitimeTypesOfWorkPage;
import pom.EditTypesOfWorkPage;

public class TestDeleteWorkLogout extends BaseTest
{
	@Test
	public void delwork() throws InterruptedException
	{
		ActitimeHomePage hmpage = new ActitimeHomePage(driver);
		hmpage.settingMethod();
		
		ActitimeSettingPage settpage = new ActitimeSettingPage(driver);
		settpage.typesofwork();
		
		ActitimeTypesOfWorkPage typeswork = new ActitimeTypesOfWorkPage(driver);
		typeswork.retypeworkMethod();
		
		EditTypesOfWorkPage edittype = new EditTypesOfWorkPage(driver);
		edittype.deltypeworkMethod();
	}
}










