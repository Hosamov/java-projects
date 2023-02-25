public class EqualSumChecker {
  public static void main(String[] args) {
    System.out.println(hasEqualSum(1, 2, 4));
  }

  public static boolean hasEqualSum(int a, int b, int c) {
    boolean isEqualToC = (a + b == c);
    return isEqualToC;
  }
}
