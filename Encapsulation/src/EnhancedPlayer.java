public class EnhancedPlayer {
  private String fullName;
  private int healthPercentage;
  private String weapon;


  public EnhancedPlayer(String fullName) {
    this(fullName, 100, "Sword");
  }

  public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
    this.fullName = fullName;
    if(healthPercentage <= 0) {
      this.healthPercentage = 1;
    } else if (healthPercentage > 100) {
      this.healthPercentage = 100;
    } else {
      this.healthPercentage = healthPercentage;
    }
    this.weapon = weapon;
  }

  public void losehealthPercentage(int damage) {
    healthPercentage = healthPercentage - damage;
    if (healthPercentage <= 0) {
      System.out.println("Player knocked out of game");
      healthPercentage = 0;
    }
  }

  public int healthRemaining() {
    return healthPercentage;
  }

  public void restorehealthPercentage(int extrahealthPercentage) {
    healthPercentage = healthPercentage + extrahealthPercentage;
    if(healthPercentage > 100) {
      System.out.println("Player resptred to 100%");
      healthPercentage = 100;
    }
  }
}
