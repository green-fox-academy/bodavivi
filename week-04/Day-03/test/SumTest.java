import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void add_MultipleElements(){
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3));
    Sum tester = new Sum();
    int result = tester.add(test);
    assertEquals(6, result);
  }

  @Test
  public void add_Zero(){
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList());
    Sum tester = new Sum();
    int result = tester.add(test);
    assertEquals(0, result);
  }

  @Test
  public void add_oneElement(){
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1));
    Sum tester = new Sum();
    int result = tester.add(test);
    assertEquals(1, result);
  }

  @Test
  public void add_Null(){
    ArrayList<Integer> test = null;
    Sum tester = new Sum();
    Integer result = tester.add(test);
    assertEquals(null, result);
  }




}