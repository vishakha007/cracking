package arrays_n_strings;
/*Write a java program to find common elements between two arrays?
 * */
public class CommonEle_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,5,6,7};
		int a2[] = {8,9,2,2};
		common(a1, a2);
	}

	private static void common(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		if(a1==null || a2==null||a1.length==0||a2.length==0)
			return ;
		for(int i=0;i<a1.length;i++) {
			for(int j=0; j<a2.length;j++)
				if(a1[i]==a2[j])
					System.out.println(a1[i]);
		}
	}

}
