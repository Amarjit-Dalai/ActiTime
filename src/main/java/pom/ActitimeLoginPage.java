package pom;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;
public class ActitimeLoginPage extends BasePage implements AutoConstant 
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keeploggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeLink;
	

public ActitimeLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void loginMethod() throws IOException
{
	usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 0));
	passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet, 1, 1));
	keeploggedinCheckbox.click();
	//Thread.sleep(5000);
	loginButton.click();
}
public void forgotpasswordMethod()
{
	forgotpasswordLink.click();
}
public void actitimeMethod()
{
	actitimeLink.click();
}
	
}








