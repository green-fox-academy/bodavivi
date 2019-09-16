import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        System.out.println("Write a number here!");
        Scanner tell = new Scanner(System.in);
        int all = tell.nextInt();
        int aller = sum(all);
        System.out.println(aller);

    }
    public static int sum(int summa){
        int a = 0;
        for (int i = 0; i <= summa; i++){
            a = a + i;
        }
        return a;
    }
}
