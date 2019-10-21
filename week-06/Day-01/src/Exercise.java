import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isUpperCase;

public class Exercise {
  public static void main(String[] args) {

    //Exercise 1
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());

    System.out.println(evenNumbers);

    //Exercise 2
    //Write a Stream Expression to get the squared value of the positive numbers from the following list:

    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> squaredValuesOfPositives = numbers2.stream()
        .filter(number -> number > 0)
        .map(n -> n * n)
        .collect(Collectors.toList());

    System.out.println(squaredValuesOfPositives);

    //Exercise 3
    //Write a Stream Expression to find which number squared value is more then 20 from the following list:

    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> squaredNumbersMoreThen20 = numbers3.stream()
        .filter(number -> (number*number) > 20)
        .collect(Collectors.toList());

    System.out.println(squaredNumbersMoreThen20);

    //Exercise 4
    //Write a Stream Expression to get the average value of the odd numbers from the following list:
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    double average = numbers4.stream()
        .filter(number -> (number % 2) == 1)
        .mapToInt((x) -> x)
        .summaryStatistics()
        .getAverage();

    System.out.println(average);

    //Exercise 5
    //Write a Stream Expression to get the sum of the odd numbers in the following list:
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    double sum = numbers5.stream()
        .filter(number -> (number % 2) == 1)
        .mapToInt((x) -> x)
        .summaryStatistics()
        .getSum();

    System.out.println(sum);

    //Exercise 6
    //Write a Stream Expression to find the uppercase characters in a string!
    String stringy = "iT is A sTrInG";

    Stream <Character> x = stringy.codePoints().mapToObj(w -> (char)w);
    Stream <Character> y = x.filter(character -> isUpperCase(character));
    List <Character> uppercases = y.collect(Collectors.toList());

    System.out.println(uppercases);


    //Exercise 7
    //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    List<String> citiesWithStartWithParameter = cities.stream()
        .filter(word -> word.startsWith("Z"))
        .collect(Collectors.toList());

    System.out.println(citiesWithStartWithParameter);

    //Exercise 8
    //Write a Stream Expression to concatenate a Character list to a string!
    List <Character> characterList = Arrays.asList('P', 'u', 's', 'h', 'e', 'e', 'n');

    Stream<Character> charactersAsWords = characterList.stream();
    Stream <String> list = charactersAsWords.map(c -> c.toString());
    String string2 = list.collect(Collectors.joining());

    System.out.println(string2);

    //Exercise 9
    //Write a Stream Expression to find the frequency of characters in a given string!
    String parameter = "It is a given string";
    Stream<Character> stringAsCharacters = parameter.codePoints().mapToObj(w -> (char)w);
    Map<Object, Long> characterFrequency = stringAsCharacters.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    System.out.println(characterFrequency);
  }
}
