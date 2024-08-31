package Assesment;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.page.Page.CaptureScreenshotFormat;

import com.google.common.io.Files;

import GenericUtility.SeleniumUtility;
import GenericUtility.CaptureScreenshot;
public class Functional_Testing 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='file']"))
		.sendKeys("C:\\Users\\saisa\\Downloads\\demo-data.xlsx");
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(6000);
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
		Thread.sleep(3000);
		Robot r=new Robot();
		
		for(int i=1;i<=8;i++)
		{
		r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_MINUS);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_MINUS);
		}
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
	


