/*13. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe o número da base: ");
	int base = scan.nextInt();
	System.out.println("Informe o número do expoente: ");
	int expoente = scan.nextInt();
	
	int resultado = base;
	
		for (int i=1; i<expoente; i++ ) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);

	}
	
}
