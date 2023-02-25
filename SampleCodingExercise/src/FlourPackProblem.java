public class FlourPackProblem {
  public static void main(String[] args) {
    System.out.println(canPack(2, 2, 11));
  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    }
    // bigCount = big flour bags (5 kilos each)
    // smallCount = small flour bags (1 kilo each)
    // goal = amount of kilos of flour needed to assemble a package
    System.out.println(goal % 5);
    if (bigCount * 5 + smallCount < goal) {
      return false;
    }
    // Calculate whether there is a remainder, then whether smallCount adds up
    // to the goal (after bigCount is calculated)
    return (goal % 5 <= smallCount);
  }
}
