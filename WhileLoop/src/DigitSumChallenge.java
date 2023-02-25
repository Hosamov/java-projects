package WhileLoop.src;

public class DigitSumChallenge {
  public static void main(String[] args) {
    System.out.println(sumDigits(1234));
    System.out.println(sumDigits(-125));
    System.out.println(sumDigits(4));
    System.out.println(sumDigits(32123));
  }

  public static int sumDigits(int number) {
    if (number < 1) {
      return -1;
    }
    
    int sum = 0;
  
    while (number > 9){
      sum += (number % 10); // Add the last digit to the sum
      number = number / 10; // Drop the last digit to reiterate
    }

    sum += number;
    return sum;
  }
}
