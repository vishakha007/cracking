package arrays_n_strings;

import java.util.stream.IntStream;

/*
 * Assume you have a method isSubstring which checks if one word is a substring of
another. Given two strings, s1 and s2, 
write code to check if s2 is a rotation of s1 using
only one call to isSubstring (
 * */
public class isSubString {
	public static boolean isRotation(String s1, String s2){
		if(s1.length()==s2.length()&& s1.length()!=0)
			return issubstring(s1+s1,s2);
		else
			return false;
	}

	private static boolean issubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		System.out.println(s1);
		System.out.println(s2);
		//CharSequence seq= (CharSequence) s2.chars();
		return (s1.contains(s2));
	}
	
	public static void main(String []args) {
	System.out.println(isRotation("apple","pleap"));
	}

}
