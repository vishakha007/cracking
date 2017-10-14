package arrays_n_strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords_inFile {

	public static void main(String[] args) {
		try {
			countwords();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void countwords() throws IOException {
		try {
			BufferedReader reader =new BufferedReader(new FileReader("C:\\Users\\pravin\\eclipse-workspace\\crackingcoding\\src\\test\\sample.txt"));
			int linecount=0;
			int wordcount=0;
			int charcount=0;
			String line=reader.readLine();
			linecount++;
			while(line != null) {
				String []words= line.split(" ");
				wordcount+=words.length;
				for(String word :words) {
					charcount+=word.length();
					}
			
			line=reader.readLine();
			} 
			System.out.println("Number of lines is  : "+linecount);
			System.out.println("Number of words is  : "+wordcount);
			System.out.println("Number of characters is  : "+charcount);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
