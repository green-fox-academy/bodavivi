package animal;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  /*public Animal(int hunger, int thirst){
    this.hunger = 50 + hunger;
    this.thirst = 50 + thirst;
  }*/

  public void eat(){
    hunger+= 1;
  }

  public void drink(){
    thirst+= 1;
  }

  public void play(){
    thirst+= 1;
    hunger+= 1;
  }

}
