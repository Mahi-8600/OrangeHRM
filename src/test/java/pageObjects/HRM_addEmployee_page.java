package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_addEmployee_page 
{
	@FindBy(xpath = "//input[@name='firstName']") private WebElement firstName;
	@FindBy(xpath = "//input[@name='middleName']") private WebElement middleName;
	@FindBy(xpath = "//input[@name='lastName']") private WebElement lastName;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") private WebElement empID;

	@FindBy(xpath = "//button[@type='submit']") private WebElement saveButton;

	public HRM_addEmployee_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterFirstName(String FirstName) 
	{
		firstName.sendKeys(FirstName);
	}
	public void EnterMiddleName(String MiddleName) 
	{
		middleName.sendKeys(MiddleName);
	}
	public void EnterLastName(String LastName) 
	{
		lastName.sendKeys(LastName);
	}
	public void EnterEmpID() throws InterruptedException 
	{
//		Thread.sleep(3000);
//		empID.clear();
		Thread.sleep(5000);
		empID.sendKeys("126");
//		String ID=empID.getText();
//		System.out.println("--->"+ID);
//		return ID;
	}
	public void ClickOnSaveButton() throws InterruptedException 
	{
		saveButton.click();
		Thread.sleep(5000);
		String ID=empID.getText();
		System.out.println("--->"+ID);
		Thread.sleep(5000);
	}
}
