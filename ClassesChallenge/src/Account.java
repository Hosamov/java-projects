public class Account {

  private String number = "";
  private double balance = 0.00;
  private String customerName = "Doe, John";
  private String email = "";
  private String phone = "";

  public Account() {
    // Constructor chaining example:
    this("56789", 2.50, "Default name",
        "Default address", "Default phone");
    System.out.println("Empty constructor called");
  }

  public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
    System.out.println("Account constructor with parameters called");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    email = customerEmail;
    phone = customerPhone;
  }


  public Account(String customerName, String customerEmail, String customerPhone) {
    this("99999", 100.55, customerName, customerEmail, customerPhone);
    // this.customerName = customerName;
    // this.email = email;
    // this.phone = phone;
  }


  public void deposit(double number) {
    balance += number;
    System.out.println("Deposit of $" + number + " was made. Your new balance is $" + balance);
  }

  public void withdraw(double number) {

    if (balance - number < 0) {
      System.out.println("Insufficient funds! You only have $" + balance + " in your account.");
    } else {
      balance -= number;
      System.out.println("Withdrawal of $" + number + " processed. Remaining balance is $" + balance);
    }
  }

  // Getters:
  public String getNumber() {
    return number;
  }

  public double getBalance() {
    return balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  // Setters:
  public void setNumber(String number) {
    this.number = number;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void describeAccount() {
    System.out.println("Account #:" + number +
        " Account balance: " + balance +
        " Customer Name: " + customerName +
        " Customer Email: " + email +
        " Customer Phone: " + phone);
  }
}
