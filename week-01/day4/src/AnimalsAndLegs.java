import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("Give me how many chickens and pigs the farmer has!");
        System.out.println("The amount of the chickens is:");
        Scanner scanner1 = new Scanner(System.in);
        int chickenslegs = (scanner1.nextInt() * 2);
        System.out.println("This many pigs he has:");
        Scanner scanner2 = new Scanner(System.in);
        int pigslegs = (scanner2.nextInt() * 4);
        int allAnimalLegs = pigslegs + chickenslegs;


        System.out.println("All in all the farmers animals have " +allAnimalLegs +" legs.");




    }
}
