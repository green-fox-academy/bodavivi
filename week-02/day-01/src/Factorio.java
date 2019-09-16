//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
import java.util.Scanner;
public class Factorio{
    public static void main(String[] args) {
        System.out.println("Please add a number!");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int factorial = factorio(num);
        System.out.println(factorial);
    }
    public static int factorio(int fact){
        int a = 1;
        for (int i = 1; i <= fact ; i++) {
            a = a * i;

        }
        return a;
    }
}