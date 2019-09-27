public class StringsAgain {
  public static void main(String[] args) {
    System.out.println(changer("exseXrex", 0, ""));
  }

  static String changer (String toChange, int counter, String changed){
    if (counter == toChange.length()){
      return changed;
    } else if (toChange.charAt(counter) == 'x'){
      counter+=1;
      return changer(toChange, counter, changed);
    } else {
      changed += toChange.charAt(counter);
      counter+=1;
      return changer(toChange, counter, changed);
    }
  }
}
