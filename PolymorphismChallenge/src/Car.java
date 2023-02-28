public class Car {

  private String description;

  public Car(String description) {
    this.description = description;
  }

  public void startEngine() {
    System.out.println("Car -> startEngine");
  }

  protected void runEngine() {
    System.out.println("Car -> runEngine");
  }

  public void drive() {
    System.out.println("Car -> driving, type is " + getClass().getSimpleName());
    runEngine();
  }  
}

class GasPoweredCar extends Car {
  
  private double avgKmPerLitre;
  private int cylinders = 6;

  public GasPoweredCar(String description) {
    super(description);
  }

  public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  @Override
  public void startEngine() {
    System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
  }
}

class ElectricCar extends Car {

  private double avgKmPerCharge;
  private int batterySize = 6;

  public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
    super(description);
    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }

  @Override
  public void startEngine() {
    System.out.printf("BEV -> Switch %d kWh battery on, Ready!%n", batterySize);
  }

  @Override
  protected void runEngine() {
    System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
  }
}

class HybridCar extends Car {
  private double avgKmPerLitre;
  private int batterySize;
  private int cylinders;

  public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
    this.batterySize = batterySize;
  }

  @Override
  public void startEngine() {
    System.out.printf("Hybrid -> Cylinders are fired up.%n", cylinders);
    System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLitre);
  }
}
