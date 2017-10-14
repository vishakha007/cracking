package arrays_n_strings;

import java.util.LinkedHashMap;

//find longest substring without repeating characters in the given string
public class longest_substring_uniq_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longest("aaabbaabbabcdabsjbssajssjkjs");
	}

	private static void longest(String str) {
		// TODO Auto-generated method stub
		char [] charr = str.toCharArray();
		LinkedHashMap<Character, Integer> mymap= new LinkedHashMap<Character, Integer>();		
		String sub= null;
		int len = 0;
		for(int i=0; i<charr.length;i++) {
			char ch = charr[i];
			//add unique char to map until duplicate char is found
			if(!mymap.containsKey(ch)) {
				mymap.put(ch, i);
			}//found duplicate char look for unique substring clear the map 
			else {
				i = mymap.get(ch);
				mymap.clear();
				}
			//update length and substring from the current iteration of map
			if(mymap.size()>len) {
				len=mymap.size();
				sub=mymap.keySet().toString();
			}
		}
		System.out.println("Input String "+str);
		System.out.println("has longest substring with unique characters "+ sub);
		System.out.println("with length "+ len);
	}

}
