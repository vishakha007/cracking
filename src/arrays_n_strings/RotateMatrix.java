package arrays_n_strings;

import java.util.Arrays;

/*
 * Given an image represented by an NxN matrix,
 *  where each pixel in the image is 4
 *  bytes, write a method to rotate the image by 90 degrees
 * 
 * 1  2  3  4			4 8 12 16
 * 5  6  7  8  ===>>>	3 7 11 15 
 * 9 10 11 12			2 6 10 14
 * 13 14 15 16			1 5 9  13
 * 
 * */
public class RotateMatrix {
	public static void main(String []args) {
		int [][]matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int [][]result= Rotate(matrix);
		for(int i=0;i<matrix.length;i++)
		System.out.println(Arrays.toString(matrix[i]));
		}

	private static int[][] Rotate(int[][] matrix) {
		// TODO Auto-generated method stub
		
		//Rotate 90 degrees
		//change rows to columns and they are aligned from last to first
		int []first_row= new int [matrix[0].length];
		//matrix[0][length-1]matrix[1][length-1]matrix[2][length-1]...
		int[][]newm=new int[matrix.length][matrix[0].length];
		
		for(int i=0; i<matrix.length;i++) {
			for(int j=matrix[0].length;j>=0;j--) {
				newm[i][j]=matrix[i][j];
			}
		}
			
		return null;
	}

}
