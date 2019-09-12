import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Write here a distance is miles!");
        Scanner scanner = new Scanner(System.in);
        Double kms = (scanner.nextDouble() * 1.609344);

        System.out.println("It is " +kms +"kms.");

    }
}
