public class GreatestCommonDivisor {
  public static void main(String[] args) {
    System.out.println(getGreatestCommonDivisor(25, 15));
  }

  // Find greatest common divisor, using two ints:
  public static int getGreatestCommonDivisor(int first, int second) {
    if(first < 10 || second < 10) {
      return -1;
    }

    int divisor = 0;
    // Note: Using Math.min() to find lowest int
    for (int i = Math.min(first, second); i > 1; i--) {
      if (first % i == 0 && second % i == 0) {
        return divisor = i;
      }
    }

    return -1;
  }
}