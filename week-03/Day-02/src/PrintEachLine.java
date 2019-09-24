import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

    Path file = Paths.get("my-file.txt");
    try{
      List<String> lines = Files.readAllLines(file);
      for (String line : lines){
        System.out.println(line);
      };
      }catch (IOException e){
      e.printStackTrace();
      System.out.println("Unable to read file: my-file.txt.");
    }

  }
}