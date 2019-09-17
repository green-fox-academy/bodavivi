import java.util.ArrayList;
public class ListIntroduction1 {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)
        ArrayList<String> names = new ArrayList<>();


        //Print out the number of elements in the list
        System.out.println(names.size());



        //Add William to the list
        names.add ("William");


        for (int i = 0; i <10 ; i++) {
            System.out.print("-");

        }
        System.out.println();

        //Print out whether the list is empty or not
        if (names.size() == 0){
            System.out.println("The list is empty");
        }
        else{
            System.out.println("There are some elements in the list.");
        }


        //Add John to the list
        //Add Amanda to the list
        names.add("John");
        names.add("Amanda");

        for (int i = 0; i <10 ; i++) {
            System.out.print("-");

        }
        System.out.println();

        //Print out the number of elements in the list

        System.out.println(names.size());

        for (int i = 0; i <10 ; i++) {
            System.out.print("-");

        }
        System.out.println();

        //Print out the 3rd element

        System.out.println(names.get(2));
        for (int i = 0; i <20 ; i++) {

        }
        for (int i = 0; i <10 ; i++) {
            System.out.print("-");

        }
        System.out.println();

        //Iterate through the list and print out each name
        for (String name : names){
            System.out.println(name);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.print("-");

        }
        System.out.println();

        //Iterate through the list and print
        for (int j = 0; j < names.size() ; j++) {
            System.out.println((j+1)+". "+names.get(j) );

        }
        for (int i = 0; i <10 ; i++) {
            System.out.print("-");

        }
        System.out.println();
        //Remove the 2nd element
        names.remove(1);

        //Iterate through the list in a reversed order and print out each name
        ArrayList<String> reversedList = new ArrayList();
        for (int k = names.size() - 1; k >=0 ; k--) {
            reversedList.add(names.get(k));

        }

        names = reversedList;
        for (String reversedWord : names){
            System.out.println(reversedWord);
        }

        //Remove all elements

        names.clear();
        





    }
}

