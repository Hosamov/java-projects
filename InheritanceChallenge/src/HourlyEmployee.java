public class HourlyEmployee extends Employee {

  private double hourlyPayRate;

  public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
    super(name, birthDate, hireDate);
    this.hourlyPayRate = hourlyPayRate;
  }

   // Override collectPay method (see Worker class)
   @Override 
   public double collectPay() {
     return 40 * hourlyPayRate;
   }

  public double getDoublePay() {
    return 2 * collectPay();
  }




}
