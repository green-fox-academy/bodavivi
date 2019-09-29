import java.util.ArrayList;

public class fibonacci {
  public static void main(String[] args) {

  }

  static ArrayList fibonacci(int counter, ArrayList<Integer> list, int result){
    if (counter == 9){
      return list;
    } else{
      result = list.get(counter-2) + list.get(counter-1);
      list.add(result);
      counter+= 1;
      return fibonacci(counter, list, result);
    }
  }
}

