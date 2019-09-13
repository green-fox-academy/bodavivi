import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Write two numbers, please!");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        if (number2 <= number1) {
            System.out.println("The second number should be bigger");
        }
        else {
            for (int i = number1; i <= number2; i++){
                System.out.println(i);
            }
        }


    }
}
