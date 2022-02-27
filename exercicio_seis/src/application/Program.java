package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo; 
		
		System.out.println("Digite os valores de A, B e C:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTrianguloRetangulo = a * c / 2;
		areaCirculo = PI * c * c;
		areaTrapezio = (a + b) * c / 2;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.println();
		System.out.printf("Triangulo: %.3f\n", areaTrianguloRetangulo);
		System.out.printf("Circulo: %.3f\n", areaCirculo);
		System.out.printf("Trapezio: %.3f\n", areaTrapezio);
		System.out.printf("Quadrado: %.3f\n", areaQuadrado);
		System.out.printf("Retangulo: %.3f\n", areaRetangulo);
		
		sc.close();
	}
}
