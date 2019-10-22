import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise11 {
  //Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending order. Keep in mind that the text contains punctuation characters which should be ignored.

  public static void main(String[] args) {
    Path file = Paths.get("grumphy.txt");
    //HashMap<String>


    try{
      Stream <String> content = Files.lines(file);
      System.out.println(content);
      //Stream <String> contentWithoutUnnecessaries = content.

    } catch (IOException e) {
      System.out.println("NOOOOO");
    }
  }

}
