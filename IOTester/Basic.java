package IOTester;

import java.io.*;

public class Basic {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the characters that are to be printed, press 'q' to quit...");
		do{
			c = (char)br.read();
			System.out.println(c);
		} while(c != 'q');
		
		System.out.println("Enter a line to read into... along with 'stop' to end the read.");
		String tester;
		do {
			tester = br.readLine();
			System.out.println(tester);
		} while(!tester.equals("stop"));
	}
}
