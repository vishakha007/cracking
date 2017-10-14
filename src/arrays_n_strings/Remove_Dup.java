package arrays_n_strings;
/*
 * Design an algorithm and write code to remove 
 * the duplicate characters in a string
without using any additional buffer. 
NOTE: One or two additional variables are fine.
An extra copy of the array is not.
 * */
public class Remove_Dup {
	
	
	public static void main(String args[]) {
		//int arr []= {1,1,2,0,3,4,5,6,77,7,7,9,3};
		String arr ="aaaaaggggggggggggg";
		removedup(arr.toCharArray());
	
	}

	private static char[] removedup(char[] str) {
		// TODO Auto-generated method stub
		
		//TC1 null string
		if (str==null) return str;
		//TC2 single char array
		if(str.length<2) return str;
		//creste an array to check for duplictes in the given array
		boolean check[]=new boolean[256];
		//set first char of str to true
		check[str[0]]=true;
		int next=1;
		//iterate over str and update boolean array
		//if duplicte shift it to left
		
		for(int i=1; i<str.length;++i) {
			
			//if this char is duplicate do nothing
			//if this is first occurance of char 
			//then move it to the front of array at next variable position 
			//increment next set boolean array position to true.
			if(!check[str[i]]) {
				str[next]=str[i];
				++next;
				check[str[i]]=true;
			}
		}
		//set all char after variable 'next' to ' ' 
		for(int i=next;i<str.length;i++)
			str[next++]=0;
		
		System.out.println(str);
		return str;
		
	}

}
