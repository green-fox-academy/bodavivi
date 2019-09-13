import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("A wanna do a big party!");
        System.out.println("How many girls should I invite to it?");
        Scanner girls = new Scanner(System.in);
        int girlsNumber = girls.nextInt();
        System.out.println("And how many boys should I call?");
        Scanner boys = new Scanner(System.in);
        int boysNumber = boys.nextInt();

        if ((girlsNumber + boysNumber > 19) && (girlsNumber == boysNumber)) {
            System.out.println("The party will be excellent!");
        }
        else if ((girlsNumber + boysNumber > 19) && (girlsNumber != boysNumber)) {
            System.out.println("The party will be quite cool!");
        }
        else if (girlsNumber == 0) {
            System.out.println("Sausage party");
        }
        else if (girlsNumber + boysNumber < 20) {
            System.out.println("Average party...");


        }
    }
}
