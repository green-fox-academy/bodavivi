import java.util.Arrays;

public class Anagram {

  public Boolean anagaramChecker(String wordOne, String wordTwo){

    char[] charsWordOne = wordOne.toCharArray();
    Arrays.sort(charsWordOne);
    String wordOneSorted = new String(charsWordOne);

    char[] charsWordTwo = wordTwo.toCharArray();
    Arrays.sort(charsWordTwo);
    String wordTwoSorted = new String(charsWordTwo);

    int isItTrue = 0;

    if(wordOne.length() == wordTwo.length()){
      for(int i = 0; i < wordOne.length(); i++){
        if (wordOneSorted.charAt(i) == wordTwoSorted.charAt(i)){
          isItTrue = isItTrue;
        }else{
          isItTrue++;
        }
      }
      if (isItTrue == 0){
        return true;
      }else{
        return false;
      }
    }else{
      return false;
    }
  }
}
