package arrays_n_strings;
/*
 * Write code to reverse a C-Style String. 
 * (C-String means that “abcd” is represented as
five characters, including the null character
 * */
public class ReverseSrtring {
	public static void main(String args[]) {
		
		ReverseSrtring r=new ReverseSrtring();
		System.out.println(r.reverse("asdf dfgh"));
		
		
	}

	public String reverse(String s) {
		// TODO Auto-generated method stub
		if (s == null)
			return null;
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i>=0;i--) {
			sb.append(s.charAt(i));
			}
		return sb.toString();
	}
}
