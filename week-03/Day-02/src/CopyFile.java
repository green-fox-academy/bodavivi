// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    String fileFrom = "my-file.txt";
    String fileTo = "newfile.txt";
    System.out.println(copy(fileFrom, fileTo));

  }

  public static boolean copy(String fileFrom, String fileTo) {
    boolean result = false;
    Path pathFrom = Paths.get(fileFrom);
    Path pathTo = Paths.get(fileTo);

    try {
      List<String> linesFrom = Files.readAllLines(pathFrom);
      List<String> linesTo = Files.readAllLines(pathTo);

      for (String line : linesFrom) {
        linesTo.add(line);
      }
      Files.write(pathTo, linesTo);
      result = true;
    } catch (IOException e) {
      e.setStackTrace();
    }
    return result;
  }
}
