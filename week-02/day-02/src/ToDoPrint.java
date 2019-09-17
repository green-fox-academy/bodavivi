
public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the todoText
        String myTodo = "My todo:\n";
        todoText = (myTodo + todoText);

        // Add " - Download games" to the end of the todoText
        String downloadGames = " - Download games \n";
        todoText = (todoText + downloadGames);
        // Add " - Diablo" to the end of the todoText but with indention
        String diablo = " \t - Diablo";
        todoText = (todoText + diablo);

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}