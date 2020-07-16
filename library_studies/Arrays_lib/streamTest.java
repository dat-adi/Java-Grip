package library_studies.Arrays_lib;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class streamTest {
	private static void stream_out(){
		String[] str = {"A", "Fine", "Day"};
		Stream<String> stream = Arrays.stream(str);
		stream.forEach(System.out::print);
	}
	
	private static void convert(){
		List<String> list = Arrays.asList("3", "6", "8", "14", "15");
		list.stream().mapToInt(Integer::parseInt)
					.filter(s -> s%5 == 0)
					.forEach(System.out::println);
	}
	
	private static void split(){
		String str = "Happy Happy Boi";
		String[] strs = str.split(" ");
		for(String s: strs){
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		stream_out();
		convert();
		split();
	}
}
