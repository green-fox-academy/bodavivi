import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

  Animal doggie = new Animal();

  @Test
  public void getHunger_changeHunger(){
    doggie.hunger = 100;
    assertEquals(100, doggie.hunger);
  }

  @Test
  public void getThirst_changeThirst(){
    doggie.thirst = 10;
    assertEquals(10, doggie.thirst);
  }

  @Test
  public void eat(){
    doggie.eat();
    assertEquals(40, doggie.hunger);
  }

  @Test
  public void thirst(){
    doggie.drink();
    assertEquals(40, doggie.thirst);
  }

  @Test
  public void play_HungerChanging(){
    doggie.play();
    assertEquals(60, doggie.hunger);
  }

  @Test
  public void play_ThirstChanging(){
    doggie.play();
    assertEquals(60, doggie.thirst);
  }

}