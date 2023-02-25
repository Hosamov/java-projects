public class SumThreeAndFive {
  // Create a for loop using ar ange of numbers from 1 to 1000 inclusive
  // Sum all the numbers that can be divided by both 3 and 5
  // Print out the numbers that have met the above conditions
  // Break out of the loop once you have found 5 numbers that met the conditions
  // After breaking out of the loop, print the usm of the numbers thatmet the conditions
  // Note: type all code in the main method 
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

     for(int i = 1; i <= 1000; i++) {
      if(i % 3 == 0 && i % 5 == 0) {
        System.out.println(i);
        count++;
        sum += i;
      }

      if (count == 5) {
        break;
      }
    }

    System.out.println(sum);
  }
}
