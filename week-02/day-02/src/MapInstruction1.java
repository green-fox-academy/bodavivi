import java.util.HashMap;

public class MapInstruction1 {
    public static void main(String[] args) {

        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> hs = new HashMap<>();
        
        //Print out whether the map is empty or not
        if (hs.size() == 0){
            System.out.println("The hs HashMap is empty");
        }
        else {
            System.out.println("There are " + hs.size() +"elements in this HashMap.");
        }

        //Add the following key-value pairs to the map

        hs.put(97, 'a');
        hs.put(98, 'b');
        hs.put(99, 'c');
        hs.put(65, 'A');
        hs.put(66, 'B');
        hs.put(67, 'C');

        //Print all the keys
        for (Integer key : hs.keySet()){
            System.out.print(key + ", ");
        }
        System.out.println();
        //Print all the values
        for (Character value : hs.values()){
            System.out.print(value + ", ");
        }

        System.out.println();

        //Add value D with the key 68

        hs.put(68, 'd');

        //Print how many key-value pairs are in the map
        System.out.println(hs.size());

        //Print the value that is associated with key 99
        System.out.println(hs.get(99));

        //Remove the key-value pair where with key 97
        hs.remove(97);

        //Print whether there is an associated value with key 100 or not
        if (hs.containsKey(100)){
            System.out.println("There is a value, which is associated the key of 100.");
        }
        else{
            System.out.println("There isn't a value, which is associated the key of 100.");

        }

        //Remove all the key-value pairs
        hs.clear();




    }
}
