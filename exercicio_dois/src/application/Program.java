package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius, area;
		
		System.out.print("Enter radius value: ");
		radius = sc.nextDouble();
		
		area = PI * radius * radius;
		
		System.out.printf("Area = %.4f", area);
		
		sc.close();
	}
}
