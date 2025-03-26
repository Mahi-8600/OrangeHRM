package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import pageObjects.HRM_EmployeeList_page;
import pageObjects.HRM_addEmployee_page;
import pageObjects.HRM_dashboard_page;
import pageObjects.HRM_login_page;

public class AddEmpSteps extends HRM_BaseClass
{
	HRM_login_page login_page;
	HRM_dashboard_page dashboard_page;
	HRM_addEmployee_page addEmployee_page;
	HRM_EmployeeList_page employeeList_page;
	static String FN;

	@Given("Launch URL")
	public void launch_url() throws InterruptedException 
	{
		LaunchURL(); 
		Thread.sleep(3000);
		login_page=new HRM_login_page(driver);
		dashboard_page=new HRM_dashboard_page(driver);
		addEmployee_page=new HRM_addEmployee_page(driver);
		employeeList_page=new HRM_EmployeeList_page(driver);
	}	
	@When("Login to HRM")
	public void login_to_hrm() 
	{
		login_page.EnterUserName();
		login_page.EnterPassword();
		login_page.ClickOnLogin();
	}

	@When("Navigate to Add Employee")
	public void navigate_to_add_employee() throws InterruptedException 
	{
		Thread.sleep(3000);
		dashboard_page.ClickOnPIM();
		Thread.sleep(1000);
		dashboard_page.ClickOnAddEmployee();
	}

	@When("Add emp Details")
	public void add_emp_details() throws InterruptedException 
	{
		Thread.sleep(3000);
		 String str=RandomString.make(5);
		 FN="Test"+str;
		addEmployee_page.EnterFirstName(FN);
		addEmployee_page.EnterMiddleName("MN");
		addEmployee_page.EnterLastName("LastName");
		addEmployee_page.EnterEmpID();
	}

	@When("Save emp")
	public void save_emp() throws InterruptedException 
	{
		addEmployee_page.ClickOnSaveButton();
	}

	@When("Navigate to PIM emp list")
	public void navigate_to_pim_emp_list() throws InterruptedException 
	{
		Thread.sleep(5000);
		dashboard_page.ClickOnPIM();
	}

	@When("Search emp by emp ID")
	public void search_emp_by_emp_id() throws InterruptedException 
	{
		Thread.sleep(5000);
		employeeList_page.enterEmpName(FN);
		Thread.sleep(3000);
		employeeList_page.ClickOnSearchButton();
		Thread.sleep(5000);
		
	}

	@Then("Validate Emp is created")
	public void validate_emp_is_created() {
	  
	}	
}
