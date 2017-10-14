package arrays_n_strings;

/*
 * An element in an array is majority element if it occurs
 *  more than half times of size of the array.
 *  Print majority element in array if present or print NONE
 * */
//Boyer Moore Algorithm
public class MajorityElement {
	public static void main(String []args) {
		int arr[] = {1,2,3,4,5,5,5,5,5,5,7,7,7};
		System.out.println(BoyerMoore(arr));
	}

	private static Integer BoyerMoore(int[] arr) {
		// TODO Auto-generated method stub
		//
		int ele =arr[0];
		int len = 0;
		for(int i= 0 ;i<arr.length;i++) {
		if (len==0) {
			ele=arr[i];
			len++;
		}
		else {
			if(ele==arr[i])
				len++;
			else
				len--;
		}
		}
		if(len==0)
		{	
			System.out.println("NONE");
			return null;
		}
		len=0;
		for(int i =0; i<arr.length;i++) {
			if(ele==arr[i])
				len++;
		}
		return (len>arr.length/2)?ele:null;
	}

	
}
