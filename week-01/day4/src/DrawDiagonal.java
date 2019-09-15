import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("I draw you a super sexy diagonal!");
        System.out.println("But first, how long should be the sides? (Pls write a number!)");
        Scanner addedNumber = new Scanner(System.in);
        int number = addedNumber.nextInt();
        for (int f = 1; f <= number; f++) {
            System.out.print("♥");
        }
        System.out.println();
        for (int i = 1; i <= (number - 2); i++) {
            System.out.print("♥");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("♥");
            for (int k = 1; k < number - 1 - i; k++) {
                System.out.print(" ");
            }
            System.out.print("♥");
            System.out.println();

        }
        for (int f = 1; f <= number; f++) {
            System.out.print("♥");}
    }
}