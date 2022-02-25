/*
Class Name: SalaryEmployee
Author: Kyle Prater 
Description: This is the subclass of the Employee class that defines an employee that gets paid 
with a salary. It contains the annual sallary attribute for each employee and the methods to get and set 
the salary
*/

package domain;
import java.text.NumberFormat;

public class SalaryEmployee extends Employee {
   private double annualSalary; 
   NumberFormat currency = NumberFormat.getCurrencyInstance();
   
 //get and set methods
  public double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(double salary) {
    this.annualSalary = salary;
  }

  //This method overrides the toString method in the Employee class in order to show information about each Salary Employee
  @Override
  public String toString() {
    return super.getEmployeeID() + " " + super.getFirstName() + " " + super.getLastName() + " " + currency.format(annualSalary) + "\n";

    
  }
}