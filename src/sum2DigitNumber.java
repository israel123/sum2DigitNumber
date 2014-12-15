

import java.util.Scanner;

public class sum2DigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = 26;
		int ones, tens;
		
		ones = num % 10;
		tens = num / 10;
		
		int sumDigits = ones + tens;
		
		System.out.println("The sum of dugits of " + num + " is:" + sumDigits);
		
	}

}
