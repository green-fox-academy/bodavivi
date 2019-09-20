import java.sql.SQLOutput;
import java.util.HashMap;

public class ShoppingList2{
    public static void main(String[] args) {
        HashMap<String, Double> productsWithPrice = new HashMap<>();
        productsWithPrice.put("Milk", 1.07);
        productsWithPrice.put("Rice", 1.59);
        productsWithPrice.put("Eggs", 3.14);
        productsWithPrice.put("Cheese", 12.60);
        productsWithPrice.put("Chicken Breasts", 9.40);
        productsWithPrice.put("Apples", 2.31);
        productsWithPrice.put("Tomato", 2.58);
        productsWithPrice.put("Potato", 1.75);
        productsWithPrice.put("Onion", 1.10);

        HashMap<String, Integer> bob= new HashMap<>();
        bob.put("Milk", 3);
        bob.put("Rice", 2);
        bob.put("Eggs",2);
        bob.put("Cheese", 1);
        bob.put("Chicken Breasts", 4);
        bob.put("Apples", 1);
        bob.put("Tomato", 2);
        bob.put("Potato",1);

        HashMap<String, Integer> alice = new HashMap<>();
        alice.put("Rice", 1);
        alice.put("Eggs", 5);
        alice.put("Chicken Breasts", 2);
        alice.put("Apples", 1);
        alice.put("Tomato", 10);

        //How much does Bob pay?

        double sumA = 0;

        for (String product : bob.keySet()){
            sumA = sumA + (productsWithPrice.get(product) * bob.get(product));
        }

        System.out.println("The summa of Bobs shopping is " +sumA);

        //How much does Alice pay?
        double sumB = 0;

        for (String product : alice.keySet()){
            sumB = sumB + (productsWithPrice.get(product) * alice.get(product));
        }

        System.out.println("The summa of Alices shopping is " +sumB);

        //Who buys more Rice?

        if (bob.get("Rice") > alice.get("Rice")){
            System.out.println("Bob buys more rice than Alice.");
        }
        else if (bob.get("Rice") == alice.get("Rice")){
            System.out.println("Alice and Bob buy the same amount of rice.");

        }
        else{
            System.out.println("Alice buys more rice than Bob.");
        }

        //Who buys more Potato?
        if (alice.containsKey("Potato")){

        }
        else{
            alice.put("Potato", 0);
        }

        if (bob.get("Potato") > alice.get("Potato")){
            System.out.println("Bob buys more Potatoes");
        }
        else if (bob.get("Potato") == alice.get("Potatoes")){
            System.out.println("Bob and Alice buy the same amount of potatoes");
        }
        else{
            System.out.println("Alice buys more potatoes.");
        }


        //Who buys more different products?
        if (bob.size()> alice.size()){
            System.out.println("Bob buys more products.");
        }
        else if (bob.size() == alice.size()){
            System.out.println("Bob and Alice buy the same amount of products.");
        }
        else{
            System.out.println("Alice buys more products.");
        }


        //Who buys more products? (piece)
        int bobSum = 0;
        for (int piece : bob.values()) {
            bobSum += piece;
        }
        int aliceSum = 0;
        for (int piece : alice.values()){
            aliceSum += piece;
        }

        if (bobSum > aliceSum){
            System.out.println("Bob buys more products");
        }
        else if (bobSum == aliceSum){
            System.out.println("Bob and Alice buy the same amount of products.");
        }
        else{
            System.out.println("Alice buys more products.");
        }



    }
}