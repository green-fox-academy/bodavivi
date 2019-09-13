import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Write two numbers please!");
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);

        int num1 = number1.nextInt();
        int num2 = number2.nextInt();

        if (num1 > num2) {
            System.out.println(+num1 +" is bigger.");
        }
        else if (num2 > num1) {
            System.out.println(+num2 +" is bigger.");
        }
        else {
            System.out.println("The typed numbers az equal.");
        }
    }
}
