package practice;

import java.util.Collections;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
 * An element in an array is majority element if it occurs
 *  more than half times of size of the array.
 *  Print majority element in array if present or print NONE
 * */
public class MajorityElement {
	public static void major(int [] arr) {
		//Initialize a map
		int major=arr.length/2;
		Map <Integer,Integer> mymap= new HashMap<Integer, Integer>();
		//Store key val pairs in map
		for(int i : arr) {
			Integer val=mymap.get(i);
			mymap.put(i, val==null?1:val+1);
		}
		//Get the max value in values of the map
		
		Integer max = Collections.max(mymap.entrySet(), Map.Entry.comparingByValue()).getKey();
		Integer maxValue= mymap.get(max);
		if(major<maxValue)
			System.out.println(max +" appeared "+ maxValue +" times in "+arr.length+" elements array");
		else
			System.out.println("NONE");

	}
	public static void main(String []args) {
		int arr[] = {1,2,3,4,5,5,5,5,5,5,};
		major(arr);
	}

}
