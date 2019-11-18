import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isUpperCase;

public class Streamzzz {
  public static void main(String[] args) {
    /*# Exercise 1

    Write a Streamzzz Expression to get the even numbers from the following list:*/
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    System.out.println(numbers
        .stream()
        .filter(number -> (number % 2) == 0)
        .collect(Collectors.toList()));


/*## Exercise 2

    Write a Streamzzz Expression to get the squared value of the positive numbers from
    the following list:*/

    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    List<Integer> squared = numbers2.stream().filter(n -> n > 0).map(n -> n * n).collect(Collectors.toList());
    System.out.println(squared);


/*## Exercise 3

    Write a Streamzzz Expression to find which number squared value is more then 20
    from the following list:*/


    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    System.out.println(numbers3.stream().filter(n -> (n * n) > 20).collect(Collectors.toList()));

/*## Exercise 4

    Write a Streamzzz Expression to get the average value of the odd numbers from the
    following list:*/

    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    double averageOfOdds = numbers4.stream().filter(n -> (n % 2) != 0).mapToInt(n -> n).summaryStatistics().getAverage();
    System.out.println(averageOfOdds);

/*## Exercise 5

    Write a Streamzzz Expression to get the sum of the odd numbers in the following
    list:*/

    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    System.out.println(numbers5
        .stream()
        .filter(n -> (n % 2) == 1)
        .mapToInt(n -> n)
        .summaryStatistics().getSum());

/*## Exercise 6

    Write a Streamzzz Expression to find the uppercase characters in a string!*/
    String crookedColours = "I Hope You Get It";
    System.out.println(crookedColours
        .codePoints()
        .mapToObj(c -> (char) c)
        .filter(c -> isUpperCase(c))
        .collect(Collectors.toList()));
    ;

/*## Exercise 7

    Write a Streamzzz Expression to find the strings which starts with a given
    letter(as parameter), in the following list:*/

    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    System.out.println(cities.stream().filter(city -> city.startsWith("A")).collect(Collectors.toList()));

/*## Exercise 8

    Write a Streamzzz Expression to concatenate a Character list to a string!*/

    List<Character> arcticMonkeys = new ArrayList<>(Arrays.asList('W', 'h', 'y', ' ', 'd', 'o', ' ', 'y', 'o', 'u', ' ', 'a', 'l', 'w', 'a', 'y', 's', ' ', 'c', 'a', 'l', 'l', ' ', 'm', 'e', ' ', 'w', 'h', 'e', 'n', ' ', 'y', 'o', 'u', ' ', 'a', 'r', 'e', ' ', 'h', 'i', 'g', 'h', '?'));
    System.out.println(arcticMonkeys.stream().map(c -> c.toString()).collect(Collectors.joining()));



/*## Exercise 9

    Write a Streamzzz Expression to find the frequency of characters in a given string!*/
    String nickMurphy = "Harry Takes Drugs On The Weekend";    ;
    System.out.println(nickMurphy.codePoints().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting())));

/*## Exercise 10

    Create a Fox class with 3 properties:`name`, `color` and `age` Fill a list with
    at least 5 foxes and:

    - Write a Streamzzz Expression to find the foxes with green color!
        - Write a Streamzzz Expression to find the foxes with green color, and age less
    then 5 years!
        - Write a Streamzzz Expression to find the frequency of foxes by color!

## Exercise 11 💪

    Find a [random Wikipedia article](http://wikiroulette.co/) and copy the contents
    to a txt file.

    Create a Streamzzz expression which reads all text from this file, and prints the
    100 most common words in descending order. Keep in mind that the text contains
    punctuation characters which should be ignored. The result should be something
    like this:

    ```text
the: 131
of: 74
and: 48
to: 45
a: 43
in: 43
was: 30
as: 21
German: 18
for: 16
his: 15
by: 13
he: 11
that: 11
...
```

## Exercise 12 💪💪

    The [swcharacters.csv](../assets/swcharacters.csv) file contains the list of
    characters appeared in the Star Wars universe.

        > "BBY" stands for Before the Battle of Yavin, it's the "year zero" in the
        > Galactic Standard Calendar. For the age calculation let's assume that it's
        > "year zero" and every character lives for the sake of simplicity.

    Create Streamzzz expressions to perform the following exercises:

    - Print the name of the heaviest character (if the mass is unknown, ignore that
    character)
    - Print the average height of the male characters
        - Print the average height of the female characters
        - 💪 Get the age distribution of the characters by gender (where the gender can
        be "male", "female" and "other")
        - The age groups are: "below 21", "between 21 and 40", "above 40" and
    "unknown"
        - The result should be a `Map<String, Map<String, Integer>>`*/
  }
}
