/*Faça um programa que leia 5 números e informe a soma e a média dos números. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer08 {

public static void main(String[] args) {
			
		Scanner scan = new Scanner (System.in);
			
		double soma = 0;
	 	double media, num;
	 	int cont;
			
			for (cont = 0; cont < 5; cont++) {
			System.out.println("Informe um número: ");
			num = scan.nextInt();

				soma += num;
			
				}
			
			media = soma/cont;
					
			System.out.println("A soma dos números é: " + soma);
			System.out.println("A média dos números é: " + (media));
				
	} 	
						
}





