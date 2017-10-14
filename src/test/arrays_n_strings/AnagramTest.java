package test.arrays_n_strings;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import arrays_n_strings.Anagram;

public class AnagramTest {
  Anagram ana = new Anagram();
  @Test
  public void areAnagram() {
	  assertEquals(ana.areAnagram("  goddy  ", "dogdy"),true);
	  assertEquals(ana.areAnagram("goddy", "doggy"),false);

  }

  @Test
  public void areAnagramsort() {

  }
}
