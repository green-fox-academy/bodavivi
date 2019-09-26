package petrolstation;

public class Station {
  int gasAmount;

  Station(){
    gasAmount = 200;
  }

  public static void main(String[] args) {
    Car audiTT = new Car();
    Station mol = new Station();

    mol.refill(audiTT);
  }

  public void refill(Car car){
    car.gasAmount+=gasAmount;
    gasAmount = gasAmount - car.capacity;

  }
}
