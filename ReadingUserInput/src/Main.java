import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int currentYear = 2023;
    try {
      System.out.println(getInputFromScanner(currentYear));
    } catch (NullPointerException e) {
      System.out.println(getInputFromConsole(currentYear));
    }

    // String usersDateOfBirth = "1958";
    // int dateOfBirth = Integer.parseInt(usersDateOfBirth);

    // System.out.println("Age = " + (currentYear - dateOfBirth));

    // String usersAgeWithPartialYear = "22.5";
    // double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
    // System.out.println("The user says he's " + ageWithPartialYear);
  }

  public static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("Hi, What's your name? ");
    System.out.println("Hi " + name + ", Thanks for taking the course!");

    String dateOfBirth = System.console().readLine("What year were you born? ");
    int age = currentYear - Integer.parseInt(dateOfBirth);

    return "So you are " + age + " years old this year!";
  }

  public static String getInputFromScanner(int currentYear) {
    Scanner scanner = new Scanner(System.in);

    // String name = System.console().readLine("Hi, What's your name? ");
    System.out.println("Hi, What's your name? ");
    String name = scanner.nextLine();

    System.out.println("Hi " + name + ", Thanks for taking the course!");

    // String dateOfBirth = System.console().readLine("What year were you born?
    // ");
    System.out.println("What year were your born? ");

    boolean validDOB = false;
    int age = 0;

    do {
      System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
      try {
        age = checkData(currentYear, scanner.nextLine());
        validDOB = age < 0 ? false: true;
      } catch (NumberFormatException badUserData) {
        System.out.println("Characters not allowed!!! Try again.");
      }
      
    } while (!validDOB);
    

    return "So you are " + age + " years old this year!";
  }

  public static int checkData(int currentYear, String dateOfBirth) {
    int dob = Integer.parseInt(dateOfBirth);
    int minimumYear = currentYear - 125;

    if ((dob < minimumYear) || (dob > currentYear)) {
      return -1;
    }

    return (currentYear - dob);
  }
}
