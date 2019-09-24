import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    String file = "duplicated-chars.txt";

    decrypt(file);
  }

  public static void decrypt(String file) {
    Path path = Paths.get(file);
    char[] c_arr;
    char c = 'a';

    try {
      List<String> crypted = Files.readAllLines(path);

      for (String liney : crypted) {
        c_arr = liney.toCharArray();
        for (int i = 0; i < c_arr.length; i++) {
          if (c_arr[i] != c) {
            System.out.print(c_arr[i]);
            c = c_arr[i];
          }
        }
        System.out.println();
      }
    } catch (IOException e) {
      System.out.println("Fail");
    }
  }
}