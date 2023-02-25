public class AllFactors {
  public static void main(String[] args) {
    printFactors(10);
  } 
  
  // Print out all factors for the given number param
  // Note: A factor of a number is an integer which divides that number wholly
  // (i.e. without leaving a remainder). For example, 3 is a factor of 6 because
  // 3 fully divides 6 without leaving a remainder.
  public static void printFactors(int number) {
    if (number < 1) {
      System.out.println("Invalid Value");
    }

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }

  }
}
