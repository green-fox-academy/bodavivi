package Exercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {
  String name;
  String color;
  int age;

  public Fox (String name, String color, int age){
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public static void main(String[] args) {
    Fox fox1 = new Fox("Joseph", "Blue", 2);
    Fox fox2 = new Fox("Susan", "Black", 1);
    Fox fox3 = new Fox ("Tom", "Green", 5);
    Fox fox4 = new Fox("Sally", "Grey", 7);
    Fox fox5 = new Fox("William", "Green", 1);

    List<Fox> foxes = new ArrayList<>(Arrays.asList(fox1, fox2, fox3, fox4, fox5));

    //Write a Stream Expression to find the foxes with green color!
    List<String> greenFoxes = foxes.stream()
        .filter(fox -> fox.color.equals("Green"))
        .map(f -> f.name)
        .collect(Collectors.toList());

    System.out.println(greenFoxes);

    //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    List<String> greenFoxesLessThan5 = foxes.stream()
        .filter(fox -> fox.color.equals("Green"))
        .filter(fox -> fox.age < 5)
        .map(fox -> fox.name)
        .collect(Collectors.toList());

    System.out.println(greenFoxesLessThan5);

    //Write a Stream Expression to find the frequency of foxes by color!
    
  }
}
