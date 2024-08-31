package Assesment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.CaptureScreenshot;
import GenericUtility.SeleniumUtility;
import ObjectRepo.Home;

public class UiTesting {
	WebDriver driver;
	SeleniumUtility SUTIL;
	Home hp ;
	@Test
	public void ass1() throws Exception {
		driver = new ChromeDriver();
		SUTIL = new SeleniumUtility();
		 hp = new Home(driver);
		
		hp.getUrl1();
		CaptureScreenshot.capturescreenshot(driver, "url1");
		SUTIL.navigateBack(driver);
		hp.getUrl2();
		CaptureScreenshot.capturescreenshot(driver, "url2");
		SUTIL.navigateBack(driver);
		hp.getUrl3();
		CaptureScreenshot.capturescreenshot(driver, "url3");
		SUTIL.navigateBack(driver);
		hp.getUrl4();
		CaptureScreenshot.capturescreenshot(driver, "url4");
		SUTIL.navigateBack(driver);
		hp.getUrl5();
		CaptureScreenshot.capturescreenshot(driver, "url5");
		SUTIL.navigateBack(driver);
	}
	

}
