package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFBPage {
	
	//Declaration
	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(name="pass")
	private WebElement passwordTF;
	
	@FindBy(name="login")
	private WebElement loginBTN;
	
	@FindBy(linkText = "Forgotten password?")
	private WebElement forgotPWDlink;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createAccountLink;
	
	
	//initialization
	public LoginFBPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public void setEmail(String email)
	{
		emailTF.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		passwordTF.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		loginBTN.click();
	}
	public void clickforgotPWD()
	{
		forgotPWDlink.click();
	}
	
	public void clickcreateAccount()
	{
		createAccountLink.click();
		
	}
	
	
	
}
