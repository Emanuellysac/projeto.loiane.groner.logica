/*14. Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares. */

package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i<10; i++) {
			
			System.out.println("Informe um n�mero: ");
			int num = scan.nextInt();
			
				if (num % 2 == 0) {
					par++;	
						System.out.println(num + " � par!");
					
				} else {
					impar++;
						System.out.println(num + " � �mpar!");	
				}		
		}	
		
			System.out.println("Qauntidade de n�meros pares: " + par);
			System.out.println("Qauntidade de n�meros impares: " + impar);
	}
}
