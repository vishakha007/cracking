package arrays_n_strings;
/*
Implement an algorithm to determine if a string 
has all unique characters.
What if you can not use additional data structures?
*/

public class UniqueChars {

	public boolean isUniq(String s) {
		boolean ret=false;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				if(i==j)
					continue;
				if(s.charAt(i)==s.charAt(j))
					ret=true;
			}	
		}
		return ret;
	}
	public boolean uniqstring(String s) {
		boolean [] ch= new boolean [256];
		
		for(int i =0; i<s.length();i++) {
			int val =s.charAt(i);
			if(ch[val])
				return false;
			ch[val]=true;
		}
		return true;
	}
	
	public boolean uniq(String s) {
		int val=0;
		for(int i= 0; i<s.length();i++)
		{
			int c= s.charAt(i)-'a';
			if((val & (1<<c)) >0 ) return false;
			val |= (1<<c);
		}
		return true;
	}
	public static void main(String args[]) {
		UniqueChars u=new UniqueChars();
		System.out.println(u.isUniq("asdf"));
		
		
	}
}
