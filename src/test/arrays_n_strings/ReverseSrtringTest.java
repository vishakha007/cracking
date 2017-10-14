package test.arrays_n_strings;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import arrays_n_strings.ReverseSrtring;

public class ReverseSrtringTest {

	  ReverseSrtring r=new ReverseSrtring();


  @Test
  public void reverseMultiplrwords() {
	assertEquals(r.reverse("abc def"), "fed cba");
	assertEquals(r.reverse(" abc def "), " fed cba ");

	}
  @Test
  public void reverseOneword() {
	 assertEquals(r.reverse("abc"), "cba");
	
  }
  @Test
  public void reverseWordnotStringshouldfail() {
	 assertNotEquals(r.reverse("abc def"), "def abc");
	
  }
  @Test
  public void reverseEmptystring() {
	assertEquals(r.reverse(""), "");
	
	assertNotEquals(r.reverse(""), " ");
	assertEquals(r.reverse(null), null);
  }
}
