public class Bunnies {
  public static void main(String[] args) {
    System.out.println(numberOfEars(5));

  }

  static int numberOfEars(int bunnie){
    if (bunnie == 0) {
      return 0;
    }
    else{
      return 2 + numberOfEars(bunnie-1);
    }
  }


}
