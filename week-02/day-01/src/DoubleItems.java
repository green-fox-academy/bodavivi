
// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        int[] doubleNumList = new int[5];

        for (int i = 0; i < numList.length; i++) {
            doubleNumList[i] = numList[i] * 2;

        }
        for (int numbers : doubleNumList){
            System.out.print(numbers+", ");
        }
    }
}
