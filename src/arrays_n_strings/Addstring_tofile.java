package arrays_n_strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Addstring_tofile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addtofile();

}

	private static void addtofile() {
		// TODO Auto-generated method stub
		
		FileWriter fw= null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw= new FileWriter ("C:\\Users\\pravin\\eclipse-workspace\\crackingcoding\\src\\test\\sample.txt",true);
			bw = new BufferedWriter(fw);
			pw =  new PrintWriter(bw);
			pw.println();
			pw.println("Hello");
			System.out.println("Done!!");
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

