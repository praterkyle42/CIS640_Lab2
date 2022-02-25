/*
Class Name: EmployeeDA
Author: Kyle Prater
Description: This is the data access layer for the employee classes. It contains methods to initialize an array list of employees
as well as add new employees to the system and search for specific employees.
 */
package Database;
import java.util.ArrayList;
import domain.Employee;
import domain.SalaryEmployee;
import domain.HourlyEmployee;
import java.lang.Object;
import java.text.Format;
import java.text.NumberFormat;

public class EmployeeDA {
     private static ArrayList<Employee> employees = new ArrayList<Employee>(); 

  //This method adds a specific employee to the ArrayList
  public static void add(Employee em) {
    employees.add(em);
  }
  
  
  public static void initialize() {
  //Set up new employee    
    SalaryEmployee e = new SalaryEmployee();
    e.setEmployeeID(10001); 
    e.setFirstName("Bob");
    e.setLastName("Smith"); 
    e.setSSNumber(123333444);
    e.setAnnualSalary(55000);
    e.setUserID("User1");
    e.setPassword("user1");
    //add employee to the ArrayList
    employees.add(e);
    
    //Set up new employee
    SalaryEmployee f = new SalaryEmployee();
    f.setEmployeeID(10002);
    f.setFirstName("Kyle");
    f.setLastName("Prater");
    f.setSSNumber(293091847);
    f.setAnnualSalary(60000);
    
    //add employee to the ArrayList
    employees.add(f);
    
    //Set up new employee
    HourlyEmployee a = new HourlyEmployee(); 
    a.setEmployeeID(10003); 
    a.setFirstName("Freddie");
    a.setLastName("Hernandez");
    a.setSSNumber(193390483); 
    a.setHourlyRate(15.00);
    a.setOvertimeRate(a.getHourlyRate() * 1.5);
    
    //add employee to the ArrayList
    employees.add(a);
    
    //Set up new employee
    HourlyEmployee b = new HourlyEmployee();
    b.setEmployeeID(10004); 
    b.setFirstName("Dane"); 
    b.setLastName("Thompson");
    b.setSSNumber(495833938);
    b.setHourlyRate(17.00); 
    b.setOvertimeRate(a.getHourlyRate() * 1.5);
    
    //add employee to the ArrayList
    employees.add(b);
  }
  
  //This method returns all of the employees that are created when the Data Access class is created so that they can be added
  //to an array and accessed from other classes
  public static ArrayList<Employee> getAll() {
    return employees;
  }

  //This method takes a customerID as an input and searches the ArrayList of employees for an id that matches it. 
  public static Employee find(int customerId) {
      //loop through each employee
      for(int i = 0; i < employees.size(); i++) {
          //check to see if the ID matches and return the employee if it does
          if(customerId == employees.get(i).getEmployeeID()) {
              return employees.get(i);
          }
      }
      //Return nothing if there is no match
      return null;
  }
}
