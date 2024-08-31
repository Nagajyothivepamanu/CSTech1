package GenericUtility;

import java.io.File;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility
{
	public Actions act=null;
	public Select s=null;
	WebDriver driver=null;
	
	
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public void captureScreenshot(WebDriver driver,String path) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		Files.copy(src, dest);
	}
	

    public void navigateBack(WebDriver driver) {
        driver.navigate().back();
    }

	
	
	
	
	
	

	    
	

}
