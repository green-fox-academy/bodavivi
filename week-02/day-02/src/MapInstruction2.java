import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapInstruction2 {
    public static void main(String[] args) {
        //Create a map where the keys are strings and the values are strings with the following initial values
        HashMap<String, String> things = new HashMap<>();
        things.put("978-1-60309-452-8", "A letter to Jo");
        things.put("978-1-60309-459-7", "Lupus");
        things.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        things.put("978-1-60309-461-0", "The Lab");

        //Print all the key-value pairs in the following format
        for (Map.Entry<String, String> thing : things.entrySet()) {
            System.out.print(thing.getValue() + " (ISBN: " +thing.getKey() +") \n");
        }

        //Remove the key-value pair with key 978-1-60309-444-3
        things.remove("978-1-60309-444-3");

        //Remove the key-value pair with value The Lab
        for (String thingy : things.keySet()){
            if(things.get(thingy).equals("The Lab")){
                things.remove(thingy);
            }
        }
        //Add the following key-value pairs to the map
        things.put("978-1-60309-450-4", "They Called Us Enemy");
        things.put("987-1-60309-453-5", "Why Did We Trust Him?");


        //Print the value associated with key 978-1-60309-453-5
        for (String keyer : things.keySet()){
            if (keyer == "987-1-60309-453-5") {
                System.out.println("The value of the " + keyer + " key is " + things.get(keyer));
            }
        }


        }


    }

