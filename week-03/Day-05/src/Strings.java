public class Strings {
  public static void main(String[] args) {
    System.out.println(bullshit("RexseXex", 0, ""));

  }
  static String bullshit (String toChange, int counter, String resultString){
    if (counter == toChange.length()){
      return resultString;
    }else if (toChange.charAt(counter) == 'x'){
      resultString+='y';
      counter++;
      return bullshit(toChange, counter, resultString);
    } else {
      resultString+=toChange.charAt(counter);
      counter++;
      return bullshit(toChange, counter, resultString);
    }

  }
}
