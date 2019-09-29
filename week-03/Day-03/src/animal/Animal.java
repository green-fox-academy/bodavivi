package animal;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat(){
    hunger-= 10;
  }

  public void drink(){
    thirst-= 10;
  }

  public void play(){
    thirst+= 10;
    hunger+= 10;
  }

}
