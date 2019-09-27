public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(adder(5));

  }

  static int adder (int n){
    if (n == 1){
      return 1;
    }
    else{
      return n + adder(n - 1);
    }
  }
}
