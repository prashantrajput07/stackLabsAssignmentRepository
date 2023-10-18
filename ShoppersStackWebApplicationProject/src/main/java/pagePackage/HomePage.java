package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// it is use to store all webelements of home page
	@FindBy(id="men") private WebElement Men_Module;
	@FindBy(id = "women") private WebElement Women_Module;
	@FindBy(id="electronics") private WebElement Electronics_Module;
	@FindBy(id = "kids") private WebElement Kids_Module;
	@FindBy(id = "beauty") private WebElement Beauty_Module;
	
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	
	
	
	
	//utilization
	public WebElement getTime_Track_Module() {
		return Men_Module;
	}


	public WebElement getTasks_Module() {
		return Women_Module;
	}


	public WebElement getReports_Module() {
		return Electronics_Module;
	}


	public WebElement getUsers_Module() {
		return Kids_Module;
	}


	public WebElement getWork_Schedule_Module() {
		return Beauty_Module;
	}


	
	
	
	
	
	
	
   //operational 
	
	public void click_on_Men_Module()
	{
		Men_Module.click();
	}
	
	public void click_on_Women_Module()
	{
		Women_Module.click();
	}

	public void click_on_Elecronics_Module()
	{
		Electronics_Module.click();
	}
	

	
	public void click_on_Beauty_Module()
	{
		Beauty_Module.click();
	}
	
	
	}


