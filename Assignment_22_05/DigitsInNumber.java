package Assignment_22_05;

import java.util.Scanner;

public class DigitsInNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =0;
		int count=0;
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		if (num==0) {
			count=1;
		}else while (num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("Count of digit is " +count);
		sc.close();

	}

}
