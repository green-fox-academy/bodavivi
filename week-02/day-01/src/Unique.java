import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        System.out.println("How many numbers do you wanna add?");
        Scanner scanner = new Scanner(System.in);
        int numberOfArray = scanner.nextInt();

        int[] unique = new int[numberOfArray];

        System.out.println("What r the numbers?");
        int number = 0;
        for (int i = 0; i < numberOfArray; i++) {
            Scanner scanner2 = new Scanner(System.in);
            number = scanner2.nextInt();
            unique[i] = number;
        }

        array(unique, numberOfArray);



    }

    public static void array(int [] unique, int numberOfArray) {


        int isItExist = 0;
        ArrayList<Integer> realArrayList = new ArrayList<>();


        for (int i = 0; i < numberOfArray; i++) {
            for (int j = realArrayList.size() - 1; j >= 0; j--) {
                if (unique[i] == realArrayList.get(j)) {
                    isItExist = 1;
                }
            }
            if (isItExist == 0) {
                realArrayList.add(unique[i]);
            }
            isItExist = 0;
        }


        int[] result = new int[realArrayList.size()];
        System.out.print("The array contains the numbers of: ");
        for (int i = 0; i < result.length; i++) {
            result[i] = realArrayList.get(i);
            System.out.printf(result[i] +", ");
        }

    }


}








