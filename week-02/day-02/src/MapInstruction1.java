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



    }
}
