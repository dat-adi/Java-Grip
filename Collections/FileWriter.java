package Collections;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	public static void main(String[] args) throws IOException {
		int i;
		
		if(args.length != 2){
			System.out.println("Usage: CopyFile from to");
			return;
		}
		try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])){
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(FileNotFoundException e) {
			System.out.println("File not found.");
		} catch(IOException e){
			System.out.println("I/O Error: " + e);
		}
	}
}
