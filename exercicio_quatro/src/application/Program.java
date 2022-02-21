package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber, hours;
		double valuePerHour, salary;
		
		System.out.print("Enter the employee number: ");
		employeeNumber = sc.nextInt();
		System.out.print("Enter the hours worked: ");
		hours = sc.nextInt();
		System.out.print("Enter the value per hours: ");
		valuePerHour = sc.nextDouble();
		
		salary = hours * valuePerHour;
		
		System.out.println();
		System.out.println("Number: " + employeeNumber);
		System.out.printf("Salary: U$ %.2f", salary);
		
		sc.close();
	}
}
