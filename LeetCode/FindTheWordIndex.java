package LeetCode;

import java.util.*;

class FindTheWordIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String input_line = sc.nextLine();
		boolean check = false;
		String done = "u";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			} else if(str.charAt(i) == input_line.charAt(0)) {
				try {
					for (int j = 0; j < input_line.length(); j++) {
						check = str.charAt(i + j) == input_line.charAt(j);
					}
				} catch (StringIndexOutOfBoundsException e){
					System.out.println("Not found");
					done = "et";
				}
				if(check) {
					System.out.println(count);
					done = "et";
					break;
				}
			}
		}
		if (done.equals("u")) {
			System.out.println("Not found");
		}
	}
}
