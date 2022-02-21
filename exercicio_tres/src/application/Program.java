package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = sc.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = sc.nextInt();
		System.out.print("Digite o último valor: ");
		d = sc.nextInt();
				
		diferenca = a * b - c * d;
		
		System.out.println("Difernça = " + diferenca);	
		
		sc.close();
	}
}
