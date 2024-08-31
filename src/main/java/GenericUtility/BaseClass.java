package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver=null;
	public PropertiesUtility PUTIL=null;
	public SeleniumUtility SUTIL=new SeleniumUtility();
	
	@BeforeSuite(alwaysRun=true)
	public void createDbConnection()
	{
		System.out.println("db connection successfull!!");
	}
	
	@BeforeClass(alwaysRun=true) 
	public void launchBrowser(String browser) throws Exception
	{
		PUTIL=new PropertiesUtility();
		String URL=PUTIL.getDatafromproperties1("url");
		SUTIL=new SeleniumUtility();
		
		
		if(browser.contains("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome launched successfully");
		}
		
		if(browser.contains("firefox"))
		{
			driver=new ChromeDriver();
			System.out.println("firefox launched successfully");
		}
		if(browser.contains("safari"))
		{
			driver=new ChromeDriver();
			System.out
			.println("safari launched successfully");
		}
		SUTIL.implicitwait(driver, 10);
		SUTIL.maximizewindow(driver);
		driver.get(URL);
	}
		@AfterClass(alwaysRun=true)
		public void closeBrowser()
		{
			driver.close();
			System.out.println("Browser closed successfully");
		}



}
