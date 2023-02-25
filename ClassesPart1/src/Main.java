public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.setMake("Porsche");
    car.setModel("Carrera");
    car.setColor("Red");
    car.setDoors(2);
    car.setConvertible(true);

    System.out.println("Make = " + car.getMake()); // using getter method, defined in Car.java
    System.out.println("Model = " + car.getModel()); 
    car.describeCar();

    Car targa = new Car();
    targa.setMake("Porsche");
    targa.setModel("Targa");
    targa.setColor("Red");
    targa.setDoors(2);
    targa.setConvertible(false);
    
    targa.describeCar();
  }
}
