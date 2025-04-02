Feature: PIM
Scenario: Add emp
Given Launch URL
When Login to HRM
When Navigate to Add Employee
And Add emp Details
And Save emp
And Navigate to PIM emp list
And Search emp by emp ID
Then Validate Emp is created

#Scenario: Add emp with address
#Given Launch URL
#When Login to HRM
#When Navigate to Add Employee
#And Add emp Details
#And Add address
#And Save emp
#And Navigate to PIM emp list
#And Search emp by emp ID
#Then Validate Emp is created with address