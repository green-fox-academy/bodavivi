import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c){
      return a;
    }else if (b > a && b > c){
      return b;
    }else {
      return c;
    }
  }

  public ArrayList median(List<Integer> pool) {
    Collections.sort(pool);
    ArrayList<Integer> toReturn = new ArrayList<>();
    double half;
    if ((pool.size() % 2) != 0) {
      half = pool.get((pool.size() / 2) - 1);
      toReturn.add((int) half + 1);
    } else if ((pool.size() % 2) == 0) {
      half = pool.get(pool.size() / 2);
      toReturn.add((int) half);
      half = pool.get(pool.size()/2 - 1);
      toReturn.add((int) half);
    }
    return toReturn;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'E', 'I', 'O', 'U', 'á', 'Á', 'É', 'é', 'í', 'Í', 'ó', 'Ó', 'ö', 'Ö', 'ő', 'Ő', 'ü', 'Ü', 'ű', 'Ű').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;

    for (int i = 0; i < teve.length(); i++){
      if (isVowel(teve.charAt(i))){
        teve = teve.substring(0, i+1 ) + "v" + teve.substring(i, teve.length());
        i += 3;
      }
    }

    return teve;
  }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed