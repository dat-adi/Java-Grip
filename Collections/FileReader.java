package Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Testing this program would require you to create the class file and the text file location in the same directory.
public class FileReader {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		
		if(args.length != 1){
			System.out.println("Usage: Filer Filename");
			return;
		}
		
		try{
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException e){
			System.out.println("This file cannot be opened, or not found.");
			return;
		}
		
		try{
			do{
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			} while(i != -1);
		} catch(IOException e){
			System.out.println("Error reading file.");
		}
		
		try{
			fin.close();
		} catch(IOException e){
			System.out.println("Error closing the file.");
		}
	}
}