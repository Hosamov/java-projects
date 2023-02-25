public class Customer {
  // 1. Create a new class called Customer, with three fields: name, credit
  // limit, email address
  // 2. Create the getter methods only, for each field. You dont' need to
  // create the setters
  // 3. Create three constructors for this class:
  // - First, create a a constructor for all three fields which should assign
  // the agruments directly to the instance fields.
  // - Second, create a no args constructor that calls another constructor,
  // passing some literal values for each argument.
  // - Lastly, create a constructor with just the name and email parameters,
  // wich also calls another constructor.
  String name;
  double creditLimit;
  String emailAddress;

  // Constructors:
  public Customer() {
    // 2 params because it takes the default creditLimit param from the next constructor
    this("John Doe", "john@email.com");
  }

  public Customer(String name, String email) {
    this(name, 1000, email);
  }

  public Customer(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = email;
  }

  // Getters:
  public String getName() {
    return this.name;
  }

  public double getCreditLimit() {
    return this.creditLimit;
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

}
