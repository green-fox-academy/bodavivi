import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  @Test
  public void fibonacciCounter_moreThanOneIndex(){
    Fibonacci testing = new Fibonacci();
    int result = testing.fibonacciCounter(3);
    assertEquals(2, result);
  }

  @Test
  public void fibonacciCounter_One(){
    Fibonacci testing = new Fibonacci();
    int result = testing.fibonacciCounter(1);
    assertEquals(1, result);
  }

  @Test
  public void fibonacciCounter_0(){
    Fibonacci testing = new Fibonacci();
    int result = testing.fibonacciCounter(0);
    assertEquals(0, result);
  }


}