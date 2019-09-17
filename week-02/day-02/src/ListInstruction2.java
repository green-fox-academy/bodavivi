import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListInstruction2 {
    public static void main(String[] args) {

        //Create a list ('List A') which contains the following values

        ArrayList<String> listA = new ArrayList<>();
        listA.add("apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        //Create a new list ('List B') with the values of List A

        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listB.add(listA.get(i));

        }

        //Print out whether List A contains Durian or not
        if (listA.contains("Durian")){
            System.out.println("List A contains Durian.");
        }
        else{
            System.out.println("List A doesn't contains Durian.");
        }

        //Remove Durian from List B
        listB.remove("Durian");

        //Add Kiwifruit to List A after the 4th element
        listA.add(4, "Kiwifruit");

        //Compare the size of List A and List B
        if (listA.size() > listB.size()){
            System.out.println("List A is bigger.");
        }
        else{
            System.out.println("List A isn't bigger.");
        }

        //Get the index of Avocado from List A
        listA.indexOf("Avocado");

        //Get the index of Durian from List B
        listB.indexOf("Durian");

        //Add Passion Fruit and Pomelo to List B in a single statement
        ArrayList<String> auxlist = new ArrayList<>();
        auxlist.add("Passion Fruit");
        auxlist.add("Pomelo");

        listB.addAll (auxlist);

        //Print out the 3rd element from List A

        System.out.println(listA.get(2));





    }

}
