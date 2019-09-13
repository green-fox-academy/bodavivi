import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.println("Please type an integer!");
        Scanner integer = new Scanner(System.in);
        int addedNumber = integer.nextInt();

        if (addedNumber <= 0) {
            System.out.println("Not enough!");
        }
        else if (addedNumber == 1) {
            System.out.println("One");
        }
        else if (addedNumber == 2) {
            System.out.println("Two");
        }
        else if (addedNumber >= 2) {
            System.out.println("A lot");
        }
    }
}
