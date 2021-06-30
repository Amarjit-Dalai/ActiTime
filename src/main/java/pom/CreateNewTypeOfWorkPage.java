package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class CreateNewTypeOfWorkPage extends BasePage implements AutoConstant
{
	@FindBy(id="name")
	private WebElement nameTextfield;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropdown;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement submitButton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//input[@onclick='billableChangedToTrue()']")
	private WebElement categoryRadiobutton;
	
	@FindBy(xpath="//input[@id='billingRate_input']")
	private WebElement billrateTextfield;
	
	public CreateNewTypeOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeworkMethod() throws IOException
	{
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 4));
		selectbyvisibletext(statusDropdown,"archived");
		//categoryRadiobutton.click();
		//billrateTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 5));
	}
	
	public void submitMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		submitButton.click();
	}
	
	public void cancelMethod()
	{
		cancelButton.click();
	}
}














