package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int codio, numero;
		double valorUnit, valorTotal;
		
		System.out.println("Digite o c�digo da pe�a, o n�mero de pe�a(s), e o valor unit�rio:");
		codio = sc.nextInt();
		numero = sc.nextInt();
		valorUnit = sc.nextDouble();
		
		valorTotal = valorUnit * numero;
		
		System.out.println("Digite o c�digo da segunda pe�a, o n�mero de pe�a(s), e o valor unit�rio:");
		codio = sc.nextInt();
		numero = sc.nextInt();
		valorUnit = sc.nextDouble();
		
		valorTotal += valorUnit * numero;
		
		System.out.printf("Total a pagar: R$ %.2f", valorTotal);
		
		sc.close();
	}
}
