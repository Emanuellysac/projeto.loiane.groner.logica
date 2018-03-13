/*14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i<10; i++) {
			
			System.out.println("Informe um número: ");
			int num = scan.nextInt();
			
				if (num % 2 == 0) {
					par++;	
						System.out.println(num + " é par!");
					
				} else {
					impar++;
						System.out.println(num + " é ímpar!");	
				}		
		}	
		
			System.out.println("Qauntidade de números pares: " + par);
			System.out.println("Qauntidade de números impares: " + impar);
	}
}
