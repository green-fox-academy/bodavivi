public class Power {
  public static void main(String[] args) {
    System.out.println(baseToTheN(5, 3));

  }

  static int baseToTheN(int base, int n) {
    if (n == 0) {
      return 1;
    } else {
      return base * baseToTheN(base, n-1);
    }
  }
}
