package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_login_page 
{
	@FindBy(xpath = "//input[@name='username']") private WebElement userName;
	@FindBy(xpath = "//input[@name='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;

	public HRM_login_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName() 
	{
		userName.sendKeys("Admin");
	}
	public void EnterPassword() 
	{
		password.sendKeys("admin123");
	}
	public void ClickOnLogin() 
	{
		loginButton.click();
	}
}
