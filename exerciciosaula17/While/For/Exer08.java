/*Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer08 {

public static void main(String[] args) {
			
		Scanner scan = new Scanner (System.in);
			
		double soma = 0;
	 	double media, num;
	 	int cont;
			
			for (cont = 0; cont < 5; cont++) {
			System.out.println("Informe um n�mero: ");
			num = scan.nextInt();

				soma += num;
			
				}
			
			media = soma/cont;
					
			System.out.println("A soma dos n�meros �: " + soma);
			System.out.println("A m�dia dos n�meros �: " + (media));
				
	} 	
						
}





