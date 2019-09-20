import java.util.HashMap;
import java.util.Map;
import java.lang.NullPointerException;

public class TelephoneBook {
    public static void main(String[] args) {


        //Create a map with the following key-value pairs.

        HashMap<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K.Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D.Newland", "319-243-5613");
        telephoneBook.put("Brooke P.Askew", "307-687-2982");

        //What is John K. Miller's phone number?
        for (String name : telephoneBook.keySet()) {
            if (name == "John K.Miller") {
                System.out.println(telephoneBook.get(name));
            }
        }

        //Whose phone number is 307-687-2982?
        for (String name : telephoneBook.keySet()) {
            if (telephoneBook.get(name).equals("307-687-2982")) {
                System.out.println("This phonenumber is "+name+"s number.");
            }


        }

        //Do we know Chris E. Myers' phone number?

        int inThePhonebook = 0;

        for (String name : telephoneBook.keySet()){
            if (name == "Chris E. Myers"){
                inThePhonebook = 1;
            }
        }

        if (inThePhonebook == 1){
            System.out.println("Chris E. Myers is in the phonebook.");
        }
        else{
            System.out.println("Chris E. Myers isn't in the phonebook.");
        }
    }
}

