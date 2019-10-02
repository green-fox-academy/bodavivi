import java.util.ArrayList;

public class Sum {
  ArrayList<Integer> toSum = new ArrayList<>();

  public Integer add(ArrayList<Integer> toSum) {
    Integer summa = 0;

    if (toSum == null) {
      return null;
    } else {
      for (int number : toSum) {
        summa += number;
      }
      return summa;
    }
  }
}
