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

public class ActitimeLeaveTypesPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Create Leave Type'])[1]")
	private WebElement createleavetypeButton;
	
	@FindBy(xpath="//th[@class='leaveTypeNameImageCell']/../../..//span[text()='Tigh Hamstring']")
	private WebElement editleavetypeButton;
	
	@FindBy(xpath="//input[@id='inputDiv']")
	private WebElement editTextfield;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement tickButton;
	
	@FindBy(xpath="//span[text()='Brain Surgery']/../../../../../..//td[@class='leaveTypeDeleteCell last active']")
	private WebElement crossButton;
	public ActitimeLeaveTypesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createleavetypeMethod()
	{
		JavascriptExecutor jsq =(JavascriptExecutor)driver;
		jsq.executeScript("arguments[0].click()", createleavetypeButton);
	}
	
	public void editleavetypeMethod() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		JavascriptExecutor jsy =(JavascriptExecutor)driver;
		jsy.executeScript("arguments[0].click()", editleavetypeButton);
		editTextfield.sendKeys(Keys.CONTROL,"A");
		editTextfield.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		editTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 8));
		tickButton.click();
	}
	
	public void delleavetypeMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		crossButton.click();
		alertaccept(driver);
	}
}




















