package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	@FindBy(xpath="https://www.getcalley.com/")
	private WebElement URL1;
	
	@FindBy(xpath="https://www.getcalley.com/calley-lifetime-offer/")
	private WebElement URL2;
	
	@FindBy(xpath="https://www.getcalley.com/see-a-demo/")
	private WebElement URL3;
	
	@FindBy(xpath="https://www.getcalley.com/calley-teams-features/")
	private WebElement URL4;
	
	@FindBy(xpath="https://www.getcalley.com/calley-pro-features/")
	private WebElement URL5;
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement URL1() {
		return URL1;
	}

	public WebElement URL2() {
		return URL2;
	}
	
	public WebElement URL3() {
		return URL3;
	}
	
	
	public WebElement URL4() {
		return URL4;
	}
	
	public WebElement URL5() {
		return URL5;
	}
	public void getURL1() {
		 URL1.click();;
	}
	public void getURL2() {
		 URL2.click();;
	}
	public void getURL3() {
		 URL3.click();;
	}
	public void getURL4() {
		 URL4.click();;
	}
	public void getURL5() {
		 URL5.click();;
	}

}
