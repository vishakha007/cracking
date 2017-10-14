package arrays_n_strings;
//Write a java program to count the number of words in a string
public class Words_in_String {
	public static void main(String []args) {
		count("Super Man Bat Man Spider Man");
	}

	private static void count(String string) {
		// TODO Auto-generated method stub
		String [] arr= string.trim().split(" ");
		System.out.println(arr.length);
	}

}
