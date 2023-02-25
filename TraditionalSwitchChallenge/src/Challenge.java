public class Challenge {
  public static void main(String[] args) {
    char letter = 'E';
    System.out.println(getLetter(letter));
  }

  public static String getLetter(char letter) { 
    switch(letter) {
      case 'A':
        return "A = ALPHA";
      case 'B':
        return "B = BRAVO";
      case 'C':
        return "C = CHARLIE";
      case 'D': 
        return "D =DELTA";
      case 'E':
        return "E = ECHO";
      default: 
        return (letter + " Not found.");
    }
  }
}
