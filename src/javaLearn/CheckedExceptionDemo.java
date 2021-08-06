package javaLearn;
import java.io.*;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found");
			//e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			System.out.println("no lines to read");
			//e.printStackTrace();
		}
		System.out.println(input); 
	}

}
