package Assignment_22_05;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int reverse = 0;
		int original = num;
		while(num>0) {
			int digit = num % 10;
			reverse = reverse*10+digit;
			num=num/10;
		}
		
		if (original == reverse) {
			
			System.out.println("Palindrome number");
			
		}else {
			System.out.println("Not a Palindrome");
		}
           sc.close();
	}

}
