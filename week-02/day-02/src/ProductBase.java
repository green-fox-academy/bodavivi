import java.util.HashMap;

public class ProductBase {
    public static void main(String[] args) {
        HashMap<String, Integer> productBase = new HashMap<>();

        productBase.put("Eggs", 200);
        productBase.put("Milk", 200);
        productBase.put("Fish", 400);
        productBase.put("Apples", 150);
        productBase.put("Bread", 50);
        productBase.put("Chicken", 550);

        //How much is the fish?

        for (String product : productBase.keySet()){
            if (product == "Fish"){
                System.out.println("The price of the "+product+" is "+productBase.get(product));
            }
        }
        //What is the most expensive product?

        int mostExpensiveProductsPrice = 0;
        String mostExpensiveProduct = "";

        for (Integer price : productBase.values()){
            if (price > mostExpensiveProductsPrice){
                mostExpensiveProductsPrice = price;
            }
        }
        for (String product : productBase.keySet()){
            if (productBase.get(product).equals(mostExpensiveProductsPrice)){
                mostExpensiveProduct = product;
                }
        }
        System.out.println("The most expensive product is " + mostExpensiveProduct + " which is " +mostExpensiveProductsPrice +".");

        //What is the average price?

        int sum = 0;

        for (Integer price : productBase.values()){
            sum = sum + price;
        }
        double average = (double)sum/productBase.size();

        System.out.println("The average price is " + average);

        //How many products' price is below 300?
        int below300 = 0;

        for (Integer price : productBase.values()){
            if (price < 300){
                below300 = below300 + 1;
            }
        }
        System.out.println("The number of products which are under 300 is " + below300);

        //Is there anything we can buy for exactly 125?

        for (String product : productBase.keySet()){
            if (productBase.get(product).equals(125)){
                System.out.println("We can buy a " + product +" for 125.");
            }
        }

        //What is the cheapest product?

        int cheapestProductsPrice = sum;
        String cheapestProduct = "";


        for (Integer price : productBase.values()){
            if (price<cheapestProductsPrice){
                cheapestProductsPrice = price;
            }
        }
        for (String product : productBase.keySet()){
            if (productBase.get(product).equals(cheapestProductsPrice)){
                cheapestProduct = product;
            }
        }
        System.out.println("The cheapest product is " + cheapestProduct);
    }
}
