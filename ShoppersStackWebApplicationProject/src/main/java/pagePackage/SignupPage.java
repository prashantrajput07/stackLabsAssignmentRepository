package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	// it is pom class
	@FindBy(id = "First Name") private WebElement FirstNameTB;
	@FindBy(id="Last Name") private WebElement LastNameTB;
	@FindBy(id="Male") private WebElement maleRadioButton;
	@FindBy(id="Phone Number") private WebElement phnoTB;
	@FindBy(id="Email Address") private WebElement emailTB;
	@FindBy(id="Password") private WebElement pwdTB;
	@FindBy(id="Confirm Password") private WebElement confirmpwdTB;
	@FindBy(id="Terms and Conditions") private WebElement T_C_checkbox;
	@FindBy(id="Register") private WebElement RegisterButton;
	
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}


	public WebElement getLastNameTB() {
		return LastNameTB;
	}


	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}


	public WebElement getPhnoTB() {
		return phnoTB;
	}


	public WebElement getEmailTB() {
		return emailTB;
	}


	public WebElement getPwdTB() {
		return pwdTB;
	}


	public WebElement getConfirmpwdTB() {
		return confirmpwdTB;
	}


	public WebElement getT_C_checkbox() {
		return T_C_checkbox;
	}


	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
	
	
	public void performRegistration(String fn,String ln,String phono,String email,String pwd)
	{
		FirstNameTB.sendKeys(fn);
		LastNameTB.sendKeys(ln);
	    maleRadioButton.click();
	    phnoTB.sendKeys(phono);
	    emailTB.sendKeys(email);
	    pwdTB.sendKeys(pwd);
	    confirmpwdTB.sendKeys(pwd);
	    
	    
	}
	
	
}
