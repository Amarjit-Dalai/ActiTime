package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class CustomerDeletePage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='action'])[1]")
	private WebElement actionButton;
	
	@FindBy(xpath="(//div[text()='Delete'])[2]")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement permntdelButton;
	
	@FindBy(xpath="(//div[@class='cancelBtn greyButton'])[1]")
	private WebElement cancelButton;
	
	public CustomerDeletePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void actionMethod()
	{
		JavascriptExecutor jsf =(JavascriptExecutor)driver;
		jsf.executeScript("arguments[0].click()", actionButton);
	}
	
	public void deleteMethod()
	{
		JavascriptExecutor jst =(JavascriptExecutor)driver;
		jst.executeScript("arguments[0].click()", deleteButton);
	}

	public void permanentdelMethod()
	{
		JavascriptExecutor jsv =(JavascriptExecutor)driver;
		jsv.executeScript("arguments[0].click()", permntdelButton);
		
	}
	public void canceldbMethod()
	{
		cancelButton.click();
	}
}


