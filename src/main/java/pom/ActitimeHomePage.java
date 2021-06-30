package pom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
public class ActitimeHomePage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskButton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingDropdown;
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hometaskMethod()
	{
		//taskButton.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", taskButton);
	}
	public void settingMethod()
	{
		JavascriptExecutor jsk =(JavascriptExecutor)driver;
		jsk.executeScript("arguments[0].click()", settingDropdown);
	}
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(7000);
		JavascriptExecutor jsu =(JavascriptExecutor)driver;
		jsu.executeScript("arguments[0].click()", logoutButton);
	}
}






















