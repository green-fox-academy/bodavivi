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
        if (shoppingList.contains("Milk")){
            System.out.println("We have milk on the list");
        }
        else if (shoppingList.contains("bananas")){
            System.out.println("We have Bananas on the list.");
        }



    }
}
