import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.
        // - Create a function called `factorio`
        //   that returns it's input's factorial
        System.out.println("Please, add a number!");
        Scanner scanner = new Scanner (System.in);
        int input = scanner.nextInt();

        factorio(input);
    }
    public static int factorio (int input){
        int a = 1;

        for (int i = 1; i <=input ; i++) {
            a= a * i;

        }
        System.out.println(a);

        return a;
    }
}