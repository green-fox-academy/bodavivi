public class SumAll {
    public static void main(String[] args) {
        int [] helpme = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int number : helpme){
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
