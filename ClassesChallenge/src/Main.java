public class Main {
  public static void main(String[] args) {
    // Account bobsAccount = new Account("12345", 500, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
   
    Account bobsAccount = new Account();
    System.out.println(bobsAccount.getNumber());
    System.out.println(bobsAccount.getBalance());
    
    // bobsAccount.setNumber("12345");
    // bobsAccount.setBalance(1000.00);
    // bobsAccount.setCustomerName("Matt Brown");
    // bobsAccount.setEmail("myemail@matt.com");
    // bobsAccount.setEmail("(087) 123-4567");
    
    bobsAccount.withdraw(100);
    bobsAccount.deposit(250);
    bobsAccount.withdraw(50);
    
    bobsAccount.withdraw(200);
    
    bobsAccount.deposit(100);
    bobsAccount.withdraw(45.55);
    bobsAccount.withdraw(54.56);

    bobsAccount.withdraw(54.45);

    Account timsAccount = new Account("Tim", "time@email.com", "12345");
    System.out.println("AccountNo: " + timsAccount.getNumber() +
    "; name " + timsAccount.getCustomerName());

  }

}
