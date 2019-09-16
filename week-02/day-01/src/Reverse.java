// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Reverse {
    public static void main(String[] args) {
        int [] aj = {3, 4, 5, 6, 7};
        int [] ak = new int[aj.length];
        for (int i = aj.length-1; i>=0; i--){
            ak [aj.length-(i+1)] = aj [i];

        }
        for (int j = 0; j < ak.length; j++){
            aj [j] = ak[j];
            System.out.print(aj[j]+", ");
        }
        }
    }
