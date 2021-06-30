package generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		ActitimeLoginPage logpage = new ActitimeLoginPage(driver);
		logpage.loginMethod();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		ActitimeHomePage hompage = new ActitimeHomePage(driver);
		hompage.logoutMethod();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}










