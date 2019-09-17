import java.sql.SQLOutput;
import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> productBase = new HashMap<>();

        productBase.put("Milk", 1.07);
        productBase.put("Rice", 1.59);
        productBase.put("Eggs", 3.14);
        productBase.put("Cheese", 12.6);
        productBase.put("Chicken Breast", 9.4);
        productBase.put("Apples", 2.31);
        productBase.put("Tomato", 2.58);
        productBase.put("Potato", 1.75);
        productBase.put("Onion", 1.1);

        HashMap<String, Integer> bobs = new HashMap<>();

        bobs.put("Milk", 3);
        bobs.put("Rice", 2);
        bobs.put("Eggs", 2);
        bobs.put("Cheese", 1);
        bobs.put("Chicken Breast", 4);
        bobs.put("Apples", 1);
        bobs.put("Tomato", 2);
        bobs.put("Potato", 1);

        HashMap<String, Integer> alices = new HashMap<>();

        alices.put("Rice", 1);
        alices.put("Eggs", 1);
        alices.put("Chicken Breast", 2);
        alices.put("Apples", 1);
        alices.put("Tomato", 10);

        //How much does Bob pay?

        double BHasToPay = 0;

        for (String prods : bobs.keySet()){
            BHasToPay = (BHasToPay) + (bobs.get(prods)* productBase.get(prods));
        }

        System.out.println("Bob has to pay " + BHasToPay);

        //How much does Alice pay?
        double AHasToPay = 0;

        for (String product : alices.keySet()) {
            AHasToPay += alices.get(product) * productBase.get(product);
        }

        System.out.println("Alice has to pay " + AHasToPay);

        //Who buys more Rice?

        if (bobs.get("Rice") > alices.get("Rice")){
            System.out.println("Bob gets more rice");
        }
        else if (bobs.get("Rice") < alices.get("Rices")){
            System.out.println("Alice gets more rice");
        }

        //Who buys more Potato?


        }

}