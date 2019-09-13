
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Write a number here!");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
