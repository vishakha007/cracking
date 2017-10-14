package arrays_n_strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 *  Write a java program to find the duplicate words
 *   and their number of occurrences in a string*/
public class DuplicateWords_N_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DupNCount_Map("Bread butter and bread Bread butter and bread Bread butter and bread Bread butter and bread");
		DupNCount("Bread butter and bread Bread butter and bread Bread butter and bread Bread butter and bread");
		DupNCount_Map("Bread butter and bread ");

		System.out.println();
	}
	private static void DupNCount_Map(String string) {
		String [] words=string.split(" ");
		Map <String, Integer> mymap= new HashMap<String , Integer>();
		for(int i=0;i<words.length;i++) {
		Integer val=mymap.get(words[i].toLowerCase());
		mymap.put(words[i].toLowerCase(), val==null?1:val+1);
		}
		for(Entry e : mymap.entrySet()) {
			int v=(int) e.getValue();
			if(v>1)
				System.out.println(e.getKey()+"  "+e.getValue());

		}
	}
	private static void DupNCount(String string) {
		// TODO Auto-generated method stub
		String [] words=string.toLowerCase().trim().split(" ");
		
		System.out.println(Arrays.toString(words));
		String dup = "";
		int counter  = 0;
		for(int i= 0; i<words.length;i++) {
			for(int j=0; j<words.length;j++) {
				//System.out.println(words[i]+"  "+words[j]);
				if(words[i].equals(words[j]) && i != j) {
					dup=words[i];
					++counter;
					}
			}
		}
		System.out.println(dup +"  "+counter);
	}
}
