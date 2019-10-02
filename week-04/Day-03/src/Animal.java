public class Animal {

  int hunger;
  int thirst;

  public Animal(){
    this.hunger = 50;
    this.thirst = 50;
  }

  public int getHunger(){
    return hunger;
  }

  public int getThirst(){
    return thirst;
  }

  public void eat(){
    hunger -= 10;
  }

  public void drink(){
    thirst -= 10;
  }

  public void play(){
    hunger += 10;
    thirst += 10;
  }

}
