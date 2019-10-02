import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void anagaramChecker_sameWords() {
    Anagram anagram = new Anagram();
    Boolean result = anagram.anagaramChecker("Kili", "Kili");
    assertEquals(true, result);
  }

  @Test
  public void anagaramChecker_DifferentWords() {
    Anagram anagram = new Anagram();
    Boolean result = anagram.anagaramChecker("Kili", "Nala");
    assertEquals(false, result);
  }
}