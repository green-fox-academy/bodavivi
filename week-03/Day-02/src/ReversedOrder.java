import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    String file = "reversed-order.txt";
    decrypt(file);
  }

  public static void decrypt(String file) {
    Path path = Paths.get(file);
    Path newPath = Paths.get("rightorder.txt");
    String newLine = "";

    try {
      List<String> lines = Files.readAllLines(path);
      List<String> newLines = Files.readAllLines(newPath);
      for (int i = lines.size()-1; i > 0; i--) {
        newLine = lines.get(i);
        newLines.add(newLine);
      }
      Files.write(newPath, newLines);
    } catch (IOException e) {
    }
  }
}