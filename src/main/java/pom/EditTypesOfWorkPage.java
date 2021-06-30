
package pom;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class EditTypesOfWorkPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement nameTextfield;
	
	@FindBy(xpath="//input[@value='   Save Changes   ']")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement delButton;
	
	@FindBy(xpath="//input[@id='billingRate_input']")
	private WebElement billingTextfield;
	
	@FindBy(xpath="//input[@value='Delete This Type of Work']")
	private WebElement deltypeworkButton;

	
	public EditTypesOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void edittypeworkMethod() throws InterruptedException, IOException
	{
		nameTextfield.sendKeys(Keys.CONTROL,"A");
		nameTextfield.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(5000);
		nameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 6));
	}
	
	public void saveworkMethod()
	{
		JavascriptExecutor jsr =(JavascriptExecutor)driver;
		jsr.executeScript("arguments[0].click()", saveButton);
	}
	public void delworkMethod()
	{
		delButton.click();
	}
	public void deltypeworkMethod()
	{
		JavascriptExecutor jso =(JavascriptExecutor)driver;
		jso.executeScript("arguments[0].click()", deltypeworkButton);
		alertaccept(driver);		
	}
}










