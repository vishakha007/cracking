package arrays_n_strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static boolean areAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1 == null || str2 == null)return false;
		String s1= str1.replaceAll("//s", "").toLowerCase();
		String s2= str2.replaceAll("//s", "").toLowerCase();
		boolean st= true;
		for(char c : s1.toCharArray()){
			int i = s2.indexOf(c);
			if(i !=-1) {
				s2= s2.substring(0,i)+s2.substring(i+1);
			}
			else
			{
				st = false;
				break;
			}
		}

		return st;
	}

	public static boolean areAnagramsort(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length()||str1.length()==0||str2.length()==0)
			return false;
		if(str1==null ||str2==null)
			return false;
		//if(Arrays.sort(str1.toCharArray()) == )
		char [] c1=str1.toCharArray();
		char [] c2 =str2.toCharArray();
		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 if(Arrays.equals(c1, c2))return true;
		return false;
	}

}
