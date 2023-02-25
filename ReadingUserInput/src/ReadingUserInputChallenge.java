import java.util.Scanner;
public class ReadingUserInputChallenge {
  public static void main(String[] args) {
    System.out.println(getInputFromScanner());
  }

  //* Reading User Input Challenge
  // Read 5 valid numbers from the console, entered by user, and print sum of
  // the 5 numbers.
  // Check if numbers are valid ints, if not, print "Invalid Number", continue
  // looping.
  
  public static int getInputFromScanner() {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    boolean validNumber = false;

    do {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Enter number #" + i);
        try {
          num += Integer.parseInt(scanner.nextLine());
        } catch(NumberFormatException e) {
          System.out.println("Invalid Number");
          i = i-1; // revert to previous increment
        }
        validNumber = i >= 5 ? true : false;
      }
    } while (!validNumber);

    return num;
  }

}
