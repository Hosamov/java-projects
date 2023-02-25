public class SmartKitchen {

  private CoffeeMaker brewMaster;
  private Refrigerator iceBox;
  private DishWasher dishWasher;


  public SmartKitchen() {
    brewMaster = new CoffeeMaker();
    iceBox = new Refrigerator();
    dishWasher = new DishWasher();
  }

  public CoffeeMaker getBrewMaster() {
    return this.brewMaster;
  }

  public Refrigerator getIceBox() {
    return this.iceBox;
  }

  public DishWasher getDishWasher() {
    return this.dishWasher;
  }

  public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
    brewMaster.setHasWorkToDo(coffeeFlag);
    iceBox.setHasWorkToDo(fridgeFlag);
    dishWasher.setHasWorkToDo(dishWasherFlag);
  }

  public void doKitchenWork() {
    brewMaster.brewCoffee();
    iceBox.orderFood();
    dishWasher.doDishes();
  }
}

class CoffeeMaker {
  private boolean hasWorkToDo;

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void brewCoffee() {
    if(hasWorkToDo) {
      System.out.println("Brewing coffee");
      hasWorkToDo = false;
    }
  }
}

class Refrigerator {
  private boolean hasWorkToDo;

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void orderFood() {
    if(hasWorkToDo) {
      System.out.println("Ordering food");
      hasWorkToDo = false;
    }
  }
}

class DishWasher {
  private boolean hasWorkToDo;

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void doDishes() {
    if(hasWorkToDo) {
      System.out.println("Washing dishes");
      hasWorkToDo = false;
    }
  }
}
