public class MainChallenge {
  public static void main(String[] args) {

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    
    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("The high score is " + highScore);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;
    
    System.out.println("The next high score is " +
    calculateScore(gameOver, score, levelCompleted, bonus));

    displayHighScorePosition("Matt", calculateHighScorePosition(1500));
    displayHighScorePosition("Jack", calculateHighScorePosition(1000));
    displayHighScorePosition("John", calculateHighScorePosition(500));
    displayHighScorePosition("Amos", calculateHighScorePosition(100));
    displayHighScorePosition("Rick", calculateHighScorePosition(25));
    
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    int finalScore = score;

    if (gameOver) {
      finalScore += (levelCompleted * bonus);
      finalScore += 1000;
    }

    return finalScore;
  }

  public static void displayHighScorePosition(String playerName, int playerPosition) {
    System.out.println(playerName + " managed to get to position " + playerPosition + " on the high score list.");
  }

  public static int calculateHighScorePosition(int score) {
    int scorePosition;

    if (score >= 1000) {
      scorePosition = 1;
    } else if (score >= 500 && score < 1000) {
      scorePosition = 2;
    } else if (score >= 100 && score < 500) {
      scorePosition = 3;
    } else {
      scorePosition = 4;
    }
    return scorePosition; 
  }
}
