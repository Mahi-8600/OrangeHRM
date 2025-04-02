package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class HRM_EmployeeList_page 
{
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") private WebElement EmpName;
	@FindBy(xpath = "//button[text()=' Search ']") private WebElement SearchButton;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath = "(//div[@role='table']//div[@class='oxd-table-body']//div[@role='row']//div[@role='cell'])[3]") private WebElement empNameFromTable;

	
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
	public String getEmpNameFromTable(WebDriver driver) throws InterruptedException, IOException 
	{
		Utility.scrollByElement(driver, empNameFromTable);
		Utility.highlightObject(driver, empNameFromTable);
		Thread.sleep(3000);
		Utility.screenshot(driver, "EmpValidation");
		String name = empNameFromTable.getText();
		Utility.deHighlightObject(driver, empNameFromTable);
		return name;
	}
}
