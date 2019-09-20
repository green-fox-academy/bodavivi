import java.util.ArrayList;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        System.out.println("How many numbers do you wanna add?");
        Scanner scanner = new Scanner(System.in);
        int numberOfArrey = scanner.nextInt();

        System.out.println("What r the numbers?");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int addedNumber = 0;
        int n = 0;
        for (int i = 0; i < numberOfArrey; i++) {
            Scanner scanner2 = new Scanner(System.in);
            addedNumber = scanner2.nextInt();
            for (int j = 0; j < numberOfArrey; j++) {

                if (arrayList.get(i) != arrayList.get(i)) ;
            }

        }
        for (int i = 0; i < numberOfArrey; i++) {
            for (int j = 0; j < numberOfArrey; j++) {
            }

        }

    }
}
