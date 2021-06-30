package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class ActitimeTypesOfWorkPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Create Type of Work']")
	private WebElement createtypesofworkButton;
	
	@FindBy(xpath="//th[@class='listtblcolheader firstInRow']/../..//a[.='Research and Innovation']")
	private WebElement typeworkButton;
	
	@FindBy(xpath="//a[.='Research and Analysis']")
	private WebElement retypeworkButton;
	
	public ActitimeTypesOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createtypesofworkMethod()
	{
		JavascriptExecutor jso =(JavascriptExecutor)driver;
		jso.executeScript("arguments[0].click()", createtypesofworkButton);
	}
	
	public void typeworkMethod()
	{
		JavascriptExecutor jsm =(JavascriptExecutor)driver;
		jsm.executeScript("arguments[0].click()", typeworkButton);
		
	}
	
	public void retypeworkMethod() throws InterruptedException
	{
		Thread.sleep(6000);
		JavascriptExecutor jsi =(JavascriptExecutor)driver;
		jsi.executeScript("arguments[0].click()", retypeworkButton);
	}
}






