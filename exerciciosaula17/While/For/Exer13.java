/*13. Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro n�mero elevado ao segundo n�mero.
N�o utilize a fun��o de pot�ncia da linguagem. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe o n�mero da base: ");
	int base = scan.nextInt();
	System.out.println("Informe o n�mero do expoente: ");
	int expoente = scan.nextInt();
	
	int resultado = base;
	
		for (int i=1; i<expoente; i++ ) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);

	}
	
}
