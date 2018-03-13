/*Faça um programa que leia 5 números e informe o maior número.*/


package br.com.exerciciosaula17.While.For;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int maior = Integer.MIN_VALUE;
		int num;
		
		for (int cont = 0; cont <=5; cont++) {
		System.out.println("Informe um número: ");
		num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
			}
			
		} 	System.out.println("O número maior é: " + maior);
				
		
	}

}
