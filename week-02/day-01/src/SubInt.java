//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array
/////int átalakítása stringé

//  Example:
//System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//  should print: `[0, 1, 4]`
//System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'
import java.util.Scanner;
public class SubInt {
    public static void main(String[] args) {
        System.out.println("How many numbers should we use in the array?");
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = scanner.nextInt();

        System.out.println("Which are the arrays number?");
        int[] array = new int[numberOfNumbers];

        int numberOfArray = 0;

        for (int i = 0; i < numberOfNumbers; i++) {
            Scanner scanner2 = new Scanner(System.in);
            numberOfArray = scanner2.nextInt();
            array[i] = numberOfArray;
        }

        System.out.println("Which number do you wanna find?");
        Scanner scanner3 = new Scanner(System.in);
        int toFind = scanner3.nextInt();

        valami(toFind, array);
    }
    public static String valami (int toFind, int [] array){

        String actualString= "";
        String whichContains = "";
        String [] stringArray = new String[array.length];

        for (int i = 0; i < array.length-1 ; i++) {
            stringArray[i] = String.valueOf(array[i]);

        }


        for (int i = 0; i < array.length-1; i++) {
            actualString = stringArray[i];
            if (actualString.contains(String.valueOf(toFind))){
                whichContains = whichContains + " " + actualString;
            }

        }
        System.out.println(whichContains);
        return whichContains;

    }
}