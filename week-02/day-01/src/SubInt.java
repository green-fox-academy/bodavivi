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
        System.out.println("Please add a number!");
        Scanner numb = new Scanner(System.in);
        int number = numb.nextInt();
        System.out.println("How many parameters should we use in our array?");
        Scanner para = new Scanner(System.in);
        int parametersNumber = para.nextInt();
        int [] arrey = new int[parametersNumber];

        System.out.println("Please add the parameters!");
        for (int i = 0; i <parametersNumber ; i++) {
            Scanner elOAr = new Scanner(System.in);
            int elementsOfArrey = elOAr.nextInt();
            arrey[i] = elementsOfArrey;

        }
        for (int oneByOne : arrey){


        }
        for (int valami : arrey){
            System.out.println(valami);
        }

    }
}