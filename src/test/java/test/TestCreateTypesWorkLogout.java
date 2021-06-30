package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeSettingPage;
import pom.ActitimeTypesOfWorkPage;
import pom.CreateNewTypeOfWorkPage;

public class TestCreateTypesWorkLogout extends BaseTest
{
	@Test
	public void cratework() throws InterruptedException, IOException
	{
		ActitimeHomePage hmpage = new ActitimeHomePage(driver);
		hmpage.settingMethod();
		
		ActitimeSettingPage settpage = new ActitimeSettingPage(driver);
		settpage.typesofwork();
		
		ActitimeTypesOfWorkPage typework = new ActitimeTypesOfWorkPage(driver);
		typework.createtypesofworkMethod();
		CreateNewTypeOfWorkPage createworkpage = new CreateNewTypeOfWorkPage(driver); 
		createworkpage.createtypeworkMethod();
		createworkpage.submitMethod();	
	}
}
























