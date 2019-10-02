import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CounterTest {

  @Test
  public void letterCounter_String(){
    Counter test = new Counter();
    HashMap result = test.letterCounter("madam");
    HashMap<Character, Integer> expected = new HashMap();
    expected.put('m', 2);
    expected.put('a', 2);
    expected.put('d', 1);
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