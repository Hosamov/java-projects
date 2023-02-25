public class Main {
  public static void main(String[] args) {
    char letter = 'A';
    System.out.println(getLetter(letter));
  }

  public static String getLetter(char letter) { 

    switch(letter) {
      case 'A':
        return (String)"ALPHA";
      case 'B':
        return (String) "BRAVO";
      case 'C':
        return (String) "CHARLIE";
      case 'D': 
        return (String) "DELTA";
      case 'E':
        return (String) "ECHO";
      default: 
        System.out.println("No letter match found for " + letter);
        break;
    }
  }
}
