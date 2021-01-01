package LeetCode;

import java.util.*;

class StaticInitializer{
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag;
    static{    
        if(B >= 0 && H >= 0)flag = true;
        else{
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    } 
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}