package pirate;

public class Pirates {
  String type;
  int rumDrinkingCounter;

  public Pirates(String type){
    this.type = type;
  }

  public Pirates(){

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
}
