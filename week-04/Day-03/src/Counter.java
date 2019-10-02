import java.util.HashMap;

public class Counter {
  HashMap<Character, Integer> dictionary = new HashMap();

  public HashMap letterCounter(String string){
    int isItAlreadyIn = 0;
    int occurences = 0;

    for (char charOfString : string.toCharArray()){
      for (char charOfHashmap : dictionary.keySet()) {
        if (charOfString == charOfHashmap){
          isItAlreadyIn +=1;
        }else{
          isItAlreadyIn = isItAlreadyIn;
        }
      }if (isItAlreadyIn == 0){
        for (char character : string.toCharArray()){
          if (character == charOfString){
            occurences ++;
          }
        }
        dictionary.put(charOfString, occurences);
      }
            isItAlreadyIn = 0;
      occurences = 0;
    }
    return dictionary;
  }
}
