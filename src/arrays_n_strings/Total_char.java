package arrays_n_strings;
//Write a java program to count the total number of 
//occurrences of a given character in a string without using any loop
public class Total_char {
	public static void main(String []args) {
		System.out.println(char_occ("Super Man Bat Man Spider Man",'a'));
	}

	private static int char_occ(String string,char c) {
		// TODO Auto-generated method stub
		String ch= c+"";
		 int count = string.length()-string.replace(ch, "").length();
		 return count;
	}

}
