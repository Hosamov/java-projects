public class Main {
  public static void main(String[] args) {
    int myVariable = 50; // Expression

    myVariable++; // Expression
    myVariable--; // Expression

    System.out.println("This is a test"); // Statement

    // Statement over multiple lines:
    System.out.println("This is" +
        " another" +
        " still more."); // end w/ semi-colon

    // Three statements on one line:
    int anotherVariable = 50;
    myVariable--;
    System.out.println("myVariable = " + myVariable);

    if (myVariable == 0) {
      System.out.println("It's now zero");
    }
  }
}
