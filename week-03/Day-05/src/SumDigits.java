public class SumDigits {
  public static void main(String[] args) {
    System.out.println(sum(126));
  }

  static int sum (int n){
    if (n == 0){
      return 0;
    }
    else{
      return n % 10 + sum(((n -(n % 10))/10));
    }
  }
}
