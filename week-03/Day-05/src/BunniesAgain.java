public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(numberOfEars(5));

  }

  static int numberOfEars(int n){
    if (n == 0){
      return 0;
    }else{
      if (n % 2 != 0){
        return 2 + numberOfEars(n-1);
      }else{
        return 3 + numberOfEars(n-1);
      }
    }
  }
}
