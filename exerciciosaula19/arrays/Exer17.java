/*Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos. */

package br.com.exerciciosaula19.arrays;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		int quant = 0;
		
		for(int i=0; i<idades.length; i++) {
			System.out.println("Entre com a idade da pessoa: " + (i+1));
			idades[i] = scan.nextInt();	
			
			if(idades[i]> 35) {
				++quant;
				
			}
		}
		
		System.out.print("Vetor A: ");	
		for(int i=0; i<idades.length; i++) {
			System.out.print(idades[i] + " ");	
		}
		
		System.out.println();
		System.out.println("Qauntidade de pessoas maior de 35 anos: " + quant);
		
	}

}
