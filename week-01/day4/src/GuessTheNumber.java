import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = 8;
        System.out.println("Guess the number!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int tempt = scanner.nextInt();
            if (tempt == num) {
                System.out.println("You found the number:" +num);
                break;
            }
            else if (tempt < num) {
                System.out.println("The stored number is bigger.");
            }
            else {
                System.out.println("The stored number is lower.");
            }
        }
    }

}
