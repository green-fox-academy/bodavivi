public class StringsAgainAndAgain {
  public static void main(String[] args) {
    System.out.println(star("Elkelkaposztasitottalanitottatok", 0, "* "));

  }

  static String star (String toChange, int counter, String result){
    if (counter == toChange.length()){
      return result;
    }
    else {
      result += toChange.charAt(counter) + " * ";
      counter++;
      return star(toChange, counter, result);
    }
  }
}
