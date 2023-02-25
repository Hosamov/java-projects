public class TeenNumberChecker {
  public static void main(String[] args) {
    System.out.println(hasTeen(12, 20, 22));
    System.out.println(isTeen(13));
  }

  public static boolean hasTeen(int a, int b, int c) {
    return (isTeen(a) || isTeen(b) || isTeen(c));
  }

  public static boolean isTeen(int age) {
    return (age >= 13 && age <= 19);
  }
}
