import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Please type an integer!");
        Scanner integer = new Scanner(System.in);

        boolean a = ((integer.nextInt()) % 2 == 0);
        if (a) {
            System.out.println("This number is odd.");
        }
        else {
            System.out.println("This number is even.");
        }
    }
}
