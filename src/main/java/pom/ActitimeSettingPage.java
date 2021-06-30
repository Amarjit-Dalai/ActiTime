package pom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
public class ActitimeSettingPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(xpath="//div[text()='Turn Features On / Off']")
	private WebElement turnfeaturesButton;
	
	@FindBy(xpath="(//div[contains(text(),'Settings')])[2]")
	private WebElement generalsettingsButton;
	
	@FindBy(xpath="//a[text()='Workflow Settings']")
	private WebElement workflowsettingsLink;
	
	@FindBy(xpath="//a[text()='Types of Work']")
	private WebElement typesofworkLink;
	
	@FindBy(xpath="//a[text()='Leave Types']")
	private WebElement leavetypesLink;
	
	@FindBy(xpath="//a[text()='Notifications']")
	private WebElement notificationsLink;
	
	@FindBy(xpath="//a[text()='Logo Settings']")
	private WebElement logosettingsLink;
	
	@FindBy(xpath="//div[text()='Licenses']")
	private WebElement licenseButton;
	
	public ActitimeSettingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void turnfeatureMethod()
	{
		turnfeaturesButton.click();
	}
	
	public void generalsettingMethod()
	{
		generalsettingsButton.click();
	}
	public void workflowsettingMethod()
	{
		workflowsettingsLink.click();
	}
	public void typesofwork() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jsm =(JavascriptExecutor)driver;
		jsm.executeScript("arguments[0].click()", typesofworkLink);		
	}
	
	public void leavetypesMethod()
	{
		JavascriptExecutor jsw =(JavascriptExecutor)driver;
		jsw.executeScript("arguments[0].click()", leavetypesLink);
	}
	
	public void notificationMethod()
	{
		notificationsLink.click();
	}
	public void logosettingMethod()
	{
		logosettingsLink.click();
	}
	public void licenseMethod()
	{
		licenseButton.click();
	}

}

