package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with first number: ");
		Double n1 = sc.nextDouble();
		System.out.print("Enter with second number: ");
		Double n2 = sc.nextDouble();		
		Double sum = n1 + n2;
		System.out.println("Sum: " + sum);
		
		/*----------------------------------------------*/
		
		System.out.print("Informe o raio do circulo: ");
		Double raio = sc.nextDouble();
		Double area = 3.14159 * (raio*raio);
		System.out.print("�rea: " + area);
		sc.close();

	}

}
