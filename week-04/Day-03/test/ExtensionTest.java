import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  private void assertEquals(int i, int add) {
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    ArrayList<Integer> testing = new ArrayList(Arrays.asList(7,5,3,5));
    Extension test = new Extension();
    ArrayList result = test.median(testing);
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 5));
    Assert.assertEquals(expected, result);
  }

  @Test
  void testMedian_five() {
    ArrayList<Integer> testing = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
    Extension test = new Extension();
    ArrayList result = test.median(testing);
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3));
    Assert.assertEquals(expected, result);
  }


  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    Assert.assertEquals("teveveve", extension.translate("teve"));
  }

  @Test
  void testTranslate_lagopus() {
    Assert.assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}