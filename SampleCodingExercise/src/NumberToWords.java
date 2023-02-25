public class NumberToWords {
  public static void main(String[] args) {
    numberToWords(-12);
    // System.out.println(reverse(1234));
    // System.out.println(getDigitCount(5200));
  }

  // Convert number (digits) to word
  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
    }

    int count = getDigitCount(number);
    number = reverse(number);

    for (int i=0; i<count; i++) {
      int lastNum = number % 10;
      switch(lastNum) {
        case 0: 
          System.out.print("Zero ");
          break;
        case 1: 
          System.out.print("One ");
          break;
        case 2: 
          System.out.print("Two ");
          break;
        case 3: 
          System.out.print("Three ");
          break;
        case 4: 
          System.out.print("Four ");
          break;
        case 5: 
          System.out.print("Five ");
          break;
        case 6: 
          System.out.print("Six ");
          break;
        case 7: 
          System.out.print("Seven ");
          break;
        case 8: 
          System.out.print("Eight ");
          break;
        case 9: 
          System.out.print("Nine ");
          break;
      }
  
      number /= 10;
    }
  }

  public static int reverse(int number) {
    // int reversedNumber = 0;
    int reversedNum = 0;
  
    while(number != 0) {
      reversedNum = (reversedNum * 10) + number % 10;
      number /= 10;
    }
    // System.out.println(lastNum);
    return reversedNum;
  }

  public static int getDigitCount(int number) {
    if (number < 0) {
      return -1;
    }
    int count = 0;

    if(number == 0) {
      count = 1;
    }

    while(number > 0) {
      count++;
      number /= 10;
    }

    return count;
  }
}
