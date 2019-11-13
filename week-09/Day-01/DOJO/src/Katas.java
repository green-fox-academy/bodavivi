import java.util.Arrays;
import java.util.List;

public class Katas {
  public int getIndex(int number, List<Integer> listOfNumbers) {
    for (int i = 0; i < listOfNumbers.size(); i++) {
      if (listOfNumbers.get(i) == number){
        return i;
      }
    }
    return -1;
  }

  public boolean anagram(String stringOne, String stringTwo){
    char stringOneArray[] = stringOne.toCharArray();
    char stringTwoArray[] = stringTwo.toCharArray();

    Arrays.sort(stringOneArray);
    Arrays.sort(stringTwoArray);

    String result1 = new String(stringOneArray);
    String result2 = new String(stringTwoArray);

    return result1.equals(result2);
  }
}
