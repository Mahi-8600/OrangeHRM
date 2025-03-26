package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_dashboard_page 
{
	@FindBy(xpath = "//span[text()='PIM']") private WebElement PIM;
	@FindBy(xpath = "//a[text()='Add Employee']") private WebElement addEmployee;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;

	public HRM_dashboard_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnPIM() 
	{
		PIM.click();
	}
	public void ClickOnAddEmployee() 
	{
		addEmployee.click();
	}
}
