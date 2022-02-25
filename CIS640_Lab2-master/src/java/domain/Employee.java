package domain;


public abstract class Employee {
  private int employeeID;  
  private String lastName; 
  private String firstName; 
  private long SSNumber; 
  private String userID;
  private String password;

  //Getter and setter methods
  public int getEmployeeID() {
    return employeeID;
  }
  
  public void setEmployeeID(int ID) {
    this.employeeID = ID; 
  }

  public String getLastName() {
    return lastName; 
  }

  public void setLastName(String lname) {
    this.lastName = lname;
  }

  public String getFirstName() {
    return firstName;  
  }

  public void setFirstName(String fname) {
    this.firstName = fname; 
  }

  public long getSSNumber() {
    return SSNumber;
  }

  public void setSSNumber(long ss) {
    this.SSNumber = ss;
  }

  public String getUserID() {
      return userID;
  }
  
  public void setUserID(String user) {
      this.userID = user;
  }
  
  public String getPassword() {
      return password;
  }
  
  public void setPassword(String pass) {
      this.password = pass;
  }
  //This toString method defines what an employee object looks like when printed to the console
  public String toString() {
    return employeeID + "  " + firstName + " " + lastName;
  }
  
  //Get and set methods for the child methods. The set methods return 0 because they are each set within their subclasses
  public double getAnnualSalary() {
    return 0.00;
  }

  public void setAnnualSalary(double salary) {}

  public double getHourlyRate() {
    return 0.00;
  }

  public void setHourlyRate(double hRate) {}

  public double getOvertimeRate() {
    return 0.00;
  }
  
  
}
