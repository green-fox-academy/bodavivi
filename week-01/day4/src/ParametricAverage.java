import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("Please add a number!");
        Scanner scanned = new Scanner(System.in);
        int num = scanned.nextInt();
        int c = 0;

        for (int i = 1; i <= num; i++){
            System.out.println("Please add the " + i + ". number.");
            Scanner scannednum1 = new Scanner(System.in);
            int number = scannednum1.nextInt();
            c =  c + number;
            }
        System.out.println("Your typed numbers sum is:" +c);
        double d = c / (double)num;
        System.out.println("And their average is " +d);






    }
}
