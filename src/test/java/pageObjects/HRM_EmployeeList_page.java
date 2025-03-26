package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_EmployeeList_page 
{
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") private WebElement EmpName;
	@FindBy(xpath = "//button[text()=' Search ']") private WebElement SearchButton;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;

	public HRM_EmployeeList_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmpName(String empName) 
	{
		EmpName.sendKeys(empName);
	}
	public void ClickOnSearchButton() 
	{
		SearchButton.click();
	}
}
