import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KatasTest {
  Katas katas = new Katas();
  List<Integer> listOfNumbers;

  @Test
  public void getIndex_ReturnsOne() {
    listOfNumbers = new ArrayList<>(Arrays.asList(3, 7));
    Assert.assertEquals(1, katas.getIndex(7, listOfNumbers));
  }

  @Test
  public void getIndex_ReturnsMinusOne() {
    listOfNumbers = new ArrayList<>(Arrays.asList(3, 7));
    Assert.assertEquals(-1, katas.getIndex(9, listOfNumbers));
  }

  @Test
  public void getIndex_EmptyList_ReturnMinusOne(){
    listOfNumbers = new ArrayList<>();
    Assert.assertEquals(-1, katas.getIndex(3, listOfNumbers));
  }

  @Test
  public void anagram_Anagrams(){
    Assert.assertEquals(true, katas.anagram("dog", "god"));
  }

  @Test
  public void anagram_NotAnagrams(){
    Assert.assertEquals(false, katas.anagram("cat", "kitten"));
  }


}