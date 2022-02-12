package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int value1, value2, sum;
		
		System.out.print("Enter first value: ");
		value1 = sc.nextInt();
		System.out.print("Enter second value: ");
		value2 = sc.nextInt();
		
		sum =  value1 + value2;
		
		System.out.println("Sum = " + sum);
		
		sc.close();
	}
}
