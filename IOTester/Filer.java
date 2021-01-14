package IOTester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filer {
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