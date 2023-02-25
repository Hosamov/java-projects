import java.util.Scanner;
public class InputCalculator {
  public static void main(String[] args) {
    inputThenPrintSumAndAverage();
  }

  public static void inputThenPrintSumAndAverage() {
    Scanner scanner = new Scanner(System.in);
    int count = 0; // for tracking numbers to calculate average
    int sum = 0; // total sum
    // System.out.println("Enter a number, or any character to exit:");

    while(scanner.hasNextInt()) {
      sum += scanner.nextInt();
      count++;
    }
    
    System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum / count));
    scanner.close();
  }
}
