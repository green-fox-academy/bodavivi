package counter;

public class CounterMain {
  public static void main(String[] args) {
    int number = 20;

    Counter first = new Counter();

    first.add(number);
    first.add();
    first.get();
    first.reset();
  }
}
