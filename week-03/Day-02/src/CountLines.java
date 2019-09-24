import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
public class CountLines {
  public static void main(String[] args) {
    System.out.println("Please give the filename!");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    function(input);
  }

  public static void function(String file) {
    Path path = Paths.get(file);
    int numberOfLines = 0;
    try {
      List<String> lines = Files.readAllLines(path);
      for (String line : lines){
        numberOfLines+=1;
      }
      System.out.println(numberOfLines);
    } catch (IOException e){
      System.out.println("0");
    }
  }
}
