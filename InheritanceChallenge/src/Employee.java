public class Employee extends Worker {
  
  private long employeeId;
  private String hireDate;

  private static int employeeNo = 1; // set initial employee number to 1

  public Employee(String name, String birthDate, String hireDate) {
    super(name, birthDate);
    this.employeeId = Employee.employeeNo++; // Increment employee number by 1
    this.hireDate = hireDate;
  }

  @Override
  public String toString() {
    return "Employee{" +
      " employeeId='" + employeeId  +
      ", hireDate='" + hireDate + "\'" +
      "}" + super.toString();
  }

}
