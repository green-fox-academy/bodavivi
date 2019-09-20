import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        //Create a list with the following items.

        shoppingList.add("Eggs");
        shoppingList.add("Milk");
        shoppingList.add("Fish");
        shoppingList.add("Apples");
        shoppingList.add("Bread");
        shoppingList.add("Chicken");

        //Do we have milk on the list?
        //Do we have bananas on the list?
        if (shoppingList.contains("Milk") && shoppingList.contains("Bananas")){
            System.out.println("We have milk and bananas on the list");
        }
        else if (shoppingList.contains("Bananas")){
            System.out.println("We have bananas on the list.");
        }
        else if (shoppingList.contains("Milk")){
            System.out.println("We have milk on the list.");
        }
        else{
            System.out.println("We don't have bananas or milk on the list.");
        }



    }
}
