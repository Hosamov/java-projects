public class Main {
  public static void main(String[] args) {
    Customer matt = new Customer("Matt", 2500, "matt@email.com");
    System.out.println(matt.getName() + " " + matt.getCreditLimit() + " " + matt.getEmailAddress());
    Customer mike = new Customer();
    System.out.println(mike.getName() + " " + mike.getCreditLimit() + " " + mike.getEmailAddress());
    Customer natali = new Customer("Natali", "natali@gmail.com");
    System.out.println(natali.getName() + " " + natali.getCreditLimit() + " " + natali.getEmailAddress());
  }
}
