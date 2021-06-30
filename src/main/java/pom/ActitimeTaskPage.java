package pom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ActitimeTaskPage 
{
	public WebDriver driver;
	//@FindBy(xpath="//div[@id='container_tasks']")
	//private WebElement taskButton;
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewDropdown;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomerButton;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newprojectButton;
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newtasksButton;
	
	@FindBy(xpath="//div[text()='Import Tasks from CSV']")
	private WebElement importtasksfromcsvButton;
	
	@FindBy(xpath="//div[.='All Customers']/../..//div[.='Ben Harrish']/../..//div[@class='editButton']")
	private WebElement customersettingButton;
	public ActitimeTaskPage(WebDriver driver)
	{
		this.driver=driver;
	 PageFactory.initElements(driver, this);
	}
	
	public void taskMethod() throws InterruptedException 
	{
		//addnewDropdown.click();
		JavascriptExecutor jsk =(JavascriptExecutor)driver;
		jsk.executeScript("arguments[0].click()", addnewDropdown);
		Thread.sleep(3000);
	}
	
	public void newcustomerMethod()
	{	
		newcustomerButton.click();
	}
	public void newprojectMethod()
	{
		newprojectButton.click();
	}
	public void newtasksMethod()
	{
		newtasksButton.click();
	}
	public void importtasksfromcsvMethod()
	{
		importtasksfromcsvButton.click();
	}
	public void customersettingMethod() throws InterruptedException
	{
		Thread.sleep(10000);
		JavascriptExecutor jsb =(JavascriptExecutor)driver;
		jsb.executeScript("arguments[0].click()", customersettingButton);
	}
}







