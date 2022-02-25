/*
Class Name: Hourly Employee
Author: Kyle Prater
Description: This is the subclass of the Employee class that defines an hourly employee. 
It includes hourly and overtime rate of the employee and get and set methods for these attributes.
*/

package domain;
import java.text.NumberFormat;

public class HourlyEmployee extends Employee {

  NumberFormat currency = NumberFormat.getCurrencyInstance();
  private double hourlyRate; 
  private double overtimeRate;

  //get and set methods
  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hRate) {
    this.hourlyRate = hRate;
  }

  public double getOvertimeRate() {
    return overtimeRate;
  }

  public void setOvertimeRate(double oRate) {
    this.overtimeRate = oRate;
  }
  
  //This methods overrides the toString method in the parent class to show the information about each hourly employee
  @Override 
  public String toString() {
    return super.getEmployeeID() + " " + super.getFirstName() + " " + super.getLastName() + "\n Hourly Rate: " + currency.format(hourlyRate) + "\n Overtime Rate: " + currency.format(overtimeRate) + "\n";
  }
}

