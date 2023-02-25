public class LastDigitChecker {
  public static void main(String[] args) {
     System.out.println(hasSameLastDigit(121, 110, 133));
  }

  // Check if at least 2 num params share the same rightmost digit:
  public static boolean hasSameLastDigit(int num1, int num2, int num3) {
    if (isValid(num1) && isValid(num2) && isValid(num3)) {
      return (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10);
    }
    return false;
  }

  public static boolean isValid(int num) {
    if(num >= 10 && num <= 1000) {
      return true;
    }

    return false;
  }
}
