package arrays_n_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* Write a java program to find the percentage of uppercase letters,
 * lowercase letters, digits and special characters in a given string
 * */
public class PercentageString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		percent("Tiger Runs @ The Speed Of 100 km/hour.");
	}

	private static void percent(String str) {
		// TODO Auto-generated method stub
		int len = str.toCharArray().length;
		Map<String, Integer> mymap= new HashMap <String, Integer>();
		mymap.put("UpperCase", 0);
		mymap.put("LowerCase", 0);
		mymap.put("Digit", 0);
		mymap.put("Special Character", 0);
		for( int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(Character.isDigit(ch))
				mymap.put("Digit", mymap.get("Digit")+1);
			else if(Character.isLowerCase(ch))
				mymap.put("LowerCase", mymap.get("LowerCase")+1);
			
			else if(Character.isUpperCase(ch))
				mymap.put("UpperCase", mymap.get("UpperCase")+1);
			else if(Character.isSpaceChar(ch))
				continue;
			else
				mymap.put("Special Character", mymap.get("Special Character")+1);
			
			
		}
		System.out.println("The length of the string is "+len);
		for(Entry e :mymap.entrySet()) {
			int i=(int) e.getValue();
			if(i != 0)
				System.out.println("Number of "+e.getKey()+" is "+e.getValue()+" .So percentage is "+(double)i/len*100+" %");
			else
				System.out.println(e.getKey()+" not found in this string.");
		}
	}

}
