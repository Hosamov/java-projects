import java.util.Scanner;
public class MinAndMaxChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double max = 0;
    double min = 0;
    int loopCount = 0;

    while (true) {
      System.out.println("Enter a number, or any character to exit:");
      String nextEntry = scanner.nextLine();
      try {
        double validNum = Double.parseDouble(nextEntry);
        if(loopCount == 0 || validNum < min) {
          min = validNum;
        }
        if (loopCount == 0 || validNum > max) {
          max = validNum;
        }
        loopCount++;
      } catch (NumberFormatException nfe) {
        break;
      }
    }
    if(loopCount > 0) {
      System.out.println("The minimum number entered was: " + min);
      System.out.println("The maximum number entered was: " + max);
    } else {
      System.out.println("No valid data entered");
    }
    
  }

  // public static void main(String[] args) {
  // int minNum = 0, maxNum = 0;
  // int count = 0;
  // int num = 0;
  // boolean controller = true;

  // Scanner scanner = new Scanner(System.in);
  // System.out.println("Enter a number: ");

  // while (scanner.hasNextInt()) {
  // System.out.println("Enter a number: ");

  // if (count == 0 || num < minNum) {
  // minNum = num;
  // }
  // if (count == 0 || num > maxNum) {
  // maxNum = num;
  // }
  // count++;
  // }
  // scanner.close();

  // System.out.println(minNum + " " + maxNum);
  // }

}