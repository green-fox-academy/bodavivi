// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    System.out.println("Which file should we write in?");
    Scanner scanner1 = new Scanner(System.in);
    String file = scanner1.nextLine();

    System.out.println("How much line should the file contains?");
    Scanner scanner2 = new Scanner(System.in);
    int numberOfLines = scanner2.nextInt();

    System.out.println("Choose a word!");
    Scanner scanner3 = new Scanner(System.in);
    String wordToWriteIn = scanner3.nextLine();

    function(file, wordToWriteIn, numberOfLines);

  }
  public static void function (String file, String wordToWriteIn, int numberOfLines){
    Path path = Paths.get(file);

    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < numberOfLines; i++) {
        lines.add(wordToWriteIn);
      }
      Files.write(path, lines);
    }catch (IOException e){
    }
  }
}
