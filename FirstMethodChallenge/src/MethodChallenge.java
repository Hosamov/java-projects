public class MethodChallenge {
  public static void main(String[] args) {
    displayHighScorePosition("Matt", calculateHighScorePosition(1500));
    displayHighScorePosition("Jack", calculateHighScorePosition(999));
    displayHighScorePosition("John", calculateHighScorePosition(499));
    displayHighScorePosition("Amos", calculateHighScorePosition(99));
    displayHighScorePosition("Rick", calculateHighScorePosition(-100));
    
  }

  public static void displayHighScorePosition(String playerName, int highScorePosition) {
    System.out.println(playerName + " managed to get into position " 
            + highScorePosition + " on the high score list.");
  }

  public static int calculateHighScorePosition(int playerScore) {
    int position = 4;
    if (playerScore >= 1000) {
      position = 1;
    } else if (playerScore >= 500) {
      position = 2;
    } else if (playerScore >= 100) {
      position = 3;
    }

    return position;
  }
}
