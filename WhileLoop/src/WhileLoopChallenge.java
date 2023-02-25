package WhileLoop.src;

public class WhileLoopChallenge {
  // Challenge: Display a list of odd and even numbers from 5 - 20 (inclusive)
  // Add odd numbers, add even numbers
  // Break from while loop when there are 5 even numbers found
  // Display how many odd and even numbers were recorded.
  public static void main(String[] args) {
    int number = 4;
    int finishedNumber = 20;
    int evenNumbers = 0;
    int oddNumbers = 0;

    while(number <= finishedNumber){
      number++;
      if(!isEvenNumber(number)) {
        oddNumbers++; //
        continue;
      }
      System.out.println("Even number: " + number);
      evenNumbers++;
      if(evenNumbers >= 5) {
        break;
      }
    }

    System.out.println("Total odd numbers found = " + oddNumbers);
    System.out.println("Total even numbers found = " + evenNumbers);
  }

  public static boolean isEvenNumber(int number) {
    if ((number % 2) == 0) {
      return true;
    } else {
      return false;
    }
  }
}
