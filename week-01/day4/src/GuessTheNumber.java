import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = 8;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == num) {
                System.out.println("You found the number:" +num);
            }
            else if (userInput < num) {
                System.out.println("The stored number is bigger.");
            }
            else {
                System.out.println("The stored number is lower.");
            }
        }
    }

}
