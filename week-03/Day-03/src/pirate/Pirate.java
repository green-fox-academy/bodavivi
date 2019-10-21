package pirate;

public class Pirate {
  String type;
  private int rumDrinkingCounter;

  public Pirate(String type){
    this.type = type;
  }

  public Pirate(){

  }
  public void drinkSomeRum(){
    //intoxicates the Pirate some
    rumDrinkingCounter ++;

  }

  public void howsItGoingMate(){
    if (rumDrinkingCounter < 5){
      System.out.println("Pour me anudder!");
    }else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }

  public int getRumDrinkingCounter() {
    return rumDrinkingCounter;
  }

  public void setRumDrinkingCounter(int rumDrinkingCounter) {
    this.rumDrinkingCounter = rumDrinkingCounter;
  }
}
