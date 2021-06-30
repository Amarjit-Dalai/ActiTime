package pom;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;


public class CreateNewLeaveTypePage extends BasePage implements AutoConstant 
{
	public WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Leave Type Name']")
	private WebElement leavetypenameTextfield;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_rateCoefficient']")
	private WebElement leavehourrateTextfield;
	
	@FindBy(xpath="//input[@id='processLeaveTimeCheckbox_createPopup']")
	private WebElement processleavetimeCheckbox;
	
	@FindBy(xpath="//input[@id='asSickDaysRadioButton_createPopup']")
	private WebElement assickdayRadiobutton;
	
	@FindBy(xpath="//input[@id='asPtoRadioButton_createPopup']")
	private WebElement asptoRadiobutton;
	
	@FindBy(xpath="//input[@id='ptoCoefficientInput_createPopup']")
	private WebElement requestedleavetimeTextfield;
	
	@FindBy(xpath="(//span[text()='Create Leave Type'])[2]")
	private WebElement leavetypeButton;
	
	@FindBy(xpath="//div[@id='leaveTypeLightBox_cancelBtn']")
	private WebElement cancelButton;
	
	public CreateNewLeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void newleavetypeMethod() throws IOException 
	{
		leavetypenameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 7));
        processleavetimeCheckbox.click();
	}
	public void submittMethod()
	{
		JavascriptExecutor jsk =(JavascriptExecutor)driver;
        jsk.executeScript("arguments[0].click()", leavetypeButton);
	}

	public void cancelMethod()
	{
		cancelButton.click();
	}
}
































