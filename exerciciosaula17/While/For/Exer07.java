/*Fa�a um programa que leia 5 n�meros e informe o maior n�mero.*/


package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int maior = Integer.MIN_VALUE;
		int num;
		
		for (int cont = 0; cont <=5; cont++) {
		System.out.println("Informe um n�mero: ");
		num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
			}
			
		} 	System.out.println("O n�mero maior �: " + maior);
				
		
	}

}
