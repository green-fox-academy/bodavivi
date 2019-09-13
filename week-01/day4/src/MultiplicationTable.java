import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Please add a number!");
        Scanner number = new Scanner(System.in);
        int addedNumber = number.nextInt();

        int b;

        for (int i = 1; i < 11; i++) {
            b = addedNumber*i;
            System.out.println(+i +"*" +addedNumber +"=" +b);
            ;
        }
    }
}
