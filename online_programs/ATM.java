/*
Pooja would like to withdraw X $US from an ATM.
The cash machine will only accept the transaction if X is a multiple of 5,
and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
*/

import java.util.*;

public class ATM{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double with_amt, bal_amt;
		with_amt = sc.nextDouble();
		bal_amt = sc.nextDouble();
		if(with_amt%5 == 0 && bal_amt >= (with_amt + 0.5)){
			bal_amt = bal_amt - with_amt - 0.5;
		}
		System.out.println(bal_amt);
		sc.close();
	}
}