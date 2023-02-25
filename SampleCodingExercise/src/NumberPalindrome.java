public class NumberPalindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }
  // Coding exercise 16
  // Check if number is a palindrome (same backward and forward)
  public static boolean isPalindrome(int number) {
    int reverse = 0;
    int lastDigit = 0;
    int num = number;

    while(!(num == 0)) {
      lastDigit = num % 10; // Extract last digit of number param
      reverse = (reverse * 10) + lastDigit; // Increase place value, store lastDigit in that place
      num = num / 10; // Decrease number param by 1
    }

    if (reverse == number) {
      return true;
    }
    return false;
  }
}