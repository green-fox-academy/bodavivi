import java.util.Scanner;

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
public class DivideByZero {
  public static void main(String[] args) {
    System.out.println("Please write a number!");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    divide(number);

  }
  public static void  divide (int divider){
    try{
      int result = 10/divider;
      System.out.println(result);
    }catch(ArithmeticException e){
      System.out.println("You can't divide with 0.");
      e.printStackTrace();
    }
  }
}
