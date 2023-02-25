public class DecimalComparitor {
  public static void main(String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
  }

  public static boolean areEqualByThreeDecimalPlaces(double decimalOne, double decimalTwo) {
    int checkOne = (int) (decimalOne * 1000);
    int checkTwo = (int) (decimalTwo * 1000);

    return checkOne == checkTwo;
  }
}
