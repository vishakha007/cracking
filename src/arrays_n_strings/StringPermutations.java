package arrays_n_strings;

import java.util.HashSet;
import java.util.Set;

//Write a java program to find all permutations of a string
//	perm("abc");
//I/P  : abc
//O/P  : [, a, ab, bc, b, abc, c]

public class StringPermutations {
	public static Set <String> res= new HashSet <String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("abc");
		permrecurse("abc");
	}
	
	private static void perm(String str) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		for(int i=0; i<str.toCharArray().length;i++) {
			set.add(str.substring(i));
			for (int j=i; j<str.toCharArray().length;j++)
				set.add(str.substring(i, j));
			}
		System.out.println(set.toString());
	}

	/* Write a java program to find all permutations of string recursively.
	 *  For example, all permutations of string “JSP” are,
	 *	JSP, JPS, SJP, SPJ, PJS, PSJ * */
	private static void permrecurse(String input) {
		// TODO Auto-generated method stub
		
		res= permrecurse("", input);
		System.out.println(res.toString());

	}

	private static Set<String> permrecurse(String string, String input) {
		if(input.length()==0)
			res.add(string);
			//System.out.println(string);
		else {
			for(int i=0;i<input.length();i++)
				permrecurse(string+input.charAt(i) ,
						input.substring(0, i)+input.substring(i+1));
	
		}
		return res;
	}
	
}
