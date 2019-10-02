public class Fibonacci {

  public int fibonacciCounter(int index) {
    int minusOne = 1;
    int minuesTwo = 0;
    int actual = 1;

    if (index == 0) {
      return minuesTwo;
    }else if (index == 1){
      return minusOne;
    }
    else {
      for (int i = 0; i < index - 2; i++) {
        minuesTwo = minusOne;
        minusOne = actual;
        actual = minuesTwo + minusOne;
      }
    }
    return actual;
  }
}
