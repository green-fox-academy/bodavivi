import java.util.ArrayList;
import java.util.HashMap;

public class ProductBase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> productBase = new HashMap<>();

        productBase.put("Eggs", 200);
        productBase.put("Milk", 200);
        productBase.put("Fish", 400);
        productBase.put("Apples", 150);
        productBase.put("Bread", 50);
        productBase.put("Chicken", 550);

        //Which products cost less than 201? (just the name)

        ArrayList<String> products = new ArrayList<>();

        for (String product : productBase.keySet()){
            if (productBase.get(product) < 201){
                System.out.println(product);
            }
        }
        System.out.println();

        //Which products cost more than 150? (name + price)

        for (String product : productBase.keySet()){
            if (productBase.get(product) > 150){
                System.out.println(product +" " + productBase.get(product));
            }
        }
    }
}
