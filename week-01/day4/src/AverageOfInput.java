import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Please write 5 integers in a row!");
        Scanner integer_1 = new Scanner(System.in);
        Scanner integer_2 = new Scanner(System.in);
        Scanner integer_3 = new Scanner(System.in);
        Scanner integer_4 = new Scanner(System.in);
        Scanner integer_5 = new Scanner(System.in);

        int int1 = integer_1.nextInt();
        int int2 = integer_2.nextInt();
        int int3 = integer_3.nextInt();
        int int4 = integer_4.nextInt();
        int int5 = integer_5.nextInt();

        int sum = (int1 + int2 + int3 + int4 + int5);



        double average = (double)sum / 5;

        System.out.println("The asked numbers sum is " + sum +" and the average is " +average +".");



    }
}
