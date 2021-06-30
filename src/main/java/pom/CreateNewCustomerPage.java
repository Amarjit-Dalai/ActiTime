package pom;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;
public class CreateNewCustomerPage extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextarea;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement selectcustomerDropdown;
	
	@FindBy(xpath="(//div[.='Galaxy Corporation'])[7]")
	private WebElement multiorganization;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	public WebElement createcustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	public WebElement cancelButton;
	
	
	public CreateNewCustomerPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void newcustomerMethod() throws IOException 
	{
		entercustomernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 2));	
	}
	
	public void descMethod() throws IOException
	{
		entercustomerdescriptionTextarea.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 3));
	}
	
	public void copyprojectmethod() 
	{
		selectcustomerDropdown.click();
		
		//System.out.println(multicompanyButton.size());
		//for(int i=0; i<multicompanyButton.size(); i++)
		//{
			//if(multicompanyButton.get(i).getText().equalsIgnoreCase("galaxy corporation"))
			//{
				//multicompanyButton.get(i).click();
				//break;
			//}
		//}
		
		multiorganization.click();	
	}
	
	public void createcustomerMethod()
	{
		createcustomerButton.click();
	}
	public void cancelMethod()
	{
		cancelButton.click();
	}

}












