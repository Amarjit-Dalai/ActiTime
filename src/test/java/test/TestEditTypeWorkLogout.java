package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeSettingPage;
import pom.ActitimeTypesOfWorkPage;
import pom.EditTypesOfWorkPage;

public class TestEditTypeWorkLogout extends BaseTest
{
	@Test
	public void editwork() throws InterruptedException, IOException
	{
		ActitimeHomePage hmpage = new ActitimeHomePage(driver);
		hmpage.settingMethod();
		
		ActitimeSettingPage settpage = new ActitimeSettingPage(driver);
		settpage.typesofwork();
		
		ActitimeTypesOfWorkPage typework = new ActitimeTypesOfWorkPage(driver);
		typework.typeworkMethod();
		
		EditTypesOfWorkPage edittype = new EditTypesOfWorkPage(driver);
		edittype.edittypeworkMethod();
		edittype.saveworkMethod();
	}
}







