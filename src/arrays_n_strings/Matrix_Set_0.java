package arrays_n_strings;

import java.util.Arrays;

/*
 * Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column is set to 0.
 * */
public class Matrix_Set_0 {

	public static void main(String []args) {
	int [][]matrix = {
			{1,2,3,4,5,6},
			{1,2,3,4,5,0},
			{1,2,3,4,5,6}
	};
	int [][]result= SetZero(matrix);
	for(int i=0;i<matrix.length;i++)
	System.out.println(Arrays.toString(matrix[i]));
	}

	private static int[][] SetZero(int[][] matrix) {
		// TODO Auto-generated method stub
		int []row=new int [ matrix.length];
		int []col= new int[matrix[0].length];
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[0].length;j++) {
				if(matrix[i][j]==0) {
					//Default for values for row n column array are 0 so set the ones in matrix 0 to 1
					row[i]=1;
					col[j]=1;
					}
			}
		}
	//	System.out.println(Arrays.toString(row));
	//	System.out.println(Arrays.toString(col));
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[0].length;j++) {
				if(row[i]==1||col[j]==1)
					matrix[i][j]=0;
			}}
		
		return matrix;
		
	}
}
