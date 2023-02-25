public class PerfectNumber {
  public static void main(String[] args) {
    System.out.println(isPerfectNumber(-1));
  }

  // Return boolean for determining if number is a perfect number
  // Example: isPerfectNumber(6); should return true since its proper 
  // divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
  public static boolean isPerfectNumber(int number) {
    if (number < 1) {
      return false;
    }

    int divisors = 0;
    
    for (int i = number; i >= 1; i--) {
      if (number % i == 0 && i != number) {
        divisors += i;
      }  
    }
    return (divisors == number) ? true : false;
  }
}
