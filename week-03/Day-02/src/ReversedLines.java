import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    String filename = "reversed-lines.txt";
    decrypt(filename);
  }

  public static void decrypt(String file) {
    Path path = Paths.get(file);
    Path pathNew = Paths.get("reversed.txt");
    char[] c_arr;
    String actualLine = "";


    try {
      List<String> crpyted = Files.readAllLines(path);
      List<String> decrypted = Files.readAllLines(pathNew);

      for (String line : crpyted) {
        c_arr = line.toCharArray();
        for (int i = c_arr.length-1; i >= 0; i--) {
          actualLine += c_arr[i];

        }
        decrypted.add(actualLine);
        actualLine ="";
      }
      Files.write(pathNew, decrypted);
    } catch (IOException e) {
    }
  }
}