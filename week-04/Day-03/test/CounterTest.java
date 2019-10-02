import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CounterTest {

  @Test
  public void letterCounter_String(){
    Counter test = new Counter();
    HashMap result = test.letterCounter("almafa");
    HashMap<Character, Integer> expected = new HashMap();
    expected.put('a', 3);
    expected.put('l', 1);
    expected.put('m', 1);
    expected.put('f', 1);
    assertEquals(expected, result);
  }

  @Test
  public void letterCounter_Empty(){
    Counter test = new Counter();
    HashMap result = test.letterCounter("");
    HashMap<Character, Integer> expected = new HashMap();
    assertEquals(expected, result);
  }

}