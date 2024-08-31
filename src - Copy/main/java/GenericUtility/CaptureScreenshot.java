package GenericUtility;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void capturescreenshot(WebDriver driver,String imageName) throws Exception
	{
	
	Calendar cal=Calendar.getInstance();
	Date d=(Date) cal.getTime();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
	String datestamp=sdf.format(d);
    TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File dest=new File(".\\Screenshot\\"+datestamp+"image.png");
	Files.copy(src, dest);
	}

}
