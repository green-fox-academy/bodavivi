import org.junit.Test;

import static org.junit.Assert.*;

public class appleTest {

  @Test
  public void returnStringApple(){
    Apple newString = new Apple();
    String sth = "apple";
    assertEquals("apple", sth);
  }

  @Test
  public void returnStringPear(){
    Apple newString = new Apple();
    String sth = "pear";
    assertEquals("apple", sth);
  }

}