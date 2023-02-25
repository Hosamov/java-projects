public class Main {
  public static void main(String[] args) {
    //! Wrong way of doing it (commented out):
    // Player player = new Player();
    // player.name = "Tim"; // can do this because fields in Player are public
    // player.health = 20;
    // player.weapon = "Sword";

    // int damage = 10;
    // player.loseHealth(damage);
    // System.out.println("Remaining health = " + player.healthRemaining()); 
    // player.health = 200;
    // player.loseHealth(11);
    // System.out.println("Remaining health = " + player.healthRemaining());

    EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
    System.out.println("Initial health is " + tim.healthRemaining());
  }
}
